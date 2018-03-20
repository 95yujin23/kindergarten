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
	
	// 1. 교직원 전체 목록 조회
	@RequestMapping(value="/TeacherList")
	public String teacherList(Model model, HttpSession session) {
		List<Teacher> list = teacherService.getTeacherList();
		logger.info("1. TeacherController -- TeacherList : {}", list);
		logger.debug("-----------------------------------------");
		model.addAttribute("list",list);
		return "teacher/teacher_list";
	}
	
	// 2. 교직원 개인 조회
	@RequestMapping(value="/TeacherSelect")
	public String teacherOne(Model model, HttpSession session, String memberCd) {
		logger.debug("2. TeacherController -- TeacherOne : {}", memberCd);
		Teacher teacher = teacherService.getTeacherOne(memberCd);
		logger.debug("-----------------------------------------");
		model.addAttribute("teacher", teacher);
		return "teacher/teacher_select";
	}
	
	// 3-1. 로그인 화면
	@RequestMapping(value="/Login", method = RequestMethod.GET)
	public String login() {
		logger.info("3-1. TeacherController -- LoginForm");;
		logger.debug("-----------------------------------------");
		return "login/login";
		}
	
	// 3-2. 로그인 실행
	@RequestMapping(value="/Login", method = RequestMethod.POST)
	public String login(Model model, HttpSession session, Teacher teacher) {
		logger.debug("3-2. TeacherController -- LoginAction : {}, {}", teacher);
		Teacher loginTeacher = teacherService.login(teacher);
		if(loginTeacher == null) {
			return "redirect:/Login";
		}else {
			session.setAttribute("loginTeacher", loginTeacher);
		}
		logger.debug("-----------------------------------------");
		/*	1. 로그인이 되면 로그인된 선생님의 정보에서 license를 가져옴
		 *	2. 최초 로그인을 하는 사람 - 최초로 라이센스를 부여받은 원장님
		 *	3. 원장님이 부여받은 라이센스를 가지고 교직원을 등록
		 * 	4. 라이센스가 원장이 등록한 교직원에게 부여
		 */
		return "redirect:/";
			}
	
	// 4. 로그아웃
	@RequestMapping(value="/Logout", method = RequestMethod.GET)
	public String logout(Model model, HttpSession session) {
		logger.debug("4. TeacherController -- LogOut");
		session.invalidate();
		logger.debug("-----------------------------------------");
		return "redirect:/";
		}
		
	// 5-1. 교직원 등록 화면
	@RequestMapping(value="/TeacherAdd", method = RequestMethod.GET)
	public String teacherAdd() {
		logger.debug("5-1. TeacherController -- TeacherAddForm");
		logger.debug("-----------------------------------------");
		return "teacher/teacher_add";
		}	
	
	// 5-2. 교직원 등록
	@RequestMapping(value="/TeacherAdd", method = RequestMethod.POST)
	public String teacherAdd(Model model, HttpSession session, Teacher teacher) {
		logger.debug("5-2. TeacherController -- TeacherAdd : {}", teacher);
		teacherService.addTeacher(teacher);
		logger.debug("-----------------------------------------");
		return "redirect:/";
		}	
	
	// 6-1. 교직원 수정 화면
	@RequestMapping(value="/TeacherModify", method = RequestMethod.GET)
	public String teacherModify() {
		logger.debug("6-1. TeacherController -- TeacherModifyForm");
		logger.debug("-----------------------------------------");
		return "teacher/teacher_modify";
		}
	
	// 6-2. 교직원 수정
	@RequestMapping(value="/teacherModify", method = RequestMethod.POST)
	public String teacherModify(Model model, HttpSession session) {
		logger.debug("6-2. TeacherController -- TeacherModify");
		logger.debug("-----------------------------------------");
		return "redirect:/";
		}
	
	// 7. 교직원 삭제 & 탈퇴
	@RequestMapping(value="/teacherRemove", method = RequestMethod.GET)
	public String teacherRemove(Model model, HttpSession session) {
		logger.debug("7. TeacherController -- TeacherRemove");
		logger.debug("-----------------------------------------");
		return "redirect:/";
		}	
	
	// 8. 교직원 인건비 지급 목록 전체 조회
	@RequestMapping(value="/teacherPayList", method = RequestMethod.GET)
	public String teacherPayList(Model model, HttpSession session) {
		logger.debug("8. TeacherController -- TeacherPayList");
		logger.debug("-----------------------------------------");
		return "teacher/teacher_pay_list";
		}	
	
	// 9. 교직원 인건비 지급 목록 개인 조회
	@RequestMapping(value="/teacherPaySelect", method = RequestMethod.GET)
	public String teacherPaySelect(Model model, HttpSession session) {
		logger.debug("9. TeacherController -- TeacherPaySelect");
		logger.debug("-----------------------------------------");
		return "teacher/teacher_pay_select";
		}
	
	// 10-1. 교직원 인건비 지급 수정 화면
	@RequestMapping(value="/teacherPayModify", method = RequestMethod.GET)
	public String teacherPayModify(Model model, HttpSession session) {
		logger.debug("10-1. TeacherController -- TeacherPayModifyForm");
		logger.debug("-----------------------------------------");
		return "teacher/teacher_pay_modify";
		}

	// 10-2. 교직원 인건비 지급 수정
	@RequestMapping(value="/teacherPayModify", method = RequestMethod.POST)
	public String teacherPayModify() {
		logger.debug("10-2. TeacherController -- teacherPayModify");
		logger.debug("-----------------------------------------");
		return "redirect:/";
		}
	
	// 11. 교직원 인건비 지급 삭제
	@RequestMapping(value="/teacherPayRemove", method = RequestMethod.GET)
	public String teacherPayRemove(Model model, HttpSession session) {
		logger.debug("11. TeacherController -- LogOut");
		logger.debug("-----------------------------------------");
		return "redirect:/";
		}	
}
