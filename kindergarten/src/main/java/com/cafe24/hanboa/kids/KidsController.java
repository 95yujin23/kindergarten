package com.cafe24.hanboa.kids;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cafe24.hanboa.teacher.Teacher;
import com.cafe24.hanboa.teacher.TeacherController;

@Controller
public class KidsController {
	@Autowired
	private KidsService kidsService;
	
	private static final Logger logger = LoggerFactory.getLogger(KidsController.class);
	
	// 1. 영유아목록조회
	@RequestMapping(value="/KidsList")
	public String kidsList(Model model, HttpSession session) {
		List<Kids> list = kidsService.getKidsList();
		logger.debug("KidsController -- KidsList : {}", list);
		logger.debug("----------------------------------------");
		model.addAttribute("list",list);
		return "kids/kids_list";
	}
	
	// 영유아 편성 반별 조회
	@RequestMapping(value="/KidsListByClass")
	public String kidsListByClass(Model model, HttpSession session, Teacher teacher) {
		Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
		// loginTeacher객체에 session에 담긴 loginTeacher의 값을 담는다.
		if(loginTeacher == null) {
			// loginTeacher의 값이 null이라면 login화면으로
			return "redirect:/Login";
		}
		teacher.setTeacherCd(loginTeacher.getTeacherCd());
		// null이 아니라면 loginTeacher세션에서 선생님코드를 받아서 teacher객체에 셋팅한다.
		logger.debug("1. TeacherController -- KidsListByClass : {}", teacher);
		List<Kids> list = kidsService.getKidsListByClass(teacher);
		logger.debug("List<Kids> : {}",list);
		logger.debug("----------------------------------------");
		model.addAttribute("list",list);
		return "kids/kids_list";
	}
}
