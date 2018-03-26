package com.cafe24.hanboa.feeding;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FeedingApplicationDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(FeedingApplicationDao.class);

	String localName = "com.cafe24.hanboa.feeding.FeedingMapper.";
	
	// 1. 목록조회
	public List<FeedingApplication> selectFeedingApplicationList(){
		logger.debug("{} <- selectFeedingApplicationList FeedingApplicationDao.java");
		return sqlSession.selectList(localName+"getFeedingApplication");
	}
	
	// 2. 업데이트 정보요청
	public FeedingApplication modifyGetFeedingApplication(String feedingApplication) {
		return sqlSession.selectOne(localName+"feapModify");		
	}
	
}
