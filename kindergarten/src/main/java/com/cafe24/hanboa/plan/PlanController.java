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

import com.cafe24.hanboa.classformation.KidsClass;
import com.cafe24.hanboa.teacher.Teacher;

@Controller
public class PlanController {
	@Autowired
	public PlanService planService;
	private static final Logger logger = LoggerFactory.getLogger(PlanController.class);
	
	// 계획안
	// 1-1. 계획안 등록을 위한 계획안 카테고리, 영유아 반 불러오기 및 입력 요청
	@RequestMapping(value="/PlanAdd", method=RequestMethod.GET)
	public String PlanInsert(Model model) {
		List<PlanCategory> plancate = planService.callPlanCategory();
		List<KidsClass> kidClass = planService.callKidsClass();
		model.addAttribute("plancate", plancate);
		model.addAttribute("kidClass", kidClass);
		logger.debug("1. PlanController.java PlanInsert()메소드 실행 ");
		logger.debug("------------------------------------------------------------");
		return "plan/plan_add";
	}
	// 1-2. 계획안 등록 입력
	@RequestMapping(value="/PlanAdd", method=RequestMethod.POST)
	public String PlanInsert(HttpSession session, Teacher teacher, Plan plan) {
		Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
		// loginTeacher객체에 session에 담긴 loginTeacher의 값을 담는다.
		if(loginTeacher == null) {
			// loginTeacher의 값이 null이라면 login화면으로
			return "redirect:/Login";
		}
		plan.setLicenseKindergarten(loginTeacher.getLicenseKindergarten());
		planService.insertPlan(plan);
		logger.debug("{} <- PlanInsert PlanController.java", plan);
		return "redirect:/PlanList";
	}
	// 2. 계획안 전체조회+검색+페이징
	@RequestMapping(value="/PlanList", method=RequestMethod.GET)
	public String PlanList(Model model
						, @RequestParam(value="keyword", required = false) String keyword
						, @RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage
						, @RequestParam(value = "pagePerRow", required = false, defaultValue = "10") int pagePerRow) {
		logger.debug("2. PlanController.java PlanList()메소드 실행 ");
		logger.debug("{} <- currentPage PlanList PlanController.java", currentPage);
		logger.debug("{} <- pagePerRow PlanList PlanController.java", pagePerRow);
		logger.debug("{} <- keyword PlanList PlanController.java", keyword);
		Map<String, Object> map = planService.selectPlanList(currentPage, pagePerRow, keyword);
		List<Plan> list = (List<Plan>)(map.get("list"));
		int countPage = (Integer)map.get("countPage");
		String searchKeyword = (String)map.get("keyword");
		model.addAttribute("list", list);
		model.addAttribute("countPage", countPage);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("keyword", searchKeyword);
		logger.debug("{} <- list PlanList PlanController.java", list);
		logger.debug("------------------------------------------------------------");
		return "plan/plan_list";
	}
	// 3. 계획안 개별 조회
	@RequestMapping(value="/PlanDetail", method=RequestMethod.GET)
	public String PlanListOne(Model model
						, @RequestParam(value="planCd", required = true) String planCd
						, @RequestParam(value="planCateCd", required = true) String planCateCd
						, @RequestParam(value="kidsClassCd", required = true) String kidsClassCd) {
		logger.debug("{} <- planCd PlanListOne PlanController.java", planCd);
		Plan plan = planService.getPlanOne(planCd);
		PlanCategory planCategory = planService.callPlanCategoryOne(planCateCd);
		KidsClass kidsClass = planService.callKidsClassOne(kidsClassCd);
		logger.debug("{} <- plan PlanListOne PlanController.java", plan);
		model.addAttribute("plan", plan);
		model.addAttribute("planCategory", planCategory);
		model.addAttribute("kidsClass", kidsClass);
		return "plan/plan_detail";
	}
	
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
	// 2. 계획안 카테고리 전체조회+검색+페이징
	@RequestMapping(value="/PlanCategoryList", method=RequestMethod.GET)
	public String PlanCategoryList(Model model
								, @RequestParam(value="keyword", required = false) String keyword
								, @RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage
								, @RequestParam(value = "pagePerRow", required = false, defaultValue = "10") int pagePerRow) {
		logger.debug("2. PlanController.java PlanCategoryList()메소드 실행 ");
		logger.debug("{} <- currentPage PlanCategoryList PlanController.java", currentPage);
		logger.debug("{} <- pagePerRow PlanCategoryList PlanController.java", pagePerRow);
		logger.debug("{} <- keyword PlanCategoryList PlanController.java", keyword);
		Map<String, Object> map = planService.selectPlanCategoryList(currentPage, pagePerRow, keyword);
		List<PlanCategory> list = (List<PlanCategory>)(map.get("list"));
		int countPage = (Integer)map.get("countPage");
		String searchKeyword = (String)map.get("keyword");
		model.addAttribute("list", list);
		model.addAttribute("countPage", countPage);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("keyword", searchKeyword);
		logger.debug("{} <- list PlanCategoryList PlanController.java", list);
		logger.debug("------------------------------------------------------------");
		return "plan/plan_category_list";
	}
	// 3. 계획안 카테고리 삭제
	@RequestMapping(value="/PlanCategoryDelete", method=RequestMethod.GET)
	public String planCategoryDelete(HttpSession session, Teacher teacher, @RequestParam(value = "planCateCd", required = true) String planCateCd) {
		Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
		// loginTeacher객체에 session에 담긴 loginTeacher의 값을 담는다.
		if(loginTeacher == null) {
			// loginTeacher의 값이 null이라면 login화면으로
			return "redirect:/Login";
		}
		planService.planCategoryDelete(planCateCd);
		logger.debug("3. PlanController.java planCategoryDelete()메소드 실행 ");
		logger.debug("------------------------------------------------------------");
		return "redirect:/PlanCategoryList";
	}
}
