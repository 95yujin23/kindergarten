package com.cafe24.hanboa.classformation;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClassService {
	// 반 편성 처리 service
	
	@Autowired
	private ClassDao classDao;
	private static final Logger logger = LoggerFactory.getLogger(ClassService.class);
	//tb_kids_class
	public List<KidsClass> selectKidsClassList() {
		logger.debug("ClassService --> selectKidsClassList()메소드 실행");
		List<KidsClass> list = classDao.selectKidsClassList();
		return list;
		
	}
}
