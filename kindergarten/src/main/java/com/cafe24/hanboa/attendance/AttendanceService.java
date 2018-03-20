package com.cafe24.hanboa.attendance;

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
	
	//1. 영유아 출석 전체 조회
	public List<KidsAttendance> selectAllKidsAttendance() {
		List<KidsAttendance> list = attendanceDao.selectAllKidsAttendance();
		logger.debug("AttendanceService -> AttendanceList : {}  ", list);
		logger.debug("-------------------------------------------------------------");
		return list;
	}
	
}
