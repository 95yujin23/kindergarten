package com.cafe24.hanboa.plan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PlanService {
	@Autowired
	private PlanDao planDao;
	private static final Logger logger = LoggerFactory.getLogger(PlanService.class);
	
	// 계획안 카테고리
	// 1. 계획안 카테고리 등록
	public void insertPlanCategory(PlanCategory planCategory) {
		planDao.insertPlanCategory(planCategory);
		logger.debug("{} <- insertPlanCategory PlanService.java", planCategory);
	}
}
