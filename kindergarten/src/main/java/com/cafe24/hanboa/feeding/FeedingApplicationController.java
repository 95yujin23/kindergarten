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
public class FeedingApplicationController {
	@Autowired
	private FeedingApplicationService feapService;	
	private static final Logger logger = LoggerFactory.getLogger(FeedingApplicationController.class);
	
	//1. 목록조회
	@RequestMapping(value="/feeding/feeding_application")
	public String feedingApplicationList(Model model, HttpSession session) {
		List<FeedingApplication> list = feapService.getFeedingApplicationList();
		logger.debug("{} <- list FeedingApplicationController.java",list);
		model.addAttribute("list",list);		
		return "feeding/feeding_application";	
	}
	
	//2.수정 정보요청
	@RequestMapping(value="/feeding/feedingApplication_modify",method=RequestMethod.GET)
	public String feedingApplicationModify(Model model, @RequestParam(value="feedingApplicationCd", required=true) String feedingApplicationCd) {
		FeedingApplication feedingApplication = feapService.modifyGetfeap(feedingApplicationCd);
		model.addAttribute("feedingApplication", feedingApplication);
		logger.debug("{} <- feedingApplication FeedingApplicationController.java",feedingApplication);
		return "feeding/feedingApplication_modify";
	}
	
	/*// 3.수정 처리요청
	@RequestMapping(value="/feeding/feedingApplication_modify", method = RequestMethod.POST)
	public String feedingApplicationModify(FeedingApplication feedingApplication) {
		return null;		
	}
			
	*/

}