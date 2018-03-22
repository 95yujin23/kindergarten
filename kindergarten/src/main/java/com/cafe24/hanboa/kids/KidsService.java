package com.cafe24.hanboa.kids;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.hanboa.teacher.Teacher;
import com.cafe24.hanboa.teacher.TeacherService;

@Service
@Transactional
public class KidsService {

	@Autowired
	private KidsDao kidsDao;
	private static final Logger logger = LoggerFactory.getLogger(TeacherService.class);
	
	// 1. 영유아목록조회
	public List<Kids> getKidsList(HashMap<String, Object> map) {
		List<Kids> list = kidsDao.selectKidsList(map);
		logger.debug("KidsService -- getKidsList : {}", list);
		logger.debug("-----------------------------------------");
		return list;
	}
	
	// 영유아 편성 반별 조회
	public List<Kids> getKidsListByClass(Teacher teacher){
		logger.debug("KidsService -- getKidsListByClass : {}", teacher);
		List<Kids> list = kidsDao.selectKidsListByClass(teacher);
		logger.debug("List<Kids> : {}", list);
		logger.debug("-----------------------------------------");
		return list;
	}
	
}
