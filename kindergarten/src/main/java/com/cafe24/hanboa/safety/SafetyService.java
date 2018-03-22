package com.cafe24.hanboa.safety;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SafetyService {
		@Autowired
		private SafetyDao safetyDao;
		
		private static final Logger logger = LoggerFactory.getLogger(SafetyService.class);		

		// 1. 안전 교육 및 점검 목록 조회
		public List<Safety> getSafetyList(HashMap<String, Object> map) {
			logger.debug("1. SafetyService -- List<Safety> getSafetyList(HashMap<String, Object> map) : {}", map);
			List<Safety> list = safetyDao.selectSafetyList(map);
			logger.debug("list : {}", list);
			logger.debug("-----------------------------------------");
			return list;
		}
		// 2. 안전 교육 및 점검 등록
		public int addSafety(Safety safety) {
			logger.debug("2. SafetyService -- int addSafety(Safety safety) : {}", safety);
			int addSafety = safetyDao.insertSafety(safety);
			logger.debug("addSafety : {}", addSafety);
			logger.debug("-----------------------------------------");
			return addSafety;			
		}
		// 3. 안전 교육 및 점검 수정
		public int modifySafety(Safety safety) {
			logger.debug("3. SafetyService -- int modifySafety(Safety safety) : {}", safety);
			int modifySafety = safetyDao.updateSafety(safety);
			logger.debug("modifySafety : {}", modifySafety);
			logger.debug("-----------------------------------------");
			return modifySafety;
		}
		// 4. 안전 교육 및 점검 삭제
		public int removeSafety(String safetyExecutionCd) {
			logger.debug("4. SafetyService -- int removeSafety(String safetyExecutionCd) : {}", safetyExecutionCd);
			int removeSafety = safetyDao.deleteSafety(safetyExecutionCd);
			logger.debug("removeSafety : {}", removeSafety);
			logger.debug("-----------------------------------------");
			return removeSafety;
		}
}
