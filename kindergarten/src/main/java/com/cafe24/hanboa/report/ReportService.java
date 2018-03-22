package com.cafe24.hanboa.report;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.hanboa.teacher.TeacherService;

@Service
@Transactional
public class ReportService {
	//모둔 일지관련 Service
	
	@Autowired
	private ReportDao reportDao;
	private static final Logger logger = LoggerFactory.getLogger(TeacherService.class);
	
	// 1. 영유아일지 전체 목록조회
	public List<Report> selectAllReport() {
		logger.debug("ReportService selectAllReport()메소드 실행");
		List<Report> list = reportDao.selectAllReport();
		logger.debug("ReportService selecatAllReport() 메소드 list {}", list);
		logger.debug("------------------------------------------------------------------------------------------------");
		return list;
		
	}
	
}
