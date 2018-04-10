package com.cafe24.hanboa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class AdminService {
	@Autowired
	private AdminDao adminDao;
	private static final Logger logger = LoggerFactory.getLogger(AdminService.class);

	// 3. 로그인
		public Admin login(Admin admin){
			logger.debug("3. TeacherService -- login(String teacherEmail, String teacherPw)");
			admin = adminDao.login(admin);
			logger.debug("-----------------------------------------");
			return admin;
		}
}
