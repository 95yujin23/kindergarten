package com.cafe24.hanboa.plan;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.hanboa.classformation.KidsClass;

@Repository
public class PlanDao {
	@Autowired
	private SqlSessionTemplate sqlSesionTamplate;
	// 경로 중복처리
	String localName = "com.cafe24.hanboa.PlanMapper.";
	private static final Logger logger = LoggerFactory.getLogger(PlanDao.class);
	
	// 계획안
	// 1-1. 계획안 등록 : 계획안 카테고리 불러오기
	public List<PlanCategory> callPlanCategory() {
		logger.debug("PlanDao.java 1-1. callPlanCategory() 메소드 실행");
		return sqlSesionTamplate.selectList(localName+"callPlanCategory");
	}
	// 1-2. 계획안 등록 : 영유아 반 불러오기
	public List<KidsClass> callKidsClass() {
		logger.debug("PlanDao.java 1-2. callKidsClass() 메소드 실행");
		return sqlSesionTamplate.selectList(localName+"callKidsClass");
	}
	// 1-3. 계획안 등록
	public int insertPlan(Plan plan) {
		logger.debug("PlanDao.java 1-3. insertPlan() 메소드 실행");
		return sqlSesionTamplate.insert(localName+"insertPlan", plan);
	}
	// 2-1. 계획안 전체조회+검색+페이징
	public List<Plan> getPlanList(Map<String, Object> map) {
		logger.debug("PlanDao.java 2-1. getPlanList() 메소드 실행");
		return sqlSesionTamplate.selectList(localName+"getPlanList", map);
	}
	// 2-2. 전체 계획안 수(페이징)
	public int selectPlanCountByPage(Map<String, Object> map) {
		return sqlSesionTamplate.selectOne(localName+"selectPlanCountByPage", map);
	}
	// 3-1. 계획안 개별 조회 : 계획안 카테고리 이름 불러오기
	public PlanCategory callPlanCategoryOne(String planCateCd) {
		logger.debug("PlanDao.java 3-1. callPlanCategoryOne() 메소드 실행");
		return sqlSesionTamplate.selectOne(localName+"callPlanCategoryOne", planCateCd);
	}
	// 3-2. 계획안 개별 조회 : 영유아 반 이름 불러오기
	public KidsClass callKidsClassOne(String kidsClassCd) {
		logger.debug("PlanDao.java 3-2. callKidsClassOne() 메소드 실행");
		return sqlSesionTamplate.selectOne(localName+"callKidsClassOne", kidsClassCd);
	}
	// 3-3. 계획안 개별 조회
	public Plan getPlanOne(String planCd) {
		logger.debug("PlanDao.java 3-3. getPlanListOne() 메소드 실행");
		logger.debug("{} <- planCd getPlanOne PlanDao.java", planCd);
		return sqlSesionTamplate.selectOne(localName+"getPlanOne", planCd);
	}
	// 4. 계획안 업데이트
	public int planModify(Plan plan) {
		logger.debug("PlanDao.java 3-3. planModify() 메소드 실행");
		logger.debug("{} <- plan planModify PlanDao.java", plan);
		return sqlSesionTamplate.update(localName+"modifyPlan", plan);
	}
	// 5. 계획안 삭제
	public int deletePlan(String planCd) {
		logger.debug("{} <- planCd deletePlan PlanDao.java", planCd);
		return sqlSesionTamplate.delete(localName+"deletePlan", planCd);
	}
	
	// 계획안 카테고리
	// 1. 계획안 카테고리 등록
	public int insertPlanCategory(PlanCategory planCategory) {
		logger.debug("PlanDao.java 1. insertPlanCategory() 메소드 실행");
		return sqlSesionTamplate.insert(localName+"insertPlanCategory", planCategory);
	}
	// 2-1. 계획안 카테고리 전체조회+검색+페이징
	public List<PlanCategory> getPlanCategoryList(Map<String, Object> map) {
		logger.debug("PlanDao.java 2. getPlanCategoryList() 메소드 실행");
		logger.debug("{} : <- startPage PlanDao.java", map.get("startPage"));
		logger.debug("{} : <- pagePerRow PlanDao.java", map.get("pagePerRow"));
		logger.debug("{} <- keyword PlanDao.java", map.get("keyword"));
		return sqlSesionTamplate.selectList(localName+"getPlanCategoryList", map);
	}
	// 2-2. 전체 계획안 카테고리 수(페이징)
	public int selectPlanCategoryCountByPage(Map<String, Object> map) {
		logger.debug("selectPlanCategoryCountByPage PlanDao.java");
		logger.debug("{} : word selectPlanCategoryCountByPage PlanDao.java", map.get("keyword"));
		return sqlSesionTamplate.selectOne(localName+"selectPlanCategoryCountByPage", map);
	}
	// 3. 계획안 카테고리 삭제
	public int deletePlanCategory(String planCateCd) {
		logger.debug("{} <- planCateCd deletePlanCategory PlanDao.java", planCateCd);
		return sqlSesionTamplate.delete(localName+"deletePlanCategory", planCateCd);
	}
}
