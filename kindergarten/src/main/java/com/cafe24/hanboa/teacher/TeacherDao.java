package com.cafe24.hanboa.teacher;

import java.util.HashMap;
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
	
	// 목록조회
	public List<Teacher> selectTeacherList() {
		logger.debug("1-1. TeacherDao -- List<Teacher> selectTeacherList() 매서드 실행");
		return sqlSession.selectList(localName+"getTeacherList");
	}
	// 개인 조회
	public Teacher selectTeacherOne(String memberCd) {
		logger.debug("1-2. TeacherDao -- Teacher selectTeacherOne() 매서드 실행");
		return sqlSession.selectOne(localName+"getTeacherOne");
	}
	// 로그인
	public Teacher login(String teacherEmail, String teacherPw) {
		logger.debug("1-3. TeacherDao -- Teacher login(Teacher teacher) 매서드 실행");
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("teacherEmail", teacherEmail);
		map.put("teacherPw", teacherPw);
		return sqlSession.selectOne(localName+"login",map);
	}
}
