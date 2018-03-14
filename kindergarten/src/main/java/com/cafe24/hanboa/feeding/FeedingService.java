package com.cafe24.hanboa.feeding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FeedingService {
	@Autowired	
	private FeedingDao feedingDao;
		
	private static final Logger logger = LoggerFactory.getLogger(FeedingService.class);

}
