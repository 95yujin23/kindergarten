package com.cafe24.hanboa.totalResource;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TotalResourceService {

	@Autowired
	private TotalResourceDao totalResourceDao;
	
	private static final Logger logger = LoggerFactory.getLogger(TotalResourceService.class);
	
	// 1. 통합자원코드 조회
	public List<TotalResource> getTotalResourceList(){
		List<TotalResource> list = totalResourceDao.selectTotalResourceList();
		logger.debug("1. TotalResourceService -- getTotalResourceList() : {}", list);
		logger.debug("-----------------------------------------");
		return list;
	}
	// 2. 통합자원코드 등록
	public int addTotalResource(TotalResource totalResource) {
		logger.debug("2. TotalResourceService -- addTotalResource(TotalResource totalResource) : {}",totalResource);
		int addTotalResource = totalResourceDao.insertTotalResource(totalResource);
		logger.debug("-----------------------------------------");
		return addTotalResource;	
	}
	// 3. 통합자원코드 수정
	public int modifyTotalResource(TotalResource totalResource) {
		logger.debug("3. TotalResourceService -- modifyTotalResource(TotalResource totalResource) : {}",totalResource);
		int modifyTotalResource = totalResourceDao.updateTotalResource(totalResource);
		logger.debug("-----------------------------------------");
		return modifyTotalResource;
	}
	// 4. 통합자원코드 삭제
	public int removeTotalResource(String totalResourceCd) {
		logger.debug("4. TotalResourceService -- removeTotalResource(String totalResourceCd) : {}",totalResourceCd);
		int removeTotalResource = totalResourceDao.deleteTotalResource(totalResourceCd);
		logger.debug("-----------------------------------------");
		return removeTotalResource;
	}
}
