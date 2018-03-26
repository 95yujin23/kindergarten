package com.cafe24.hanboa.contract;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContractController {
	@Autowired 
	public ContractService contractService;

	private static final Logger logger = LoggerFactory.getLogger(Contract.class);
	
	// 1. 목록조회
	@RequestMapping(value="/contract/contract_list")
	public String contractList(Model model, HttpSession session) {
		logger.info("1. ContractController -- ContractList : {}");
		List<Contract> list = contractService.getContractList();
		logger.info("1. ContractController -- ContractList : {}", list);
		logger.debug("-----------------------------------------");
		model.addAttribute("list",list);
		return "contract/contract_list";		
	}
	
	// 2. 수정정보요청
	@RequestMapping(value="/contract/contract_modify", method=RequestMethod.GET)
	public String contractModify(Model model, @RequestParam(value="contractCd", required=true)String contractCd) {
		Contract contract = contractService.modifyGetContract(contractCd);
		logger.debug("{} <- ContractCd ContactController.java",contractCd);
		logger.debug("{} <- Contract ContractController.java",contract);
		model.addAttribute("contract", contract);
		return "contract/contract_modify";		
	}
}
