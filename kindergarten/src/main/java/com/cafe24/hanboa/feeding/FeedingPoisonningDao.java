package com.cafe24.hanboa.feeding;

import java.util.HashMap;
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
	
	//1. 전체조회
	public List<FeedingPoisonning> selectFeedingPoisonningList(HashMap<String, Object> map){
		logger.debug("{} <- selectFeedingPoisonningList FeedingApplicationDao.java",map);
		return sqlSession.selectList(localName+"getFepoList",map);		
	}
	
	//1-2 식중독현황 총 목록 조회
	public int selectFepoTotalCount() {
		logger.debug("{} <- selectFepoTotalCount FeedingApplicationDao.java");
		return sqlSession.selectOne(localName+"getFepoTotalCount");
	}
	
	//2. 수정정보요청
	public FeedingPoisonning feedingPoisonningGetModify(String feedingPoisonning) {
		logger.debug("{} < -- feedingPoisonningGetModify FeedingPoisonningDao.java",feedingPoisonning);
		return sqlSession.selectOne(localName+"getFepoOne",feedingPoisonning);		
	}
	
	//3. 수정처리
	public int feedingPoisonningModify(FeedingPoisonning feedingPoisonning) {
		logger.debug("{} < --feedingPoisonningModify FeedingPoisonningDao.java",feedingPoisonning);
		return sqlSession.update(localName+"modifyFepo",feedingPoisonning );		
	}
	
	// 4.입력처리
	public int feedingPoisonningAdd(FeedingPoisonning feedingPoisonning) {
		logger.debug("{} <-- feedingPoisonningAdd FeedingPoisonningDao.java",feedingPoisonning);
		return sqlSession.insert(localName+"fepoAdd",feedingPoisonning);		
	}
	
	//5.삭제처리
	public int feedingPoisonningDelete(String foodPoisonningGenerationCd) {
		logger.debug("{}<-- feedingPoisonningDelete메서드실행 FeedingPoisonningDao.java",foodPoisonningGenerationCd);
		return sqlSession.delete(localName+"fepoDelete",foodPoisonningGenerationCd);	
	}

}
