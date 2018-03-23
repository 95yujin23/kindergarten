package com.cafe24.hanboa.totalResource;


import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TotalResourceController {

	private static final Logger logger = LoggerFactory.getLogger(TotalResourceController.class);
	
	// 1.통합자원코드 등록
		@RequestMapping(value="/TotalResourceAdd")
		public String totalResourceAdd(Model model, HttpSession session) {
			logger.debug("1. TotalResourceController -- TotalResourceAdd");
			return "total_resource/total_resource_add";
		}
}
