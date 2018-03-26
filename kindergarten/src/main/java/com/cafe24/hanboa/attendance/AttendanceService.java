package com.cafe24.hanboa.attendance;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AttendanceService {
	//출석 처리 서비스
	@Autowired
	private AttendanceDao attendanceDao;
	private static final Logger logger = LoggerFactory.getLogger(AttendanceService.class);
	
	// 교직원
	// 1. 교직원 출근 입력
	public void insertTeacherAttendance(TeacherAttendance teacherAttendance) {
		String sampleTime = "090000";
		String inDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
		String inTime = new SimpleDateFormat("HHmmss").format(new Date());
		teacherAttendance.setTeacherDay(inDate);
		int sampleTimeEx = Integer.parseInt(sampleTime);
		int inTimeEx = Integer.parseInt(inTime);
		if(sampleTimeEx < inTimeEx) {
			teacherAttendance.setTeacherRestLateType("지각");
		}
		teacherAttendance.setTeacherAttendance(inTime);
		attendanceDao.insertTeacherAttendance(teacherAttendance);
		logger.debug("{} <- insertTeacherAttendance AttendanceService.java", teacherAttendance);
		logger.debug("-------------------------------------------------------------");	
	}
	// 2. 교직원 전체 조회
	public List<TeacherAttendance> selectTheacherAttendance() {
		logger.debug("{} <- insertTeacherAttendance AttendanceService.java");
		logger.debug("-------------------------------------------------------------");	
		return attendanceDao.selectTheacherAttendance();
	}
	
	// 영유아
	//1. 영유아 출석 전체 조회
	public List<KidsAttendance> selectAllKidsAttendance() {
		List<KidsAttendance> list = attendanceDao.selectAllKidsAttendance();
		logger.debug("AttendanceService -> AttendanceList : {}  ", list);
		logger.debug("-------------------------------------------------------------");
		return list;
	}
	
}
