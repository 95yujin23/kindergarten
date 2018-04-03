package com.cafe24.hanboa.feeding;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class FeedingMonthlyController {
	
	@Autowired
	private FeedingMonthlyService femoService;
	private static Logger logger = LoggerFactory.getLogger(FeedingMonthlyController.class);
	
	//1. 전체조회
	@RequestMapping(value="feeding/feedingMonthly_list")
	public String feedingMonthlyList(Model model, HttpSession session) {
		List<FeedingMonthly> list = femoService.selectFeedingMontlhyList();
		logger.debug("{} <- feedingMonthlyList FeedingMonthlyController.java",list);
		model.addAttribute("list",list);
		return "feeding/feedingMonthly_list";
	}
	
	//2. 수정정보요청
	@RequestMapping(value="feeding/feedingMonthly_modify" , method=RequestMethod.GET)
	public String feedingMonthlyModify(Model model, @RequestParam(value="feedingMonthlyCd", required=true) String feedingMonthlyCd) {
		FeedingMonthly feedingMonthly = femoService.modifyGetFeedingMonthly(feedingMonthlyCd);
		model.addAttribute("feedingMonthly",feedingMonthly);
		logger.debug("< -- feedingMonthlyModify FeedingMonthlyController.java",feedingMonthly);
		logger.debug("< -- feedingMonthlyModify FeedingMonthlyController.java",feedingMonthlyCd);
		return "feeding/feedingMonthly_modify";		
	}	
	
	//3. 수정처리
	@RequestMapping(value="feeding/feedingMonthly_modify" , method=RequestMethod.POST)
	public String feedingMonthlyModify(Model model, FeedingMonthly feedingMonthly) {
		femoService.feedingMonthlyModify(feedingMonthly);
		logger.debug("< -- feedingMonthlyModify FeedingMonthlyController.java",feedingMonthly);
		return "redirect:/feeding/feedingMonthly_list";		
	}
	
	//4. 입력화면
	@RequestMapping(value="/FeedingMonthlyAdd" , method=RequestMethod.GET)
	public String feedingMonthlyAdd() {
		logger.debug("{} < -- feedingMonthlyAdd(Form) FeedingMonthlyController.java");
		return "/feeding/feedingMonthly_add";		
	}
	
	//5. 입력처리
	@RequestMapping(value="/FeedingMonthlyAdd" , method=RequestMethod.POST)
	public String feedingMonthlyAdd(Model model, FeedingMonthly feedingMonthly) {
		femoService.feedingMonthlyAdd(feedingMonthly);
		logger.debug("{} <-- feedingMonthlyAdd메서드 실행 FeedingMonthlyController.java",feedingMonthly);
		return "redirect:/";
		
	}
	

}
