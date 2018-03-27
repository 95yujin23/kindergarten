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
	
	public List<FeedingMonthly> selectFeedingMontlhyList(){
		List<FeedingMonthly> list = femoDao.getFeedingMonthlyList();
		return list;
		
	}

}
