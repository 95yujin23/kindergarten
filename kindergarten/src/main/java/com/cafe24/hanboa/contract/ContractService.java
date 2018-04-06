package com.cafe24.hanboa.contract;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.hanboa.client.Client;

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
	public void insertContract(Contract contract) {
		String inDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
		contract.setContractRegistrationDate(inDate);
		contractDao.insertContract(contract);
		logger.debug("{} < - insertContract(contract) 메서드 실행 ContractService.java",contract);
		logger.debug("{} < - insertContract(inDate) 메서드 실행 ContractService.java",inDate);		
	}
	
	// 4-1 client 불러오기
	public List<Client> callClient(){
		List<Client> call = contractDao.callClient();
		logger.debug("{} < -- callClient메서드 실행 ContractService.java",call); 
		return call;
		
	}
	
	// 5. 삭제처리
	public int contractDelete(String contractCd) {
		int delete = contractDao.contractDelete(contractCd);
		logger.debug("{} < -- contractDelete메서드 실행 ContractService.java",contractCd);
		logger.debug("{} < -- contractDelete메서드 실행 ContractService.java",delete);
		return delete;
		
	}
	
	

}