package com.cafe24.hanboa.feeding;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FeedingApplicationService {
	@Autowired	
	private FeedingApplicationDao feedingApplicationDao;		
	private static final Logger logger = LoggerFactory.getLogger(FeedingApplicationService.class);

	//1.전체조회
	public List<FeedingApplication> getFeedingApplicationList(){
		List<FeedingApplication> list = feedingApplicationDao.selectFeedingApplicationList();
		logger.debug("{} <- getFeedingApplicationList FeedingApplicationService", list);
		return list;		
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
		int feapinsert = feedingApplicationDao.feedingApplicationAdd(feedingApplication);
		logger.debug("{} < -- feedingApplicationAdd FeedingApplicationService.java",feedingApplication);
		logger.debug("{} < -- feedingApplicationAdd FeedingApplicationService.java",feapinsert);
		return feapinsert;
	}
	
	//5.삭제처리
	public int feedingApplicationDelete(String feedingApplicationCd) {
		int delete = feedingApplicationDao.feedingApplicationDelete(feedingApplicationCd);
		logger.debug("{} < -- feedingApplicationDelete메서드 실행 FeedingApplicationService.java",feedingApplicationCd);
		logger.debug("{} < -- feedingApplicationDelete메서드 실행 FeedingApplicationService.java",delete);
		return delete;
		
	}
	
}
