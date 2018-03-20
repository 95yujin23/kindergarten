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
	
	// 1. 교직원 목록 조회
	public List<Teacher> getTeacherList(){
		List<Teacher> list = teacherDao.selectTeacherList();
		logger.debug("1. TeacherService -- getTeacherList() : {}", list);
		logger.debug("-----------------------------------------");
		return list;
	}
	// 2. 교직원 개인 조회
	public Teacher getTeacherOne(String memberCd){
		Teacher teacher = teacherDao.selectTeacherOne(memberCd);
		logger.debug("2. TeacherService -- getTeacherOne(String memberCd) : {}", teacher);
		logger.debug("-----------------------------------------");
		return teacher;
	}
	// 3. 로그인
	public Teacher login(Teacher teacher){
		logger.debug("3. TeacherService -- login(String teacherEmail, String teacherPw)");
		teacher = teacherDao.login(teacher);
		logger.debug("-----------------------------------------");
		return teacher;
	}
	// 4. 교직원 등록
	public int addTeacher(Teacher teacher) {
		int addTeacher = teacherDao.insertTeacher(teacher);
		logger.debug("4. TeacherService -- addTeacher()");
		return addTeacher;		
	}
	// 5. 교직원 수정
	public int modifyTeacher(Teacher teacher) {
		int modifyTeacher = teacherDao.updateTeacher(teacher);
		return modifyTeacher;
	}
	// 6. 교직원 삭제 & 탈퇴
	public int removeTeacher(String teacherCd) {
		int removeTeacher = teacherDao.deleteTeacher(teacherCd);
		return removeTeacher;
	}
}
