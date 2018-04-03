package com.cafe24.hanboa.classformation;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClassDao {
	//반 DAO
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(ClassDao.class);
	
	String localName = "com.cafe24.hanboa.classformation.ClassMapper.";
	
	// tb_kids_class lsit
		public List<KidsClass> selectKidsClassList(){
		logger.debug("ReportService selectReportList()메소드 실행");
		return sqlSession.selectList(localName + "selectKidsClassList");
		}
	
	
	public int addUnClassification(ClassFormation classFormation){
		logger.debug("ReportService addUnClassification()메소드 실행");
		return sqlSession.insert(localName + "addUnClassification", classFormation);
	}
}
