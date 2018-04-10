package com.cafe24.hanboa.feeding;

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
public class FeedingMenuController {
	@Autowired
	private FeedingMenuService femeService;
	private static final Logger logger = LoggerFactory.getLogger(FeedingMenuController.class);
	
	//1. 목록조회
	@RequestMapping(value="/FeedingMenuList", method = RequestMethod.GET)
	public String feedingMenuList(Model model
								, @RequestParam(value="searchOpthion", required=false)String searchOption
								, @RequestParam(value="keyword", required=false)String keyword
								, @RequestParam(value="currentPage", required=false,defaultValue="1")int currentPage
								, @RequestParam(value="pagePerRow", required=false, defaultValue="10")int pagePerRow) {
		logger.debug("{} <-- feedingMenuList메서드 실행 feedingMenuController.java",keyword);
		logger.debug("{} <-- feedingMenuList메서드 실행 feedingMenuController.java",currentPage);
		logger.debug("{} <-- feedingMenuList메서드 실행 feedingMenuController.java",pagePerRow);
		Map<String, Object> map = femeService.getFeedingMenuList(currentPage, pagePerRow, searchOption, keyword);
		List<FeedingMenu> list = (List<FeedingMenu>)(map.get("list"));
		int countPage = (Integer) map.get("countPage");
		String searchKeyword = (String) map.get("keyword");
		String searchOptionWord = (String) map.get("searchOption");
		logger.debug("{} <- feedingMenuList FeedingMenuController.java",list);
		model.addAttribute("list",list);
		model.addAttribute("countPage",countPage);
		model.addAttribute("currentPage",currentPage);
		model.addAttribute("keyword",keyword);
		model.addAttribute("searchOption",searchOption);
		logger.debug("{} < - list FeedingMenuController.java",list);
		logger.debug("------------------------------------------------------------");		
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
	public String feedingMenuAdd(Model model,HttpSession session, Teacher teacher, FeedingMenu feedingMenu) {
		Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
		// loginTeacher객체에 session에 담긴 loginTeacher의 값을 담는다.
		if(loginTeacher == null) {
			// loginTeacher의 값이 null이라면 login화면으로
			return "redirect:/Login";
		}
		// null이 아니라면 loginTeacher세션에서 교원번호와 라이센스를 받아서 teacher객체에 셋팅한다.
		feedingMenu.setLicenseKindergarten(loginTeacher.getLicenseKindergarten());
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
