package com.cafe24.hanboa.feeding;

import java.util.HashMap;
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
	public HashMap<String, Object> getFeedingPoisonningList(int currentPage, int pagePerRow){
		logger.debug("FeedingPoisonningService -- HashMap<String, Object> getFeedingPoisonningList(int currentPage, int pagePerRow)");
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
		List<FeedingPoisonning> list = fepoDao.selectFeedingPoisonningList(map);
		logger.debug("List<Teacher> : FeedingPoisonningDao.selectFeedingPoisonningList(map) : {}", map);
		int TotalCount = fepoDao.selectFepoTotalCount();
		logger.debug("int TotalCount : FeedingPoisonningDao.selectFepoTotalCount() : {}", TotalCount);
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
	
	//5. 삭제처리
	public int feedingPoisonningDelete(String foodPoisonningGenerationCd) {
		int delete = fepoDao.feedingPoisonningDelete(foodPoisonningGenerationCd);
		logger.debug("{} <--feedingPoisonningDelete메서드 실행 FeedingPoisonningService.java ",foodPoisonningGenerationCd);
		logger.debug("{} <--feedingPoisonningDelete메서드 실행 FeedingPoisonningService.java ",delete);
		return delete;
		
	}
}
