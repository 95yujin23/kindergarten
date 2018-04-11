package com.cafe24.hanboa.safety;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.hanboa.teacher.Teacher;
import com.cafe24.hanboa.totalResource.TotalResource;
import com.cafe24.hanboa.totalResource.TotalResourceService;


@Controller
public class SafetyController {
	@Autowired
	private SafetyService safetyService;
	
	private static final Logger logger = LoggerFactory.getLogger(SafetyController.class);
	
	//1. 안전교육및점검 목록 조회 (연도 & 구분 별)
	@RequestMapping(value="/SafetyList")
	public String safetyList(Model model, HttpSession session
						 	,@RequestParam(value="year", defaultValue="") String year
						 	,@RequestParam(value="division", defaultValue="") String division) {
							//"year", "division"의 value값을 각 각 변수에 받아서 담는다.
	logger.debug("1. SafetyController -- SafetyList");
	logger.debug("year : {}", year);
	logger.debug("division : {}", division);
	HashMap<String, Object> map = new HashMap<String, Object>();
	map.put("year", year);
	map.put("division", division);
	logger.debug("map : {}", map);
	// 변수에 담은 값을 map안에 집어넣는다.
	List<SafetyAndTotalResource> list = safetyService.getSafetyList(map);
	// list 객체를 만들어 getSafetyList 매서드 호출, 값이 담긴 map을 넘겨준다.
	logger.debug("list : {}",list);
	model.addAttribute("list",list);
	logger.debug("----------------------------------------");
		return "safety/safety_list";
	}
	
	//2-1. 안전교육및점검 등록 화면
	@RequestMapping(value="/SafetyAdd", method = RequestMethod.GET)
	public String safetyAdd(Model model) {
	logger.debug("2-1. SafetyController -- SafetyAddForm");
	TotalResourceService totalResourceService = new TotalResourceService();
	List<TotalResource> list = totalResourceService.getTotalResourceList();
	//totalResource에서 통합자원코드, 통합자원코드그룹명, 코드명 가져오기
	logger.debug("----------------------------------------");
	model.addAttribute("list",list);
		return "safety/safety_add";
	}
	
	//2-2. 안전교육및점검 등록
	@RequestMapping(value="/SafetyAdd", method = RequestMethod.POST )
	public String safetyAdd(Model model, HttpSession session, Safety safety) {
	logger.debug("2-2. SafetyController -- SafetyAdd");	
	Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
	// loginTeacher객체에 session에 담긴 loginTeacher의 값을 담는다.
	logger.debug("loginTeacher : {}", loginTeacher);
	if(loginTeacher == null) {
		// loginTeacher의 값이 null이라면 login화면으로
		return "redirect:/";
	}
	// null이 아니라면 loginTeacher세션에서 라이센스를 받아서 safety객체에 셋팅한다.
	safety.setLicenseKindergarten(loginTeacher.getLicenseKindergarten());
	logger.debug("safety : {}", safety);
	safetyService.addSafety(safety);
	logger.debug("----------------------------------------");
		return null;
	}
	
	//1. 안전교육및점검 수정 화면
	@RequestMapping(value="/SafetyModify", method = RequestMethod.GET)
	public String safetyModify() {
		return null;
	}
	
	//1. 안전교육및점검 수정
	@RequestMapping(value="/SafetyModify", method = RequestMethod.POST)
	public String safetyModify(Model model) {
		return null;
	}
	
	//1. 안전교육및점검 삭제
	@RequestMapping(value="/SafetyRemove")
	public String safetyRemove() {
		return null;
	}
}
