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
	
}
