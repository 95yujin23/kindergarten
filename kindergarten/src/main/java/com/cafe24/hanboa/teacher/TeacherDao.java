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
	
	String localName = "com.cafe24.hanboa.mappers.TeacherMapper.";
	
	// 목록조회
	public List<Teacher> selectTeacherList() {
		logger.debug("1-1. TeacherDao -- List<Teacher> selectTeacherList() 매서드 실행");
		return sqlSession.selectList(localName+"getTeacherList");
	}
}
