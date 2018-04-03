package com.cafe24.hanboa.feeding;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FeedingPoisonningService {
	
	@Autowired
	private FeedingPoisonningDao fepoDao;
	private static final Logger logger = LoggerFactory.getLogger(FeedingPoisonningService.class);

	//1. 전체조회
	public List<FeedingPoisonning> getFeedingPoisonningList(){
		List<FeedingPoisonning> list = fepoDao.selectFeedingPoisonningList();
		logger.debug("{} <- getFeedingPoisonningList FeedingPoisonningService.java",list);
		return list;
	}
	
	//2. 수정정보요청
	public FeedingPoisonning feedingPoisonningGetModify(String foodPoisonningGenerationCd) {
		FeedingPoisonning fepoModify = fepoDao.feedingPoisonningGetModify(foodPoisonningGenerationCd);
		logger.debug("{} < -- feedingPoisonningGetModify FeedingPoisonningService.java",foodPoisonningGenerationCd);
		logger.debug("{} < -- feedingPoisonningGetModify FeedingPoisonningService.java",fepoModify);
		return fepoModify;		
	}
	
	//3. 수정처리
	public int feedingPoisonningModify(FeedingPoisonning feedingPoisonning) {
		int modifyFepo = fepoDao.feedingPoisonningModify(feedingPoisonning);
		logger.debug("{} <-- feedingPoisonningModify FeedingPoisonningService.java",feedingPoisonning);
		logger.debug("{} <-- feedingPoisonningModify FeedingPoisonningService.java",modifyFepo);
		return modifyFepo;		
	}
	
	// 4. 입력처리
	public int feedingPoisonningAdd(FeedingPoisonning feedingPoisonning) {
		int fepoAdd = fepoDao.feedingPoisonningAdd(feedingPoisonning);
		logger.debug("{} <-- feedingPoisonningAdd FeedingPoisonningService.java",feedingPoisonning);
		logger.debug("{} <-- feedingPoisonningAdd FeedingPoisonningService.java",fepoAdd);
		return fepoAdd;		
	}
}
