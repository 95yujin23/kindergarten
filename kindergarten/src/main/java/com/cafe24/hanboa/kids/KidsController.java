package com.cafe24.hanboa.kids;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.hanboa.teacher.Teacher;


@Controller

public class KidsController {
	
	@Autowired
	private KidsService kidsService;
	
	private static final Logger logger = LoggerFactory.getLogger(KidsController.class);
	
	// 1-1. 영유아 전체 조회
	/*@RequestMapping(value="/KidsList")
	public String kidsList(Model model) {
		List<Kids> list = kidsService.getKidsList();
		logger.debug("KidsList : {}", list);
		logger.debug("----------------------------------------");
		model.addAttribute("list",list);
		return "kids/kids_list";
	}*/
	// 1-1. 영유아 전체 조회
		@RequestMapping(value="/KidsList")
		public String kidsList(Model model) {
			List<KidsAndKidsFile> list = kidsService.getKidsAndKidsFileList();
			logger.debug("List<KidsAndKidsFile> list : {}", list);
			logger.debug("----------------------------------------");
			model.addAttribute("list", list);
			/*model.addAttribute("map1",map.get(kidsList));
			model.addAttribute("map2",map.get(kidsFile));*/
			return "kids/kids_list";
	}
	
	// 1. 영유아 목록 반별 조회
	@RequestMapping(value="/KidsListByClass")
	public String kidsListByClass(Model model, HttpSession session
						, @RequestParam(value="keyword", defaultValue="") String keyword) {
							//String타입의 keyword변수에 "keyword" value값을 받아옴, 기본값은 ""(공백)
		logger.debug("1. KidsController -- Keyword : {}", keyword);
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("keyword", keyword);
		//map 객체 생성, map안에 keyword value값 담기
		List<Kids> list = kidsService.getKidsListByClass(map);
		logger.debug("KidsList : {}", list);
		logger.debug("----------------------------------------");
		model.addAttribute("list",list);
		return "kids/kids_list_by_class";
	}
	
	// 2. 영유아 편성 반별 조회 (교직원)
	@RequestMapping(value="/KidsListByTeacher")
	public String kidsListByTeacher(Model model, HttpSession session, Teacher teacher) {
		Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
		// loginTeacher객체에 session에 담긴 loginTeacher의 값을 담는다.
		if(loginTeacher == null) {
			// loginTeacher의 값이 null이라면 login화면으로
			return "redirect:/Login";
		}
		teacher.setTeacherCd(loginTeacher.getTeacherCd());
		// null이 아니라면 loginTeacher세션에서 선생님코드를 받아서 teacher객체에 셋팅한다.
		logger.debug("2. KidsController -- KidsListByClass : {}", teacher);
		List<Kids> list = kidsService.getKidsListByTeacher(loginTeacher);
		logger.debug("List<Kids> : {}",list);
		logger.debug("----------------------------------------");
		model.addAttribute("list",list);
		return "kids/kids_list_by_teacher";
	}
	
	// 3. 영유아 개인 조회
	@RequestMapping(value="/kidsinfo")
	public String kidsAndKidsFileOne(@RequestParam(value="kidsCd", required=true) String kidsCd,HttpSession session, Model model) {
		KidsAndKidsFile kidsAndKidsFile = kidsService.getKidsAndKidsFileOne(kidsCd);
		logger.debug("2. KidsController -- kidsAndKidsFileOne(String kidsCd) : {}", kidsCd);
		logger.debug("2. KidsAndKidsFile : {}", kidsAndKidsFile);
		logger.debug("----------------------------------------");
		model.addAttribute("kidsAndKidsFile",kidsAndKidsFile);
		return "/kids/kids_select";
	}
	
	// 4-1. 영유아 등록 화면
	@RequestMapping(value="/KidsAdd", method = RequestMethod.GET)
	public String kidsAdd() {
		logger.debug("4-1. KidsController -- KidsAddForm");
		logger.debug("-----------------------------------------");
		return "kids/kids_add";
		}	
	
	// 4-2. 영유아 등록
	@RequestMapping(value="/KidsAdd", method = RequestMethod.POST)
	public String kidsAdd(Model model, HttpSession session, KidsCommand kidsCommand) throws IOException {
		logger.debug("4-2. KidsController -- KidsAdd");
		//resource 폴더 경로
		//String path = "c:\\upload\\kids";
		String path = session.getServletContext().getRealPath("/");
		// "/"의 실제경로를 받아오는 RealPath매서드 실행
		logger.debug("path : {}",path);
		path += "resources/upload/kids/"; //kids파일 경로 더해줌
		Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
		// loginTeacher객체에 session에 담긴 loginTeacher의 값을 담는다.
		logger.debug("loginTeacher : {}", loginTeacher);
		if(loginTeacher == null) {
			// loginTeacher의 값이 null이라면 login화면으로
			return "redirect:/Login";
		}
		// null이 아니라면 loginTeacher세션에서 라이센스를 받아서 kids객체에 셋팅한다.
		kidsCommand.setLicenseKindergarten(loginTeacher.getLicenseKindergarten());
		logger.debug("kidsCommand : {}", kidsCommand);
		kidsService.addKids(kidsCommand, path);
		logger.debug("-----------------------------------------");
		return "redirect:/";
		}	
	
	// 5-1. 영유아 수정 화면
	@RequestMapping(value="/KidsModify", method = RequestMethod.GET)
	public String kidsModify(Model model, String kidsCd, HttpSession session) {
		logger.debug("5-1. KidsController -- KidsModifyForm : {}",kidsCd);
		//kidsCd로 영유아 정보 가져와서 화면에 뿌려주기
		//Kids kids = kidsService.getKidsOne(kidsCd);
		KidsAndKidsFile kidsAndKidsFile = kidsService.getKidsAndKidsFileOne(kidsCd);
		logger.debug("Kids kids : {}", kidsCd);
		model.addAttribute("kids",kidsAndKidsFile);
		logger.debug("-----------------------------------------");
		return "kids/kids_modify";
		}
	
	// 5-2. 영유아 수정
	@RequestMapping(value="/KidsModify", method = RequestMethod.POST, consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
	public String kidsModify(Model model, KidsCommand kidsCommand, HttpSession session) {
		logger.debug("5-2. KidsController -- KidsModify : {}",kidsCommand);
		//resource 폴더 경로
		//String path = "c:\\upload\\kids";
		String path = session.getServletContext().getRealPath("/");
		// "/"의 실제경로를 받아오는 RealPath매서드 실행
		logger.debug("path : {}",path);
		path += "resources/upload/kids/"; //kids파일 경로 더해줌
		//kidsService.modifyKids(kids);
		kidsService.modifyKidsAndKidsFile(kidsCommand, path);
		logger.debug("-----------------------------------------");
		return "redirect:/";
		}
	
	// 6. 영유아 삭제
	@RequestMapping(value="/KidsRemove", method = RequestMethod.GET)
	public String kidsRemove(String kidsCd) {
		logger.debug("6. KidsController -- KidsRemove : {}",kidsCd);
		kidsService.removeKids(kidsCd);
		logger.debug("-----------------------------------------");
		return "redirect:/";
		}
}
