package com.cafe24.hanboa.feeding;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FeedingMenuService {
	
	@Autowired
	private FeedingMenuDao femeDao;
	private static final Logger logger = LoggerFactory.getLogger(FeedingMenuService.class);
	
	public List<FeedingMenu> getFeedingMenuList() {
		List<FeedingMenu> list = femeDao.selectFeedingMenu();
		logger.debug("{} <- getFeedingMenuList FeedingMenuService.java", list);
		return list;
	}

}
