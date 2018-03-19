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
	// 2. 개인조회
	public Teacher getTeacherOne(String memberCd){
		Teacher teacher = teacherDao.selectTeacherOne(memberCd);
		logger.debug("1-2. TeacherService -- TeacherList : {}", teacher);
		logger.debug("-----------------------------------------");
		return teacher;
	}
	// 3. 로그인
	public Teacher login(Teacher teacher){
		Teacher loginTeacher = teacherDao.login(teacher);
		logger.debug("1-2. TeacherService -- TeacherList : {}", teacher);
		logger.debug("-----------------------------------------");
		return teacher;
	}
}
