package com.cafe24.hanboa.contract;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContractDao {
	@Autowired 
	public SqlSessionTemplate sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(ContractDao.class);
	
	String localName = "com.cafe24.hanboa.contract.ContractMapper.";
	
	// 1.목록조회
	public List<Contract> selectContarct(){
		logger.debug(" ContractDao -- List<Contract> selectContarct()");
		//return sqlSession.selectList(localName,"getContractList222");
		//return sqlSession.selectList(localName+"getContractList222");
		return sqlSession.selectList(localName+"getContractList");		
	}
	
	//2.수정정보요청
	public Contract modifyGetContarct(String contractCd) {
		logger.debug("{} <- ContractDao.modifyGetContarct");
		return sqlSession.selectOne(localName+"getContractOne",contractCd);		
	}
	
	// 3. 수정처리
	public int modifyContract(Contract contract) {
		logger.debug("{} < - modifyContract ContractDao.java",contract);
		return sqlSession.update(localName+"contractModify", contract);
	}
	
	// 4. 입력처리
	public int insertContract(Contract contract) {
		logger.debug("{} < -- insertContract ContractDao.java");
		return sqlSession.insert(localName+"contractAdd",contract);
	}

}
