package com.cafe24.hanboa.safety;


import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SafetyDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(SafetyDao.class);
	
	String localName = "com.cafe24.hanboa.safety.SafetyMapper.";

	// 1. 안전 교육 및 점검 목록 조회 (연도 & 종류)
	public List<SafetyAndTotalResource> selectSafetyList(HashMap<String, Object> map) {
		logger.debug("1. SafetyDao -- List<Safety> selectSafetyList(HashMap<String, Object> map)");
		logger.debug("map : {}",map);
		logger.debug("-----------------------------------------");
		return sqlSession.selectList(localName+"getSafetyList",map);	
	}
	// 2. 안전 교육 및 점검 등록
	public int insertSafety(Safety safety) {
		logger.debug("2. SafetyDao -- int insertSafety()");
		logger.debug("safety : {}",safety);
		logger.debug("-----------------------------------------");
		return sqlSession.insert(localName+"insertSatefy",safety);
	}
	// 3. 안전 교육 및 점검 수정
	public int updateSafety(Safety safety) {
		logger.debug("3. SafetyDao -- int updateSafety()");
		logger.debug("safety : {}",safety);
		logger.debug("-----------------------------------------");
		return sqlSession.update(localName+"updateSafety",safety);
	}
	// 4. 안전 교육 및 점검 삭제
	public int deleteSafety(String safetyExecutionCd) {
		logger.debug("4. SafetyDao -- int deleteSafety()");
		logger.debug("safetyExecutionCd : {}",safetyExecutionCd);
		logger.debug("-----------------------------------------");
		return sqlSession.delete(localName+"deleteSafety",safetyExecutionCd);
	}
}
