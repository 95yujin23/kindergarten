package com.cafe24.hanboa.classformation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe24.hanboa.report.ReportController;
import com.cafe24.hanboa.teacher.Teacher;


@Controller
public class ClassController {
	//반 관련 컨트롤러
	
	
	@Autowired
	private ClassService classService;
	private static final Logger logger = LoggerFactory.getLogger(ClassController.class);
	
		//반 리스트 출력
		@RequestMapping(value="/KidsClass")
		public String classSettingList(Model model) {
			List<KidsClass> list = classService.selectKidsClassList();
			model.addAttribute("list", list);
			return "class/class_setting";
		}
		//반 추가
		@RequestMapping(value="/addKidsClass", method=RequestMethod.POST)
		public String addKidsClass(KidsClass kidsClass, HttpSession session) {
			// loginTeacher에 선생님의 세션 정보를 받아온다.
			Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
			// loginTeacher에 담긴 정보를 확인한다.
			logger.debug("loginTeacher is : {}", loginTeacher);
			if(loginTeacher == null) {
				// loginTeacher의 값이 null이면 Login화면으로 페이즈를 전환
				return "redirect:/Login";
			}
			// loginTeacher안에 담긴 값이 null이 아니라면 loginTeacher세션에서 등록자의 라이센서를 받아서 class객체에 셋팅한다.
			kidsClass.setLicenseKindergarten(loginTeacher.getLicenseKindergarten());
			classService.addKidsClass(kidsClass);
			return "redirect:/KidsClass";
		}
		// 반 수정
		@RequestMapping(value="/modifyKidsClass", method=RequestMethod.POST)
		public String modifyKidsClass(KidsClass kidsClass) {
			classService.modifyKidsClass(kidsClass);
			return "redirect:/KidsClass";
		}
		// 반 삭제
		@RequestMapping(value="/removeKidsClass", method=RequestMethod.GET)
		public String removeKidsClass(KidsClass kidsClass) {
			classService.removeKidsClass(kidsClass);
			return "redirect:/KidsClass";
		}
		// 반 편성 화면
		@RequestMapping(value="/KidsClassFormation")
		public String kidsClassFormation(Model model) {
			return "class/kids_class_formation";
		}
		
		//반 편성 화면 list (편성된 아이들 보여주기)
		@RequestMapping(value="/formationKidsList")
		public @ResponseBody Object getRecordList(HttpServletRequest request,
				   								HttpServletResponse response,
				   								@ModelAttribute("KidsFormation") KidsFormation kidsformation) {
			logger.debug("ClassController kidsClassFormation() 메소드 실행");
			
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("data", classService.kidsFormationList(kidsformation));
			Object result = map;
			return result;
		}
		
		// 반 편성 화면 list 미편성 아이들 보여주기
		@RequestMapping(value="/unformationkids")
		public @ResponseBody Object getUnformationkids(HttpServletRequest request,
				   								HttpServletResponse response,
				   								@ModelAttribute("KidsFormation") KidsFormation kidsformation) {
			logger.debug("ClassController getUnformationkids() 메소드 실행");
			
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("data", classService.unformationkids(kidsformation));
			Object unFormationKids = map;
			return unFormationKids;
		}
		
		
		//반 관리 추가
		@RequestMapping(value="/addUnClassification", method=RequestMethod.POST)
		public String addKidsClass(Model model,ClassFormation classFormation
								,@RequestParam(value="kidsCd" ) String kidsCd) {
			logger.debug("ClassController addKidsClass() 메소드 실행");
			logger.debug("ClassController addKidsClass() RepuestParam kidsCd is : {} ", kidsCd);
			classService.addUnClassification(classFormation);
			
			return "redirect:kids_class_formation";
		}
		
		/*//반편성 분류된 유아 리스트
		@RequestMapping(value="/unFormationKidsList", method=RequestMethod.GET)
		public String unFormationKidsList(Model model, KidsFormation kidsformation) {
			logger.debug("ClassController unFormationKidsList() 메소드 실행");
			List<KidsFormation> list = classService.unformationkids(kidsformation);
			
			model.addAttribute("list",list);
			return "result";
			
		}*/
		

}
