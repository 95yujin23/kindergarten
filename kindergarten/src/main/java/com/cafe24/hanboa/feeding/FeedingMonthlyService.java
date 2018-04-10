package com.cafe24.hanboa.feeding;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class FeedingMonthlyService {
	
	@Autowired
	private FeedingMonthlyDao femoDao;
	private static Logger logger = LoggerFactory.getLogger(FeedingMonthlyService.class);
	
	//1. 전체조회
	public List<FeedingMonthly> selectFeedingMontlhyList(){
		List<FeedingMonthly> list = femoDao.getFeedingMonthlyList();
		logger.debug("{} < -- selectFeedingMontlhyList FeedingMonthlyService.java",list);
		return list;
	}
	
	//2. 수정정보요청
	public FeedingMonthly modifyGetFeedingMonthly(String feedingMonthlyCd) {
		FeedingMonthly modifyFemo = femoDao.modifyGetFeedingMonthly(feedingMonthlyCd);
		logger.debug("{} < -- modifyGetFeedingMonthly FeedingMonthlyService.java",feedingMonthlyCd);
		logger.debug("{} < -- modifyGetFeedingMonthly FeedingMonthlyService.java",modifyFemo);
		return modifyFemo;		
	}
	
	//3. 수정처리
	public int feedingMonthlyModify(FeedingMonthly feedingMonthly) {
		int feedingMonthlyUpdate = femoDao.FeedingMonthlyModify(feedingMonthly);
		logger.debug("{} < -- feedingMonthlyModify FeedingMonthlyService.java",feedingMonthly);
		logger.debug("{} < -- feedingMonthlyModify FeedingMonthlyService.java",feedingMonthlyUpdate);
		return feedingMonthlyUpdate;		
	}
	
	//4. 입력처리
	public int feedingMonthlyAdd(FeedingMonthly feedingMonthly) {
		int femoAdd = femoDao.feedingMonthlyAdd(feedingMonthly);
		logger.debug("{} <-- feedingMonthlyAdd메서드실행 FeedingMonthlyService.java",feedingMonthly);
		logger.debug("{} <-- feedingMonthlyAdd메서드실행 FeedingMonthlyService.java",femoAdd);
		return femoAdd;		
	}
	
	//4-1 client,contract join 불러오기
	public List<FeedingMonthlyAndClientAndContract> callClientAndContract(){
		List<FeedingMonthlyAndClientAndContract> call = femoDao.callClientAndContract();
		logger.debug("{} < -- callClientAndContract메서드 실행 FeedingMonthlyService.java");
		return call;		
	}
	
	//5.삭제처리
	public int feedingMonthlyDelete(String feedingMonthlyCd) {
		int delete = femoDao.feedingMonthlyDelete(feedingMonthlyCd);
		logger.debug("{} < -- feedingMonthlyDelete메서드 실행 FeedingMonthlyService.java",feedingMonthlyCd);
		logger.debug("{} < -- feedingMonthlyDelete메서드 실행 FeedingMonthlyService.java",delete);
		return delete;
	}
		
	

}
