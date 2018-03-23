package com.cafe24.hanboa.teacher;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(TeacherDao.class);
	
	String localName = "com.cafe24.hanboa.teacher.TeacherMapper.";
	
	// 1. 교직원 목록 조회
	public List<Teacher> selectTeacherList() {
		logger.debug("1. TeacherDao -- List<Teacher> selectTeacherList() 매서드 실행");
		return sqlSession.selectList(localName+"getTeacherList");
	}
	// 2. 교직원 개인 조회
	public Teacher selectTeacherOne(String teacherCd) {
		logger.debug("2. TeacherDao -- Teacher selectTeacherOne() 매서드 실행");
		logger.debug("teacherCd : {}",teacherCd);
		logger.debug("-----------------------------------------");
		return sqlSession.selectOne(localName+"getTeacherOne",teacherCd);
	}
	// 3. 로그인
	public Teacher login(Teacher teacher) {
		logger.debug("3. TeacherDao -- Teacher login(Teacher teacher) 매서드 실행");
		teacher.setTeacherEmail(teacher.getTeacherEmail());
		teacher.setTeacherPw(teacher.getTeacherPw());
		logger.debug("teacher : {}",teacher);
		logger.debug("-----------------------------------------");
		return sqlSession.selectOne(localName+"login",teacher);
	}
	// 4. 교직원 등록
	public int insertTeacher(Teacher teacher) {
		logger.debug("4. TeacherDao -- int insertTeacher(Teacher teacher) 매서드 실행");
		logger.debug("teacher : {}",teacher);
		logger.debug("-----------------------------------------");
		return sqlSession.insert(localName+"insertTeacher",teacher);
	}
	// 5. 교직원 수정
	public int updateTeacher(Teacher teacher) {
		logger.debug("5. TeacherDao -- int updateTeacher(Teacher teacher) 매서드 실행");
		logger.debug("teacher : {}",teacher);
		logger.debug("-----------------------------------------");
		return sqlSession.update(localName+"updateTeacher",teacher);
	}
	// 6. 교직원 삭제 & 탈퇴
	public int deleteTeacher(String teacherCd) {
		logger.debug("6. TeacherDao -- int deleteTeacher(String teacherCd) 매서드 실행");
		logger.debug("teacherCd : {}",teacherCd);
		logger.debug("-----------------------------------------");
		return sqlSession.update(localName+"deleteTeacher",teacherCd);		
	}
	// 7. 인건비 지급 목록 조회
	public List<TeacherPay> selectTeacherPayList() {
		logger.debug("7. TeacherDao -- List<TeacherPay> selectTeacherPayList() 매서드 실행");
		logger.debug("-----------------------------------------");
		return sqlSession.selectList(localName+"getTeacherPayList");
	}
	// 8. 인건비 지급 개인 조회
	public TeacherPay selectTeacherPayOne(String teacherCd) {
		logger.debug("8. TeacherDao -- TeacherPay selectTeacherPayOne(String teacherCd) 매서드 실행");
		logger.debug("teacherCd : {}",teacherCd);
		logger.debug("-----------------------------------------");
		return sqlSession.selectOne(localName+"getTeacherPayOne",teacherCd);
	}
	// 9. 인건비 지급 등록
	public int insertTeacherPay(TeacherPay teacherPay) {
		logger.debug("9. TeacherDao -- int insertTeacherPay(TeacherPay teacherPay) 매서드 실행");
		logger.debug("teacherPay : {}",teacherPay);
		logger.debug("-----------------------------------------");
		return sqlSession.insert(localName+"insertTeacherPay",teacherPay);
	}
	// 10. 인건비 지급 수정
	public int updateTeacherPay(TeacherPay teacherPay) {
		logger.debug("10. TeacherDao -- int updateTeacherPay(TeacherPay teacherPay) 매서드 실행");
		logger.debug("TeacherPay : {}",teacherPay);
		logger.debug("-----------------------------------------");
		return sqlSession.update(localName+"updateTeacherPay",teacherPay);
	}
	// 11. 인건비 지급 삭제
	public int deleteTeacherPay(String teacherCd) {
		logger.debug("11. TeacherDao -- int deleteTeacherPay(String teacherCd) 매서드 실행");
		logger.debug("teacherCd : {}",teacherCd);
		logger.debug("-----------------------------------------");
		return sqlSession.delete(localName+"deleteTeacherPay",teacherCd);
	}
	
}
