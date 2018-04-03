package com.cafe24.hanboa.contract;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ContractService {
	@Autowired 
	public ContractDao contractDao;
	
	private static final Logger logger = LoggerFactory.getLogger(ContractService.class);
	
	//1. 목록조회
	public List<Contract> getContractList(){
		List<Contract> list = contractDao.selectContarct();
		logger.debug("{} < - getContractList 메서드 실행 ContractService.java");
		return list;
	}
	
	//2.수정 정보요청
	public Contract modifyGetContract(String contractCd) {
		Contract modifyGet = contractDao.modifyGetContarct(contractCd);
		logger.debug("{} < - modifyGetContract 메서드 실행 ContractService.java",contractCd);
		return modifyGet;
	}
	
	//3.수정처리
	public int modifyContract(Contract contract) {
		int modifycontract = contractDao.modifyContract(contract);
		logger.debug("{} < - modifyContrac 메서드 실행 ContractService.java",contract);
		return modifycontract;	
	}
	
	//4.입력처리
	public int insertContract(Contract contract) {
		int contractInsert = contractDao.insertContract(contract);
		logger.debug("{} < - insertContract 메서드 실행 ContractService.java",contract);
		logger.debug("{} < - insertContract 메서드 실행 ContractService.java",contractInsert);
		return contractInsert;		
	}
	
	

}