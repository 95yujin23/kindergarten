package com.cafe24.hanboa.kids;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.hanboa.teacher.TeacherService;

@Service
@Transactional
public class KidsService {

	@Autowired
	private KidsDao kidsDao;
	private static final Logger logger = LoggerFactory.getLogger(TeacherService.class);
	
	// 1. 영유아목록조회
	public List<Kids> selectAllKids() {
		List<Kids> list = kidsDao.selectAllKids();
		logger.debug("KidsService -- KidsList : {}", list);
		logger.debug("-----------------------------------------");
		return list;
	}
	
	
}
