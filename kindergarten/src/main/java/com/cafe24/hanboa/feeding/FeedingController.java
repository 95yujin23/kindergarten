package com.cafe24.hanboa.feeding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FeedingController {
	@Autowired
	private FeedingService feedingService;
	
	private static final Logger logger = LoggerFactory.getLogger(FeedingController.class);

}
