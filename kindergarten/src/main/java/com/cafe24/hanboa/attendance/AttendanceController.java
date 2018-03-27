package com.cafe24.hanboa.attendance;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cafe24.hanboa.teacher.Teacher;

@Controller
public class AttendanceController {
	// 출석관련컨트롤러
	@Autowired
	private AttendanceService attendanceService;
	private static final Logger logger = LoggerFactory.getLogger(AttendanceController.class);
	
	// 교직원
	// 1-1. 교직원 출근 입력 요청
	@RequestMapping(value="/teacher_attendance", method = RequestMethod.GET)
	public String theacherAttendance() {
		logger.debug("1. AttendanceController theacherAttendance()메소드 실행 ");
		logger.debug("------------------------------------------------------------");
		return "attendance/teacher_attendance";
	}
	// 1-2. 교직원 출근 입력
	@RequestMapping(value="/teacher_attendance", method = RequestMethod.POST)
	public String theacherAttendance(Model model, HttpSession session, Teacher teacher, TeacherAttendance teacherAttendance) {
		Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
		// loginTeacher객체에 session에 담긴 loginTeacher의 값을 담는다.
		if(loginTeacher == null) {
			// loginTeacher의 값이 null이라면 login화면으로
			return "redirect:/Login";
		}
		// null이 아니라면 loginTeacher세션에서 교원번호와 라이센스를 받아서 teacher객체에 셋팅한다.
		teacherAttendance.setTeacherCd(loginTeacher.getTeacherCd());
		teacherAttendance.setLicenseKindergarten(loginTeacher.getLicenseKindergarten());
		attendanceService.insertTeacherAttendance(teacherAttendance);
		logger.debug("{} <- theacherAttendance AttendanceController.java", teacherAttendance);
		return "redirect:/teacher_attendance_list";
	}
	// 2-1. 교직원 출퇴근 전체 조회(원장용)
	@RequestMapping(value="/teacher_all_attendance_list", method = RequestMethod.GET)
	public String teacherAttendanceList(Model model) {
		List<TeacherAttendance> list = attendanceService.selectTeacherAttendance();
		logger.debug("{} <- theacherAttendanceList AttendanceController.java", list);
		model.addAttribute("list", list);
		return "attendance/teacher_all_attendance_list";
	}
	// 2-2. 교직원 출퇴근 전체 조회(선생님용)
	@RequestMapping(value="/teacher_attendance_list", method = RequestMethod.GET)
	public String teacherAttendanceListOne(HttpSession session, Model model, String teacherCd) {
		Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
		// loginTeacher객체에 session에 담긴 loginTeacher의 값을 담는다.
		if(loginTeacher == null) {
			// loginTeacher의 값이 null이라면 login화면으로
			return "redirect:/Login";
		}
		teacherCd = loginTeacher.getTeacherCd();
		List<TeacherAttendance> list = attendanceService.selectTeacherAttendanceOne(teacherCd);
		model.addAttribute("list", list);
		return "attendance/teacher_attendance_list";
	}
	// 3. 교직원 퇴근 입력(업데이트)
	@RequestMapping(value="/teacher_attendance_update", method = RequestMethod.POST)
	public String teacherAttendanceUpdate(HttpSession session, String teacherCd) {
		Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
		// loginTeacher객체에 session에 담긴 loginTeacher의 값을 담는다.
		if(loginTeacher == null) {
			// loginTeacher의 값이 null이라면 login화면으로
			return "redirect:/Login";
		}
		teacherCd = loginTeacher.getTeacherCd();
		attendanceService.updateTeacherAttendance(teacherCd);
		return "redirect:/teacher_attendance_list";
	}
	
	
	// 영유아
	// 1-1. 영유아 등원 입력 요청
	@RequestMapping(value="/kids_attendance", method = RequestMethod.GET)
	public String kidsAttendance() {
		logger.debug("1. AttendanceController kidsAttendance()메소드 실행 ");
		logger.debug("------------------------------------------------------------");
		return "attendance/kids_attendance";
	}
	// 1-2. 영유아 등원 입력
	@RequestMapping(value="/kids_attendance", method = RequestMethod.POST)
	public String kidsAttendance(Model model, HttpSession session, KidsAttendance kidsAttendance) {
		Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
		// loginTeacher객체에 session에 담긴 loginTeacher의 값을 담는다.
		if(loginTeacher == null) {
			// loginTeacher의 값이 null이라면 login화면으로
			return "redirect:/Login";
		}
		kidsAttendance.setLicenseKindergarten(loginTeacher.getLicenseKindergarten());
		attendanceService.insertKidsAttendance(kidsAttendance);
		return "redirect:/kids_attendance_list";
	}
	// 2-1. 영유아 등하원 전체 조회(교직원용)
	@RequestMapping(value="/kids_attendance_list", method = RequestMethod.GET)
	public String kidsAttendanceList(Model model) {
		List<KidsAttendance> list = attendanceService.selectKidsAttendance();
		logger.debug("{} <- kidsAttendanceList AttendanceController.java", list);
		model.addAttribute("list", list);
		return "attendance/kids_attendance_list";
	}
	// 2-2. 영유아 등하원 개인 조회(영유아용)
	public String kidsAttendanceListOne(Model model, String kids) {
		List<KidsAttendance> list = attendanceService.selectKidsAttendanceOne(kids);
		logger.debug("{} <- kidsAttendanceListOne AttendanceController.java", list);
		model.addAttribute("list", list);
		return "attendance/kids_attendance_list_one";
	}
}
