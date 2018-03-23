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
import org.springframework.web.bind.annotation.RequestParam;


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
	logger.debug("1. SafetyController -- year : {}", year);
	logger.debug("division : {}", division);
	HashMap<String, Object> map = new HashMap<String, Object>();
	map.put("year", year);
	map.put("division", division);
	logger.debug("map : {}", map);
	// 변수에 담은 값을 map안에 집어넣는다.
	List<Safety> list = safetyService.getSafetyList(map);
	// list 객체를 만들어 getSafetyList 매서드 호출, 값이 담긴 map을 넘겨준다.
	logger.debug("list : {}",list);
	model.addAttribute("list",list);
	logger.debug("----------------------------------------");
		return "safety/safety_list";
	}
	//1. 안전교육및점검 등록 화면
	//1. 안전교육및점검 등록
	//1. 안전교육및점검 수정 화면
	//1. 안전교육및점검 수정
	//1. 안전교육및점검 삭제
	//1. 안전교육및점검 목록 조회 (연도 & 구분 별)
}
