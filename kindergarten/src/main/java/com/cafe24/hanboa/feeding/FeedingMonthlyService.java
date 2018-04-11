package com.cafe24.hanboa.feeding;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
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
	public HashMap<String, Object> selectFeedingMontlhyList(int currentPage, int pagePerRow){
		logger.debug("FeedingMonthlyService -- HashMap<String, Object> selectFeedingMontlhyList(int currentPage, int pagePerRow)");
		logger.debug("int currentPage : {}",currentPage);
		logger.debug("int pagePerRow : {}",pagePerRow);
		// 페이징 작업
		int startPage = 0;
		if(currentPage!=1) { //현재 페이지가 1이 아닌 조건
			startPage = (currentPage-1)*pagePerRow;
			//시작페이지 = (현재페이지-1) * 5(보여줄목록수) 
		}
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("startPage", startPage);
		map.put("pagePerRow", pagePerRow);
		List<FeedingMonthly> list = femoDao.getFeedingMonthlyList(map);
		logger.debug("List<Teacher> : feedingApplicationDao.selectFeedingApplicationList(map) : {}", map);
		int TotalCount = femoDao.selectFemoTotalCount();
		logger.debug("int TotalCount : FeedingMonthlyDao.selectFemoTotalCount() : {}", TotalCount);
		int countPage = TotalCount/pagePerRow;
						//페이지 수 = 총 목록수/보여줄목록수
		if(TotalCount%pagePerRow!=0) { //총 목록 수를 보여줄 목록수로 나눴을 때 나머지가 0이 아닌 조건
			countPage++; //countPage에 1씩 더한다.
		}
		logger.debug("TotalCount/pagePerRow = int countPage : {}", countPage);
		//return
		HashMap<String, Object> returnMap = new HashMap<String, Object>();
		returnMap.put("list", list);
		returnMap.put("countPage",countPage);
		logger.debug("HashMap<String, Object> returnMap : {}", returnMap);
		logger.debug("-----------------------------------------");
		return returnMap;				
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
	public void feedingMonthlyAdd(FeedingMonthly feedingMonthly) {
		String inDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
		feedingMonthly.setFemoRegistrationDate(inDate);
		femoDao.feedingMonthlyAdd(feedingMonthly);
		logger.debug("{} <-- feedingMonthlyAdd메서드실행 FeedingMonthlyService.java",feedingMonthly);
		logger.debug("{} <-- feedingMonthlyAdd메서드실행 FeedingMonthlyService.java",inDate);
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
