package com.cafe24.hanboa.attendance;



import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AttendanceDao {
	//출석 처리 DAO
	@Autowired
	private SqlSessionTemplate sqlSessionTemlate;
	private static final Logger logger = LoggerFactory.getLogger(AttendanceDao.class);
	String localName = "com.cafe24.hanboa.attendance.AttendanceMapper.";
	
	// 교직원
	// 1. 교직원 출근 입력
	public int insertTeacherAttendance(TeacherAttendance teacherAttendance) {
		logger.debug("AttendanceDao.java insertTeacherAttendance() 메소드 실행"); 
		return sqlSessionTemlate.insert(localName + "insertTheacherAttendance", teacherAttendance);
	}
	
	// 영유아
	// 1. 영유아 출석 전체 조회
	public List<KidsAttendance> selectAllKidsAttendance() {
		logger.debug("AttendanceDao.java selectAllAttendance() 메소드 실행 ");
		return sqlSessionTemlate.selectList(localName + "selectAllKidsattendance");
	}
}
