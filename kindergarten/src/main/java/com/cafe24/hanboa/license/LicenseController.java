package com.cafe24.hanboa.license;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LicenseController {
	
	@Autowired
	private LicenseService licenseService;
	
	private static final Logger logger = LoggerFactory.getLogger(LicenseController.class);

	// 1. 모든 유치원 라이센스 목록 조회 (유치원명으로 검색)
	// 2. 유치원 개별 조회 (유치원 마다)
	// 3-1. 유치원 라이센스 등록 화면
	@RequestMapping(value="/LicenseAdd", method = RequestMethod.GET)
	public String licenseAdd() {
	logger.debug("3-1. LicenseController -- LicenseAddForm");
	logger.debug("----------------------------------------");
		return "license/license_add";
	}
	// 3-2. 유치원 라이센스 등록
	@RequestMapping(value="/LicenseAdd", method = RequestMethod.POST)
	public String licenseAdd(Model model) {
	logger.debug("3-2. LicenseController -- LicenseAdd");
	
	logger.debug("----------------------------------------");
		return "redirest:/";
	}
	// 4-1. 유치원 라이센스 수정 화면
	// 4-2. 유치원 라이센스 수정
	// 5. 유치원 라이센스 삭제
}
