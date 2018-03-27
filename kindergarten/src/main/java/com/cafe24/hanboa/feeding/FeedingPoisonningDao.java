package com.cafe24.hanboa.feeding;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class FeedingPoisonningDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(FeedingPoisonningDao.class);
	
	String localName = "com.cafe24.hanboa.feeding.FeedingMapper.";
	
	public List<FeedingPoisonning> selectFeedingPoisonningList(){
		return sqlSession.selectList(localName+"getFepoList");
		
	}

}
