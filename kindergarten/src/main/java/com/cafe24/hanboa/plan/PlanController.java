package com.cafe24.hanboa.plan;

import java.util.List;
import java.util.Map;

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

@Controller
public class PlanController {
	@Autowired
	public PlanService planService;
	private static final Logger logger = LoggerFactory.getLogger(PlanController.class);
	
	// 계획안 카테고리
	// 1. 계획안 카테고리 등록 요청
	@RequestMapping(value="/PlanCategoryAdd", method=RequestMethod.GET)
	public String PlanCategoryInsert(HttpSession session, Teacher teacher) {
		Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
		// loginTeacher객체에 session에 담긴 loginTeacher의 값을 담는다.
		if(loginTeacher == null) {
			// loginTeacher의 값이 null이라면 login화면으로
			return "redirect:/Login";
		}
		logger.debug("1. ProgramController.java ProgramInsert()메소드 실행 ");
		logger.debug("------------------------------------------------------------");
		return "plan/plan_category_add";
	}
	// 1-2. 계획안 카테고리 등록
	@RequestMapping(value="/PlanCategoryAdd", method=RequestMethod.POST)
	public String PlanCategoryInsert(PlanCategory planCategory) {
		planService.insertPlanCategory(planCategory);
		logger.debug("{} <- PlanCategoryInsert PlanController.java", planCategory);
		return "redirect:/PlanCategoryList";
	}
	// 2. 계획안 카테고리 전체조회+검색
	@RequestMapping(value="/PlanCategoryList", method=RequestMethod.GET)
	public String PlanCategoryList(Model model
								, @RequestParam(value="keyword", required = false) String keyword) {
		logger.debug("2. PlanController.java PlanCategoryList()메소드 실행 ");
		Map<String, Object> map = planService.selectPlanList(keyword);
		List<PlanCategory> list = (List<PlanCategory>)(map.get("list"));
		String searchKeyword = (String)map.get("keyword");
		model.addAttribute("keyword", searchKeyword);
		model.addAttribute("list", list);
		logger.debug("{} <- list PlanController.java", list);
		logger.debug("{} <- searchKeyword PlanController.java", searchKeyword);
		logger.debug("------------------------------------------------------------");
		return "plan/plan_category_list";
	}
}
