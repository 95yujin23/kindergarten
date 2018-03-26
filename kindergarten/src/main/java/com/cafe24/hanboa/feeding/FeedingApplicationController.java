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
public class FeedingApplicationController {
	@Autowired
	private FeedingApplicationService feedingService;	
	private static final Logger logger = LoggerFactory.getLogger(FeedingApplicationController.class);
	
	//1. 목록조회
	@RequestMapping(value="/feeding/feeding_application")
	public String feedingApplicationList(Model model, HttpSession session) {
		List<FeedingApplication> list = feedingService.getFeedingApplicationList();
		logger.debug("{} <- list FeedingApplicationController.java",list);
		model.addAttribute("list",list);		
		return "feeding/feeding_application";	
	}
	
	

}
