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
	
	// 1.전체조회
	public List<FeedingMenu> getFeedingMenuList() {
		List<FeedingMenu> list = femeDao.selectFeedingMenu();
		logger.debug("{} <- getFeedingMenuList FeedingMenuService.java", list);
		return list;
	}
	
	// 2. 수정정보요청
	public FeedingMenu modifyGetfeedingMenu(String feedingMenuCd) {
		FeedingMenu feedingMenu = femeDao.modifyGetFeedingMenu(feedingMenuCd);
		logger.debug("{} <- feedingmenu FeedingMenuService.java",feedingMenu);
		return feedingMenu;
	}
	
	// 3.수정처리
	public int updateFeedingMenu(FeedingMenu feedingMenu) {
		int modifyFeedingMenu = femeDao.updateFeedingMenu(feedingMenu);
		logger.debug("{} <-- updateFeedingMenu FeedingMenuService.java",feedingMenu);
		return modifyFeedingMenu;
		
	}
}
