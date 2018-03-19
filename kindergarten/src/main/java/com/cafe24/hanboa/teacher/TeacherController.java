package com.cafe24.hanboa.teacher;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	// 3. 로그인 화면
	@RequestMapping(value="/Login", method = RequestMethod.GET)
	public String login() {
		logger.debug("1-3. TeacherController -- LoginForm");;
		logger.debug("-----------------------------------------");
		return "login/login";
		}
	
	// 4. 로그인 실행
	@RequestMapping(value="/Login", method = RequestMethod.POST)
	public String login(Model model, HttpSession session, String teacherEmail, String teacherPw) {
		//logger.debug("1-4. TeacherController -- LoginAction : {}", teacher);
		Teacher loginTeacher = teacherService.login(teacherEmail, teacherPw);
		if(loginTeacher == null) {
			return "redirect:/Login";
		}else {
			session.setAttribute("loginTeacher", loginTeacher);
		}
		logger.debug("-----------------------------------------");
		return "redirect:/";
			}
	
}
