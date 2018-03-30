package com.cafe24.hanboa.attendance;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AttendanceService {
	//출석 처리 Service
	@Autowired
	private AttendanceDao attendanceDao;
	private static final Logger logger = LoggerFactory.getLogger(AttendanceService.class);
	
	// 교직원
	// 1. 교직원 출근 입력
	public void insertTeacherAttendance(TeacherAttendance teacherAttendance) {
		String sampleTime = "090000";
		String inDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
		String inTime = new SimpleDateFormat("HHmmss").format(new Date());
		teacherAttendance.setTeacherAttendanceDay(inDate);
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
	// 2-1. 교직원 출퇴근 전체 조회(원장용)
	public List<TeacherAttendance> selectTeacherAttendance() {
		logger.debug("selectTeacherAttendance AttendanceService.java");
		logger.debug("-------------------------------------------------------------");	
		return attendanceDao.selectTeacherAttendance();
	}
	// 2-1-1. 교직원 출퇴근 조회(원장용) 페이징 & 검색
//	public List<TeacherAttendance> selectTeacherAttendanceByPage() {
//		logger.debug("selectTeacherAttendance selectTeacherAttendanceByPage.java");
//		logger.debug("-------------------------------------------------------------");	
//		List<TeacherAttendance> list = attendanceDao.selectTeacherAttendanceListByPage();
//		logger.debug("{} <- list AttendanceService.java", list);
//		return list;
//	}
	// 2-2. 교직원 출퇴근 전체 조회(선생님용)
	public List<TeacherAttendance> selectTeacherAttendanceOne(String teacherCd) {
		logger.debug("selectTeacherAttendanceOne AttendanceService.java");
		logger.debug("-------------------------------------------------------------");
		return attendanceDao.selectTeacherAttendanceOne(teacherCd);
	}
	// 3. 교직원 퇴근 입력(업데이트)
	public void updateTeacherAttendance(String teacherCd) {
		String sampleTime = "180000";
		String inDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
		String inTime = new SimpleDateFormat("HHmmss").format(new Date());
		int sampleTimeEx = Integer.parseInt(sampleTime);
		int inTimeEx = Integer.parseInt(inTime);
		String teacherRestLateType = "";
		if(inTimeEx < sampleTimeEx) {
			teacherRestLateType = "조퇴";
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("teacherCd", teacherCd);
		map.put("teacherGetOff", inTime);
		map.put("teacherAttendanceDay", inDate);
		map.put("teacherRestLateType", teacherRestLateType);
		attendanceDao.updateTheacherAttendance(map);
		logger.debug("updateTeacherAttendance AttendanceService.java");
		logger.debug("-------------------------------------------------------------");	
	}
	

	// 영유아
	// 1. 영유아 등원 입력
	public void insertKidsAttendance(KidsAttendance kidsAttendance) {
		String sampleTime = "100000";
		String inDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
		String inTime = new SimpleDateFormat("HHmmss").format(new Date());
		kidsAttendance.setKidsAttendanceDay(inDate);
		int sampleTimeEx = Integer.parseInt(sampleTime);
		int inTimeEx = Integer.parseInt(inTime);
		if(sampleTimeEx < inTimeEx) {
			kidsAttendance.setKidsRestLateType("지각");
		}
		kidsAttendance.setKidsAttendance(inTime);
		attendanceDao.insertKidsAttendance(kidsAttendance);
		logger.debug("{} <- insertKidsAttendance AttendanceService.java", kidsAttendance);
		logger.debug("-------------------------------------------------------------");	
	}
	// 2-1. 영유아 등하원 전체 조회(교직원용)
	public List<KidsAttendance> selectKidsAttendance() {
		logger.debug("selectKidsAttendance AttendanceService.java");
		logger.debug("-------------------------------------------------------------");
		return attendanceDao.selectKidsAttendance();
	}
	// 2-2. 영유아 등하원 개인 조회(영유아용)
	public List<KidsAttendance> selectKidsAttendanceOne(String kids) {
		logger.debug("selectKidsAttendanceOne AttendanceService.java");
		logger.debug("-------------------------------------------------------------");
		return attendanceDao.selectKidsAttendanceOne(kids);
	}
	// 3. 영유아 하원 입력(업데이트)
	public void updateKidsAttendance(String kidsCd) {
		String sampleTime = "170000";
		String inDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
		String inTime = new SimpleDateFormat("HHmmss").format(new Date());
		int sampleTimeEx = Integer.parseInt(sampleTime);
		int inTimeEx = Integer.parseInt(inTime);
		String kidsRestLateType = "";
		if(inTimeEx < sampleTimeEx) {
			kidsRestLateType = "조퇴";
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("kidsCd", kidsCd);
		map.put("kidsComeHome", inTime);
		map.put("kidsAttendanceDay", inDate);
		map.put("kidsRestLateType", kidsRestLateType);
		attendanceDao.updateKidsAttendance(map);
		logger.debug("updateKidsAttendance AttendanceService.java");
		logger.debug("-------------------------------------------------------------");	
	}
}
