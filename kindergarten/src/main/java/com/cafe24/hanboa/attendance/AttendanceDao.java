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
	private SqlSessionTemplate sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(AttendanceDao.class);
	
	String localName = "com.cafe24.hanboa.attendance.AttendanceMapper.";
	
	public List<KidsAttendance> selectAllKidsAttendance() {
		logger.debug("AttendanceDao.java selectAllAttendance() 메소드 실행 ");
		return sqlSession.selectList(localName + "selectAllKidsattendance");
	}
}
