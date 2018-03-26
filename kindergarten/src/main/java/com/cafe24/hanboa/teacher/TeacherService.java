package com.cafe24.hanboa.teacher;

import java.util.HashMap;
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
		logger.debug("4. TeacherService -- addTeacher(Teacher teacher) : {}",teacher);
		int addTeacher = teacherDao.insertTeacher(teacher);
		logger.debug("-----------------------------------------");
		return addTeacher;		
	}
	// 5. 교직원 수정
	public int modifyTeacher(Teacher teacher) {
		logger.debug("5. TeacherService -- modifyTeacher(Teacher teacher) : {}",teacher);
		int modifyTeacher = teacherDao.updateTeacher(teacher);
		logger.debug("-----------------------------------------");
		return modifyTeacher;
	}
	// 6. 교직원 삭제 & 탈퇴
	public int removeTeacher(String teacherCd) {
		logger.debug("6. TeacherService -- removeTeacher(String teacherCd) : {}",teacherCd);
		int removeTeacher = teacherDao.deleteTeacher(teacherCd);
		logger.debug("-----------------------------------------");
		return removeTeacher;
	}
	// 7. 인건비 지급 목록 조회
	public List<TeacherAndTeacherPay> getTeacherPayList(HashMap<String, Object> map) {
		logger.debug("7. TeacherService -- getTeacherPayList(HashMap<String, Object> map)");
		logger.debug(" map : {}", map);
		List<TeacherAndTeacherPay> list = teacherDao.selectTeacherPayList(map);
		logger.debug("-----------------------------------------");
		return list;
	}
	// 8. 인건비 지급 개인 조회
	public TeacherPay getTeacherPayOne(String teacherCd) {
		logger.debug("8. TeacherService -- removeTeacher(String teacherCd) : {}",teacherCd);
		TeacherPay teacherPay = teacherDao.selectTeacherPayOne(teacherCd);
		logger.debug("-----------------------------------------");
		return teacherPay;
	}
	// 9. 인건비 지급 등록
	public int addTeacherPay(TeacherPay teacherPay) {
		logger.debug("4. TeacherService -- addTeacherPay(TeacherPay teacherPay) : {}",teacherPay);
		int addTeacher = teacherDao.insertTeacherPay(teacherPay);
		logger.debug("-----------------------------------------");
		return addTeacher;
	}
	// 10. 인건비 지급 수정
		public int modifyTeacherPay(TeacherPay teacherPay) {
			logger.debug("5. TeacherService -- modifyTeacherPay(TeacherPay teacherPay) : {}",teacherPay);
			int modifyTeacher = teacherDao.updateTeacherPay(teacherPay);
			logger.debug("-----------------------------------------");
			return modifyTeacher;
	}
	// 11. 인건비 지급 삭제
	public int removeTeacherPay(String teacherCd) {
		logger.debug("6. TeacherService -- removeTeacherPay(String teacherCd) : {}",teacherCd);
		int removeTeacher = teacherDao.deleteTeacherPay(teacherCd);
		logger.debug("-----------------------------------------");
		return removeTeacher;
	}
}
