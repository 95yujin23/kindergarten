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
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.hanboa.teacher.Teacher;

@Controller
public class AttendanceController {
	// 출석관련컨트롤러
	@Autowired
	private AttendanceService attendanceService;
	private static final Logger logger = LoggerFactory.getLogger(AttendanceController.class);
	
	// 교직원
	// 1-1. 교직원 출근 요청
	@RequestMapping(value="/teacher_attendance", method = RequestMethod.GET)
	public String theacherAttendance() {
		logger.debug("1. AttendanceController theacherAttendance()메소드 실행 ");
		logger.debug("------------------------------------------------------------");
		return "attendance/teacher_attendance";
	}
	// 1-2. 교직원 출근 요청
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
	// 2-1. 교직원 출근 전체 조회(원장)
	@RequestMapping(value="/teacher_attendance_list", method = RequestMethod.GET)
	public String teacherAttendanceList(Model model) {
		List<TeacherAttendance> list = attendanceService.selectTeacherAttendance();
		logger.debug("{} <- theacherAttendanceList AttendanceController.java", list);
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
	// 1. 영유아 출석 모두 조회
	@RequestMapping(value="/kidsAttendance")
	public String kidsAttendanceList(Model model, HttpSession session) {
		logger.debug("AttendanceController kidsAttendanceList()메소드 실행 "); 
		List<KidsAttendance> list = attendanceService.selectAllKidsAttendance();
		logger.debug("AttendanceController -- AttendanceList : {}", list);
		logger.debug("------------------------------------------------------------");
		model.addAttribute("list", list);
		return "kids/kids_attendance";
	}
	
	
}
