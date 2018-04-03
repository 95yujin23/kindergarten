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
public class FeedingMenuController {
	@Autowired
	private FeedingMenuService femeService;
	private static final Logger logger = LoggerFactory.getLogger(FeedingMenuController.class);
	
	//1. 목록조회
	@RequestMapping(value="/FeedingMenuList")
	public String feedingMenuList(Model model, HttpSession session) {
		List<FeedingMenu> list = femeService.getFeedingMenuList();
		logger.debug("{} <- feedingMenuList FeedingMenuController.java",list);
		model.addAttribute("list",list);
		return "feeding/feedingMenu_list";		
	}
	
	//2. 수정정보요청
	@RequestMapping(value="/feeding/feedingMenu_modify",method=RequestMethod.GET)
	public String feedingMenuModify(Model model, @RequestParam(value="feedingMenuCd", required=true) String feedingMenuCd) {
		FeedingMenu feedingMenu = femeService.modifyGetfeedingMenu(feedingMenuCd);
		logger.debug("{} < - feedingMenuCd FeedingMenuController.java", feedingMenuCd);
		logger.debug("{} < - feedingMenu FeedingMenuController.java",feedingMenu);
		model.addAttribute("feedingMenu",feedingMenu);
		return "feeding/feedingMenu_modify";		
	}
	//3. 수정처리
	@RequestMapping(value="/feeding/feedingMenu_modify",method=RequestMethod.POST)
	public String feedingMenuModify(Model model, FeedingMenu feedingMenu) {
		femeService.updateFeedingMenu(feedingMenu);
		logger.debug("{} <-- feedingMenuModify FeedingMenuController.java",feedingMenu);
		return "redirect:/FeedingMenuList";	
	}
	//4. 입력화면
	@RequestMapping(value="/FeedingMenuAdd", method=RequestMethod.GET)
	public String feedingMenuAdd() {
		logger.debug("{} <-- feedingMenuAdd(addForm) FeedingMenuController.java ");
		return "feeding/feedingMenu_add";		
	}
	
	//5. 입력
	@RequestMapping(value="/FeedingMenuAdd", method=RequestMethod.POST)
	public String feedingMenuAdd(Model model, FeedingMenu feedingMenu) {
		femeService.insertFeedingMenu(feedingMenu);
		logger.debug("{} < -- feedingMenuAdd FeedingMenuController.java",feedingMenu);
		return "redirect:/FeedingMenuList";
	}
	
	//6. 삭제처리
	@RequestMapping(value="/FeedingMenuDelete", method=RequestMethod.GET)
	public String feedingMenuDelete(Model model, @RequestParam(value="feedingMenuCd", required=true)String feedingMenuCd) {
		femeService.feedingMenuDelete(feedingMenuCd);
		logger.debug("{} <-- feedingMenuDelete메서드 실행 FeedingMenuController.java",feedingMenuCd);
		return "redirect:/FeedingMenuList";		
	}

}
