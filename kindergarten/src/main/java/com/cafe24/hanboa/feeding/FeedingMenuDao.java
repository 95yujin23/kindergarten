package com.cafe24.hanboa.feeding;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FeedingMenuDao {
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	private static final Logger logger = LoggerFactory.getLogger(FeedingMenuDao.class);
	
	String localName = "com.cafe24.hanboa.feeding.FeedingMapper.";
	
	public List<FeedingMenu> selectFeedingMenu(){
		return sessionTemplate.selectList(localName+"getFeedingMenuList");
	}
	
	

}
