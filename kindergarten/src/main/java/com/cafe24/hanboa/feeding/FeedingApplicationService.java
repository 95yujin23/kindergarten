package com.cafe24.hanboa.feeding;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.hanboa.kids.Kids;


@Service
@Transactional
public class FeedingApplicationService {
	@Autowired	
	private FeedingApplicationDao feedingApplicationDao;		
	private static final Logger logger = LoggerFactory.getLogger(FeedingApplicationService.class);

	//1.전체조회
	public HashMap<String, Object> getFeedingApplicationList(int currentPage, int pagePerRow){
		logger.debug("FeedingApplicationService -- HashMap<String, Object> getFeedingApplicationList(int currentPage, int pagePerRow)");
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
		List<FeedingApplication> list = feedingApplicationDao.selectFeedingApplicationList(map);
		logger.debug("List<Teacher> : feedingApplicationDao.selectFeedingApplicationList(map) : {}", map);
		int TotalCount = feedingApplicationDao.selectFeapTotalCount();
		logger.debug("int TotalCount : feedingApplicationDao.selectFeapTotalCount() : {}", TotalCount);
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
	
	//1-1 영유아 불러오기
	public List<Kids> callKids(){
		List<Kids> kidsCall = feedingApplicationDao.callKids();
		logger.debug("{} <-- callKids FeedingApplicationService.java",kidsCall);
		return kidsCall;
	}
	
	//1-2 월별급식 불러오기
	public List<FeedingMonthly> callMonthly(){
		List<FeedingMonthly> femoCall = feedingApplicationDao.callFeedingMonthly();
		logger.debug("{} <-- callKids FeedingApplicationService.java",femoCall);
		return femoCall;
	}
	
	
	//2. 수정 정보요청
	public FeedingApplication modifyGetfeap(String feedingApplicationCd) {		
		FeedingApplication modifyGet = feedingApplicationDao.modifyGetFeedingApplication(feedingApplicationCd);
		logger.debug("{} <- modifyGetfeap FeedingApplicationService.java",feedingApplicationCd);
		logger.debug("{} <- modifyGetfeap FeedingApplicationService.java",modifyGet);
		return modifyGet;
	}
	
	//3. 수정처리
	public int modifyFeap(FeedingApplication feedingApplication) {
		int modifyFeedingApplication = feedingApplicationDao.modifyFeap(feedingApplication);
		logger.debug("{} <-- modifyFeap FeedingApplicationService,java",feedingApplication);
		logger.debug("{} <-- modifyFeap FeedingApplicationService,java",modifyFeedingApplication);
		return modifyFeedingApplication;		
	}
	
	//4.입력처리
	public int feapAdd(FeedingApplication feedingApplication) {
		String inDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
		feedingApplication.setFeapRegistrationDate(inDate);
		
		int addFeapClosingIncome = 0;
		try {
			addFeapClosingIncome = feedingApplicationDao.feedingApplicationAdd(feedingApplication);
			addFeapClosingIncome = feedingApplicationDao.modifyFeapClosingIncome(feedingApplication);		
		}catch(DataAccessException dae) {
				dae.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
		}
		int cd = feedingApplication.getFeapClosingIncome();
		logger.debug("{} < -- feedingApplicationAdd FeedingApplicationService.java",feedingApplication);
		logger.debug("{} < -- feedingApplicationAdd FeedingApplicationService.java",inDate);
		logger.debug("{} < -- feedingApplicationAdd FeedingApplicationService.java int cd",cd);
		return addFeapClosingIncome;
	}
	
	//5.삭제처리
	public int feedingApplicationDelete(String feedingApplicationCd) {
		int delete = feedingApplicationDao.feedingApplicationDelete(feedingApplicationCd);
		logger.debug("{} < -- feedingApplicationDelete메서드 실행 FeedingApplicationService.java",feedingApplicationCd);
		logger.debug("{} < -- feedingApplicationDelete메서드 실행 FeedingApplicationService.java",delete);
		return delete;		
	}
	

	
	
}
