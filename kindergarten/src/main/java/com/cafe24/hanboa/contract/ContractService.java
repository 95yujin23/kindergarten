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
		return list;
	}	

}