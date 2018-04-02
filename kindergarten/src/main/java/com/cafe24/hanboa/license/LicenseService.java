package com.cafe24.hanboa.license;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LicenseService {
	@Autowired
	private LicenseDao licenseDao;

	private static final Logger logger = LoggerFactory.getLogger(LicenseService.class);		

}
