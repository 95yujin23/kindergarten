package com.cafe24.hanboa.feeding;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class FeedingMonthlyController {
	
	@Autowired
	private FeedingMonthlyService femoService;
	private static Logger logger = LoggerFactory.getLogger(FeedingMonthlyController.class);
	
	@RequestMapping(value="feeding/feedingMonthly_list")
	public String feedingMonthlyList(Model model, HttpSession session) {
		List<FeedingMonthly> list = femoService.selectFeedingMontlhyList();
		logger.debug("{} <- feedingMonthlyList FeedingMonthlyController.java",list);
		model.addAttribute("list",list);
		return "feeding/feedingMonthly_list";
		
	}
	
	

}
