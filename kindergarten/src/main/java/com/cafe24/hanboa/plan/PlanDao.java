package com.cafe24.hanboa.plan;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PlanDao {
	@Autowired
	private SqlSessionTemplate sqlSesionTamplate;
	// 경로 중복처리
	String localName = "com.cafe24.hanboa.PlanMapper.";
	private static final Logger logger = LoggerFactory.getLogger(PlanDao.class);
	
	// 계획안 카테고리
	// 1. 계획안 카테고리 등록
	public int insertPlanCategory(PlanCategory planCategory) {
		logger.debug("PlanDao.java 1. insertPlanCategory() 메소드 실행");
		return sqlSesionTamplate.insert(localName+"insertPalnCategory", planCategory);
	}
}
