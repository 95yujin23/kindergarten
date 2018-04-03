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

@Controller
public class FeedingPoisonningController {
	@Autowired
	private FeedingPoisonningService fepoService;
	private static final Logger logger = LoggerFactory.getLogger(FeedingApplicationController.class);
	
	// 1. 전체조회
	@RequestMapping(value="/feeding/feedingPoisonning_list")
	public String feedingPoisonningList(Model model, HttpSession session) {
		List<FeedingPoisonning> list = fepoService.getFeedingPoisonningList();
		logger.debug("{} < - feedingPoisonningList FeedingPoisonningController.java",list);
		model.addAttribute("list",list);
		return "/feeding/feedingPoisonning_list";
	}
	
	// 2. 수정정보요청
	@RequestMapping(value="/feeding/feedingPoisonning_modify", method=RequestMethod.GET)
	public String feedingPoisonningModify(Model model, @RequestParam(value="foodPoisonningGenerationCd", required=true) String foodPoisonningGenerationCd){
		FeedingPoisonning feedingPoisonning = fepoService.feedingPoisonningGetModify(foodPoisonningGenerationCd);
		model.addAttribute("feedingPoisonning",feedingPoisonning);
		return "feeding/feedingPoisonning_modify";		
	}
	
	// 3. 수정처리
	@RequestMapping(value="/feeding/feedingPoisonning_modify", method=RequestMethod.POST)
	public String feedingPoisonningModify(FeedingPoisonning feedingPoisonning) {
		fepoService.feedingPoisonningModify(feedingPoisonning);
		logger.debug("{} < -- feedingPoisonningModify FeedingPoisonningController.java",feedingPoisonning);
		return "redirect:/feeding/feedingPoisonning_list";		
	}
	
	// 4. 입력화면
	@RequestMapping(value="/FeedingPoisonningAdd", method=RequestMethod.GET)
	public String FeedingPoisonningAdd() {
		logger.debug("{} <-- FeedingPoisonningAdd(addFrom) FeedingPoisonningController.java");
		return "/feeding/feedingPoisonning_add";		
	}
	
	// 5.입력처리
	@RequestMapping(value="/FeedingPoisonningAdd", method=RequestMethod.POST)
	public String FeedingPoisonningAdd(Model model, FeedingPoisonning feedingPoisonning
											,@RequestParam(value="foodPoisonningGenerationCd") String foodPoisonningGenerationCd) {
		logger.debug("feedingPoisonning_add.jsp ---> FeedingPoisonningAdd 넘어오는 값 : {}", foodPoisonningGenerationCd);
		fepoService.feedingPoisonningAdd(feedingPoisonning);
		
		logger.debug("feedingPoisonning_add.jsp ---> FeedingPoisonningAdd 넘어오는 값 : {}", foodPoisonningGenerationCd);
		logger.debug("{} < -- FeedingPoisonningAdd FeedingPoisonningController.java",feedingPoisonning);
		return "redirect:/";
		
	}
	
	
	

}
