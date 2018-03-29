package com.cafe24.hanboa.totalResource;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class TotalResourceDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(TotalResourceDao.class);
	
	String localName = "com.cafe24.hanboa.totalResource.TotalResourceMapper.";

	// 1. 통합자원코드 조회
	public List<TotalResource> selectTotalResourceList() {
		logger.debug("1. TotalResourceDao -- List<Teacher> selectTotalResourceList() 매서드 실행");
		return sqlSession.selectList("com.cafe24.hanboa.totalResource.TotalResourceMapper."+"getTotalResourceList");
	}
	// 2. 통합자원코드 등록
	public int insertTotalResource(TotalResource totalResource) {
		logger.debug("2. TotalResourceDao -- int insertTotalResource(TotalResource totalResource) 매서드 실행");
		logger.debug("TotalResource : {}",totalResource);
		logger.debug("-----------------------------------------");
		return sqlSession.insert(localName+"insertTotalResource",totalResource);
	}
	// 3. 통합자원코드 수정
	public int updateTotalResource(TotalResource totalResource) {
		logger.debug("3. TotalResourceDao -- int updateTotalResource(TotalResource totalResource) 매서드 실행");
		logger.debug("TotalResource : {}",totalResource);
		logger.debug("-----------------------------------------");
		return sqlSession.update(localName+"updateTotalResource",totalResource);
	}
	// 4. 통합자원코드 삭제
	public int deleteTotalResource(String totalResourceCd) {
		logger.debug("4. TotalResourceDao -- int deleteTotalResource(String totalResourceCd) 매서드 실행");
		logger.debug("totalResourceCd : {}",totalResourceCd);
		logger.debug("-----------------------------------------");
		return sqlSession.delete(localName+"deleteTotalResource",totalResourceCd);
	}
}
