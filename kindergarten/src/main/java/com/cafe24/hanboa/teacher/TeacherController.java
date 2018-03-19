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
	@RequestMapping(value="/TeacherList")
	public String teacherList(Model model, HttpSession session) {
		List<Teacher> list = teacherService.getTeacherList();
		logger.debug("1-1. TeacherController -- TeacherList : {}", list);
		logger.debug("-----------------------------------------");
		model.addAttribute("list",list);
		return "teacher/teacher_list";
	}
	
	// 2. 개인조회
	@RequestMapping(value="/TeacherInformation")
	public String teacherOne(Model model, HttpSession session, String memberCd) {
		logger.debug("1-2. TeacherController -- TeacherOne : {}", memberCd);
		Teacher teacher = teacherService.getTeacherOne(memberCd);
		logger.debug("-----------------------------------------");
		model.addAttribute("teacher", teacher);
		return "teacher/teacher_select";
	}
	
	// 3. 로그인
		@RequestMapping(value="/Login")
		public String login(Model model, HttpSession session, Teacher teacher) {
			logger.debug("1-2. TeacherController -- Login : {}", teacher);
			Teacher loginTeacher = teacherService.login(teacher);
			if(loginTeacher == null) {
				return "redirect:/login/login";
			}else {
				
			}
			logger.debug("-----------------------------------------");
			model.addAttribute("teacher", teacher);
			return "login/login";
		}

}
