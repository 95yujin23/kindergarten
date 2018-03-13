package com.cafe24.hanboa.teacher;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeacherController {
	@Autowired
	private TeacherService teacherService;

	private static final Logger logger = LoggerFactory.getLogger(TeacherController.class);
	
	// 1. 목록조회
	@RequestMapping(value="/teacher/teacher_list")
	public String teacherList(Model model, HttpSession session) {
		List<Teacher> list = teacherService.getTeacherList();
		logger.debug("1-1. TeacherController -- TeacherList : {}", list);
		logger.debug("-----------------------------------------");
		model.addAttribute("list",list);
		return "teacher/teacher_list";
	}
	
	
	

}
