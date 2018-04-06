package com.cafe24.hanboa.feeding;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
	public List<FeedingApplication> getFeedingApplicationList(){
		List<FeedingApplication> list = feedingApplicationDao.selectFeedingApplicationList();
		logger.debug("{} <- getFeedingApplicationList FeedingApplicationService.java", list);
		return list;		
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
	public void feapAdd(FeedingApplication feedingApplication) {
		String inDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
		feedingApplication.setFeapRegistrationDate(inDate);
		feedingApplicationDao.feedingApplicationAdd(feedingApplication);
		logger.debug("{} < -- feedingApplicationAdd FeedingApplicationService.java",feedingApplication);
		logger.debug("{} < -- feedingApplicationAdd FeedingApplicationService.java",inDate);
	}
	
	//5.삭제처리
	public int feedingApplicationDelete(String feedingApplicationCd) {
		int delete = feedingApplicationDao.feedingApplicationDelete(feedingApplicationCd);
		logger.debug("{} < -- feedingApplicationDelete메서드 실행 FeedingApplicationService.java",feedingApplicationCd);
		logger.debug("{} < -- feedingApplicationDelete메서드 실행 FeedingApplicationService.java",delete);
		return delete;
		
	}
	
}
