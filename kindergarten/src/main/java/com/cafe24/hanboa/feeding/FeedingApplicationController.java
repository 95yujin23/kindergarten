package com.cafe24.hanboa.feeding;

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

import com.cafe24.hanboa.kids.Kids;
import com.cafe24.hanboa.teacher.Teacher;

@Controller
public class FeedingApplicationController {
	@Autowired
	private FeedingApplicationService feapService;	
	private static final Logger logger = LoggerFactory.getLogger(FeedingApplicationController.class);
	
	//1. 목록조회
	@RequestMapping(value="/FeedingApplicationList")
	public String feedingApplicationList(Model model, HttpSession session) {
		List<FeedingApplication> list = feapService.getFeedingApplicationList();
		logger.debug("{} <- list FeedingApplicationController.java",list);
		model.addAttribute("list",list);		
		return "feeding/feedingApplication_list";
	}
	
	//2.수정 정보요청
	@RequestMapping(value="/feeding/feedingApplication_modify",method=RequestMethod.GET)
	public String feedingApplicationModify(Model model, @RequestParam(value="feedingApplicationCd", required=true) String feedingApplicationCd) {
		FeedingApplication feedingApplication = feapService.modifyGetfeap(feedingApplicationCd);
		model.addAttribute("feedingApplication", feedingApplication);
		logger.debug("{} <- feedingApplication FeedingApplicationController.java",feedingApplicationCd);
		logger.debug("{} <- feedingApplication FeedingApplicationController.java",feedingApplication);
		return "feeding/feedingApplication_modify";
	}
	
	// 3.수정 처리요청
	@RequestMapping(value="/feeding/feedingApplication_modify", method = RequestMethod.POST)
	public String feedingApplicationModify(FeedingApplication feedingApplication) {
		feapService.modifyFeap(feedingApplication);
		return "redirect:/FeedingApplicationList";		
	}
	
	// 4. 입력화면
	@RequestMapping(value="/FeedingApplicationAdd", method=RequestMethod.GET)
	public String feedingApplicationAdd(Model model) {
		List<Kids> kids = feapService.callKids();
		List<FeedingMonthly> feedingMonthly = feapService.callMonthly();
		logger.debug("{} <-- feedingApplicationAdd(addForm) FeedingApplicationController.java",kids);
		logger.debug("{} <-- feedingApplicationAdd(addForm) FeedingApplicationController.java",feedingMonthly);
		model.addAttribute("kids",kids);
		model.addAttribute("feedingMonthly",feedingMonthly);
		return "feeding/feedingApplication_add";		
	}
	
	//5. 입력처리
	@RequestMapping(value="/FeedingApplicationAdd", method=RequestMethod.POST)
	public String feedingApplicationAdd(Model model, HttpSession session, Teacher teacher, FeedingApplication feedingApplication) {
		Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
		// loginTeacher객체에 session에 담긴 loginTeacher의 값을 담는다.
		if(loginTeacher == null) {
			// loginTeacher의 값이 null이라면 login화면으로
			return "redirect:/Login";
		}
		// null이 아니라면 loginTeacher세션에서 교원번호와 라이센스를 받아서 teacher객체에 셋팅한다.
		feedingApplication.setLicenseKindergarten(loginTeacher.getLicenseKindergarten());
		feapService.feapAdd(feedingApplication);
		logger.debug("{} <-- feedingApplicationAdd FeedingApplicationController.java",feedingApplication);
		return "redirect:/FeedingApplicationList";		
	}
	
	//6. 삭제처리
	@RequestMapping(value="/FeedingApplicationDelete", method=RequestMethod.GET)
	public String feedingApplicationDelete(Model model, @RequestParam(value="feedingApplicationCd", required=true)String feedingApplicationCd) {
		feapService.feedingApplicationDelete(feedingApplicationCd);
		logger.debug("{} < -- feedingApplicationDelete메서드 실행  FeedingApplicationController.java",feedingApplicationCd);
		return "redirect:/FeedingApplicationList";
		}
	

}
