package com.cafe24.hanboa.statement;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class StatementDao {
	//회계관련처리DAO
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(StatementDao.class);
	
	String localName = "com.cafe24.hanboa.statement.StatementMapper.";
	
	//회계전표분류 리스트
	public List<StatementCategory> selectStatementCategory(StatementCategory statementCategory){
		logger.debug("StatementDao selectStatementCategory() 메소드 실행");
		return sqlSession.selectList(localName + "selectStatementCategory");
	}
	
}
