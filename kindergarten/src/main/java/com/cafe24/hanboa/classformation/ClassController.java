package com.cafe24.hanboa.classformation;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.hanboa.report.ReportController;


@Controller
public class ClassController {
	//반 관련 컨트롤러
	
	//반 리스트 출력
	@Autowired
	private ClassService classService;
	private static final Logger logger = LoggerFactory.getLogger(ClassController.class);
	
	
		@RequestMapping(value="/KidsClass")
		public String classSettingList(Model model) {
			
			List<KidsClass> list = classService.selectKidsClassList();
			
			model.addAttribute("list", list);
			
			return "class/class_setting";
		}
	
		//반 편성 화면
		@RequestMapping(value="/KidsClassFormation")
		public String kidsClassFormation() {
			return "class/kids_class_formation";
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

}
