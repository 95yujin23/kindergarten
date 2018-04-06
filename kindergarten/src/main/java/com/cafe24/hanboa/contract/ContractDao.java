package com.cafe24.hanboa.contract;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.hanboa.client.Client;

@Repository
public class ContractDao {
	@Autowired 
	public SqlSessionTemplate sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(ContractDao.class);
	
	String localName = "com.cafe24.hanboa.contract.ContractMapper.";
	
	// 1.목록조회
	public List<Contract> selectContarct(){
		logger.debug(" ContractDao -- List<Contract> selectContarct()메서드 실행");
		//return sqlSession.selectList(localName,"getContractList222");
		//return sqlSession.selectList(localName+"getContractList222");
		return sqlSession.selectList(localName+"getContractList");		
	}
	// 1-1 client불러오기
	public List<Client> callClient(){
		logger.debug("{} < -- callClient 메서드실행 ContractDao.java");
		return sqlSession.selectList(localName+"callClient");
	}
	
	
	//2.수정정보요청
	public Contract modifyGetContarct(String contractCd) {
		logger.debug("{} <- ContractDao.modifyGetContarct");
		return sqlSession.selectOne(localName+"getContractOne",contractCd);		
	}
	
	// 3. 수정처리
	public int modifyContract(Contract contract) {
		logger.debug("{} < - modifyContract메서드 실행 ContractDao.java",contract);
		return sqlSession.update(localName+"contractModify", contract);
	}
	
	// 4. 입력처리
	public int insertContract(Contract contract) {
		logger.debug("{} < -- insertContract메서드 실행 ContractDao.java",contract);
		return sqlSession.insert(localName+"contractAdd",contract);
	}
	
	// 5. 삭제처리
	public int contractDelete(String contractCd) {
		logger.debug("{} < -- contractDelete메서드 실행 ContractDao.java");
		return sqlSession.delete(localName+"contractDelete",contractCd);
	}

}
