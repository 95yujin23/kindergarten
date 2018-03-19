package com.cafe24.hanboa.kids;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cafe24.hanboa.teacher.TeacherController;

@Controller
public class KidsController {
	@Autowired
	private KidsService kidsService;
	
	private static final Logger logger = LoggerFactory.getLogger(KidsController.class);
	
	// 1. 영유아목록조회
	@RequestMapping(value="/kidsList")
	public String kidsList(Model model, HttpSession session) {
		List<Kids> list = kidsService.selectAllKids();
		logger.debug("kidsController -- kidsList : {}", list);
		logger.debug("----------------------------------------");
		model.addAttribute("list",list);
		return "kids/kids_list";
	}
}
