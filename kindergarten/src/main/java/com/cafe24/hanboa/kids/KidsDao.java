package com.cafe24.hanboa.kids;


import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.hanboa.teacher.Teacher;
import com.cafe24.hanboa.teacher.TeacherDao;

@Repository
public class KidsDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(TeacherDao.class);
	
	String localName = "com.cafe24.hanboa.kids.KidsMapper.";
	
	//전체 영유아 조회
	public List<Kids> selectKidsList(HashMap<String, Object> map) {
		logger.debug("KidsDao -- List<Kids> selectKidsList(HashMap<String, Object> map) 매서드 실행");
		logger.debug("map : {}",map);
		// parameter로 map에 값을 담아서 넘겨준다. keyword의 value값
		return sqlSession.selectList(localName + "getKidsList", map);
	}
	// 편성 반별 영유아 조회
	public List<Kids> selectKidsListByClass(Teacher teacher){
		logger.debug("KidsDao -- List<Kids> selectKidsListByClass(Teacher teacher) : {}",teacher);
		return sqlSession.selectList(localName + "getKidsListByClass",teacher);
	}
}
