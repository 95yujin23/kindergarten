package com.cafe24.hanboa;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDao {

		@Autowired
		private SqlSessionTemplate sqlSession;
		
		private static final Logger logger = LoggerFactory.getLogger(AdminDao.class);

		String localName = "com.cafe24.hanboa.AdminMapper.";

		//로그인
		public Admin login(Admin admin) {
			logger.debug("1. AdminDao --  Admin login(Admin admin) 매서드 실행");
			admin.setAdminId(admin.getAdminId());
			admin.setAdminPw(admin.getAdminPw());
			logger.debug("Admin : {}",admin);
			logger.debug("-----------------------------------------");
			return sqlSession.selectOne(localName+"login",admin);
		}
}
