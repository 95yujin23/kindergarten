package com.cafe24.hanboa.plan;

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
	// 2. 계획안 카테고리 전체조회+검색
	public Map<String, Object> selectPlanList(String keyword) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("keyword", keyword);
		List<PlanCategory> list = planDao.getPlanList(map);
		logger.debug("{} <- keyword selectPlanList PlanService.java", keyword);
		map.put("list", list);
		return map;
	}
}
