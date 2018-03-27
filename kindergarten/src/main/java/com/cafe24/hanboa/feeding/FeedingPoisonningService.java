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

	public List<FeedingPoisonning> getFeedingPoisonningList(){
		List<FeedingPoisonning> list = fepoDao.selectFeedingPoisonningList();
		logger.debug("{} <- getFeedingPoisonningList FeedingPoisonningService.java",list);
		return list;
		
	}
}
