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
		logger.debug("1-1. TeacherDao -- List<Teacher> selectTeacherList() 매서드 실행");
		return sqlSession.selectList(localName+"getTeacherList");
	}
	// 2. 교직원 개인 조회
	public Teacher selectTeacherOne(String teacherCd) {
		logger.debug("1-2. TeacherDao -- Teacher selectTeacherOne() 매서드 실행");
		return sqlSession.selectOne(localName+"getTeacherOne",teacherCd);
	}
	// 3. 로그인
	public Teacher login(Teacher teacher) {
		logger.debug("1-3. TeacherDao -- Teacher login(Teacher teacher) 매서드 실행");
		teacher.setTeacherEmail(teacher.getTeacherEmail());
		teacher.setTeacherPw(teacher.getTeacherPw());
		return sqlSession.selectOne(localName+"login",teacher);
	}
	// 4. 교직원 등록
	public int insertTeacher(Teacher teacher) {
		logger.debug("1-3. TeacherDao -- Teacher login(Teacher teacher) 매서드 실행");
		return sqlSession.insert(localName+"insertTeacher",teacher);
	}
	// 5. 교직원 수정
	public int updateTeacher(Teacher teacher) {
		return sqlSession.update(localName+"updateTeacher",teacher);
	}
	// 6. 교직원 삭제 & 탈퇴
	public int deleteTeacher(String teacherCd) {
		return sqlSession.update(localName+"deleteTeacher",teacherCd);		
	}
	// 7. 인건비 지급 목록 조회
	public List<TeacherPay> selectTeacherPayList() {
		return sqlSession.selectList(localName+"getTeacherPayList");
	}
	// 8. 인건비 지급 개인 조회
	public TeacherPay selectTeacherPayOne(String teacherCd) {
		return sqlSession.selectOne(localName+"getTeacherPayOne",teacherCd);
	}
	// 9. 인건비 지급 등록
	public int insertTeacherPay(TeacherPay teacherPay) {
		return sqlSession.insert(localName+"insertTeacherPay",teacherPay);
	}
	// 10. 인건비 지급 수정
	public int updateTeacherPay(TeacherPay teacherPay) {
		return sqlSession.update(localName+"updateTeacherPay",teacherPay);
	}
	// 11. 인건비 지급 삭제
	public int deleteTeacherPay(String teacherCd) {
		return sqlSession.delete(localName+"deleteTeacherPay",teacherCd);
	}
	
}
