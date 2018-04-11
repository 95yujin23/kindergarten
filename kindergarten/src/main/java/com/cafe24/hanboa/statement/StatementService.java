package com.cafe24.hanboa.statement;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class StatementService {
	//회걔 관련처리 service
	@Autowired
	private StatementDao statementDao;
	private static final Logger logger = LoggerFactory.getLogger(StatementService.class);
	
	//회계전표분류 리스트
	public List<StatementCategory> selectStatementCategory(StatementCategory statementCategory){
		logger.debug("StatementService selectStatementCategory()메소드 실행");
		List<StatementCategory> list = statementDao.selectStatementCategory(statementCategory);
		return list;
	}
	
}
