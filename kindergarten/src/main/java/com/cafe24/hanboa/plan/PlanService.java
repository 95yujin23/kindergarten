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
	public Map<String, Object> selectPlanList(int currentPage, int pagePerRow, String keyword) {
		logger.debug("{} : <- currentPage PlanService.java", currentPage);
		logger.debug("{} : <- pagePerRow PlanService.java", pagePerRow);
		logger.debug("{} <- keyword selectPlanList PlanService.java", keyword);
		int startPage = 0;
		if(currentPage > 1) {
			startPage = (currentPage-1)*pagePerRow;
		}
		// DAO에 시작 페이지와 행의 수 보내기
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("keyword", keyword);
		map.put("startPage", startPage);
		map.put("pagePerRow", pagePerRow);
		List<PlanCategory> list = planDao.getPlanList(map);
		logger.debug("{} : <- list cityService.java", list);
		// 총 행의 수를 보여줄 행의 수로 나눈 뒤 나머지가 0일 경우는 넘어가고 아닐 경우 +1 한다.
		int count = planDao.selectPlanCategoryCountByPage(map);
		logger.debug("{} : <- count cityService.java", count);
		int countPage = count/pagePerRow;
		if(count%pagePerRow != 0) {
				countPage++;
		}
		logger.debug("{} : <- countPage cityService.java", countPage);
		// list, 페이지 수 리턴
		Map<String, Object> returnMap = new HashMap<String, Object>();
		returnMap.put("keyword", keyword);
		returnMap.put("list", list);
		returnMap.put("countPage", countPage);
		return returnMap;
	}
}
