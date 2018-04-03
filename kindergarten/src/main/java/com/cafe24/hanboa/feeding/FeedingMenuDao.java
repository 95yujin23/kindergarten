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
	
	// 1.전체조회
	public List<FeedingMenu> selectFeedingMenu(){
		logger.debug("{} <-- selectFeedingMenu FeedingMenuDao.java");
		return sessionTemplate.selectList(localName+"getFeedingMenuList");
	}
	
	// 2. 수정정보요청
	public FeedingMenu modifyGetFeedingMenu(String feedingMenu) {
		logger.debug("{} <-- modifyGetFeedingMenu FeedingMenuDao.java",feedingMenu);
		return sessionTemplate.selectOne(localName+"getFemeOne",feedingMenu);		
	}
	
	// 3. 수정처리
	public int updateFeedingMenu(FeedingMenu feedingMenu) {
		logger.debug("{} <-- updateFeedingMenu FeedingMenuDao.java",feedingMenu);
		return sessionTemplate.update(localName+"modifyFeme",feedingMenu);
	}
	
	// 4. 입력처리
	public int insertFeedingMenu(FeedingMenu feedingMenu) {
		logger.debug("{} < -- insertFeedingMenu FeedingMenuDao.java",feedingMenu);
		return sessionTemplate.insert(localName+"insertFeme",feedingMenu);		
	}
	
	//5.삭제처리
	public int feedingMenuDelete(String feedingMenuCd) {
		logger.debug("{} < -- feedingMenuDelete메서드 실행 FeedingMenuDao.java",feedingMenuCd);
		return sessionTemplate.delete(localName+"femeDelete",feedingMenuCd);		
	}
	
	

}
