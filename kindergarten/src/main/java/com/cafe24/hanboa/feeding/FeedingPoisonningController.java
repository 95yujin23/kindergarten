package com.cafe24.hanboa.feeding;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FeedingPoisonningController {
	@Autowired
	private FeedingPoisonningService fepoService;
	private static final Logger logger = LoggerFactory.getLogger(FeedingApplicationController.class);
	
	@RequestMapping(value="/feeding/feedingPoisonning_list")
	public String feedingPoisonningList(Model model, HttpSession session) {
		List<FeedingPoisonning> list = fepoService.getFeedingPoisonningList();
		logger.debug("{} < - feedingPoisonningList FeedingPoisonningController.java",list);
		model.addAttribute("list",list);
		return "/feeding/feedingPoisonning_list";
		
	}
	
	
	

}
