package com.cafe24.hanboa.license;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class LicenseDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(LicenseDao.class);
	
	String localName = "com.cafe24.hanboa.license.LicenseMapper.";

	// 1-1. 라이센스 목록 조회
	public List<License> selectLicenseList(){
		logger.debug("1-2. LicenseDao -- List<License> selectLicenseList() 매서드 실행");
		return sqlSession.selectList(localName+"getLicenseList");
	}
		
	// 1-2. 라이센스 조회
	public License selectLicenseOne(License license) {
		logger.debug("1-2. LicenseDao -- License selectLicenseOne() 매서드 실행");
		return sqlSession.selectOne(localName+"getLicenseOne",license);
	}
}
