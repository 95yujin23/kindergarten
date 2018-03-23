package com.cafe24.hanboa.contract;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContractController {
	@Autowired
	public ContractService contractService;

	private static final Logger logger = LoggerFactory.getLogger(Contract.class);
	
	// 1. 목록조회
	@RequestMapping(value="/contract/contract_list")
	public String contractList(Model model, HttpSession session) {
		List<Contract> list = contractService.getContractList();
		logger.info("1. ContractController -- ContractList : {}", list);
		logger.debug("-----------------------------------------");
		model.addAttribute("list",list);
		
		return "contract/contract_list";
		
	}
}
