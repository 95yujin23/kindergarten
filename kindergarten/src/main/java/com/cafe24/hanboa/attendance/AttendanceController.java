package com.cafe24.hanboa.attendance;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AttendanceController {
	// 출석관련컨트롤러
	
	private AttendanceService attendanceService;
	private static final Logger logger = LoggerFactory.getLogger(AttendanceController.class);
	
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
