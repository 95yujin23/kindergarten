package com.cafe24.hanboa.report;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReportDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(ReportDao.class);
	
	String localName = "com.cafe24.hanboa.report.ReportMapper.";
	
	public List<Report> selectAllReport() {
		logger.debug("ReportDao selectAllReport() 메소드 실행");
		return sqlSession.selectList(localName + "selectAllReport");
	}
}
