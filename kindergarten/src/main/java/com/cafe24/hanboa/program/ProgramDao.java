package com.cafe24.hanboa.program;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProgramDao {
	@Autowired
	private SqlSessionTemplate sqlSesionTamplate;
	// 경로 중복처리
	String localName = "com.cafe24.hanboa.ProgramMapper.";
	private static final Logger logger = LoggerFactory.getLogger(ProgramDao.class);
	
	// 전체조회
	public List<Program> getProgramList() {
		logger.debug("{} <- getProgramList ProgramDao.java");
		 return sqlSesionTamplate.selectList(localName+"getProgramList");
	}
}
