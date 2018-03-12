package com.cafe24.hanboa.teacher;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TeacherService {
	@Autowired
	private TeacherDao teacherDao;
	
	private static final Logger logger = LoggerFactory.getLogger(TeacherService.class);
	
	// 1. 목록조회
	public List<Teacher> getTeacherList(){
		List<Teacher> list = teacherDao.selectTeacherList();
		logger.debug("1-1. TeacherService -- TeacherList : {}", list);
		logger.debug("-----------------------------------------");
		return list;
	}
}
