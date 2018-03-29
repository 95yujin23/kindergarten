package com.cafe24.hanboa.feeding;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FeedingMonthlyDao {
	
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	private static Logger logger = LoggerFactory.getLogger(FeedingMonthlyDao.class);
	
	String localName = "com.cafe24.hanboa.feeding.FeedingMapper.";
	
	//1. 전제조회
	public List<FeedingMonthly> getFeedingMonthlyList(){
		logger.debug("< -- getFeedingMonthlyList FeedingMonthlyDao.java");
		return sessionTemplate.selectList(localName+"getfemoList");
	}
	
	//2. 수정정보요청
	public FeedingMonthly modifyGetFeedingMonthly(String feedingMonthly) {
		logger.debug("< -- modifyGetFeedingMonthly FeedingMonthlyDao.java",feedingMonthly);
		return sessionTemplate.selectOne(localName+"getfemoOne",feedingMonthly);
	}
		
	//3. 수정처리
	public int FeedingMonthlyModify(FeedingMonthly feedingMonthly) {
		logger.debug("< -- FeedingMonthlyModify FeedingMonthlyDao.java",feedingMonthly);
		return sessionTemplate.update(localName+"modifyFemo",feedingMonthly);		
	}
	

}
