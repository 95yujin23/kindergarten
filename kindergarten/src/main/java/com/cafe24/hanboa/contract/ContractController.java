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

import com.cafe24.hanboa.client.Client;
import com.cafe24.hanboa.teacher.Teacher;

@Controller
public class ContractController {
	@Autowired 
	public ContractService contractService;

	private static final Logger logger = LoggerFactory.getLogger(Contract.class);
	
	// 1. 목록조회
	@RequestMapping(value="/ContractList")
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
		List<Client> client = contractService.callClient();
		model.addAttribute("client",client);
		logger.debug("{} <- ContractCd ContactController.java",contractCd);
		logger.debug("{} <- Contract ContractController.java",contract);
		model.addAttribute("contract", contract);
		return "contract/contract_modify";		
	}
	
	//3. 수정처리
	@RequestMapping(value="/contract/contract_modify", method=RequestMethod.POST)
	public String contractModify(Model model, Contract contract) {
		contractService.modifyContract(contract);
		logger.debug("{} < - contractModify 메서드실행 ContractController.java",contract);
		return "redirect:/ContractList";		
	}
	
	// 4. 등록화면
	@RequestMapping(value="/ContractAdd", method=RequestMethod.GET)
	public String contractAdd(Model model) {
		List<Client> client = contractService.callClient();
		model.addAttribute("client",client);
		logger.debug("{} < -- contractAdd ContractController.java contractInsertForm");
		return "contract/contract_add";		
	}
	
	// 5. 등록
	@RequestMapping(value="/ContractAdd", method=RequestMethod.POST)
	public String contractAdd(Model model,HttpSession session,Teacher teacher, Contract contract) {
		Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
		// loginTeacher객체에 session에 담긴 loginTeacher의 값을 담는다.
		if(loginTeacher == null) {
			// loginTeacher의 값이 null이라면 login화면으로
			return "redirect:/Login";
		}
		// null이 아니라면 loginTeacher세션에서 교원번호와 라이센스를 받아서 teacher객체에 셋팅한다.
		contract.setLicenseKindergarten(loginTeacher.getLicenseKindergarten());
		logger.debug("{} <-- contractAdd(입력처리) ContractController.java",contract);
		contractService.insertContract(contract);
		return "redirect:/ContractList";
	}
	
	//6. 삭제
	@RequestMapping(value="/Contractdelete" , method=RequestMethod.GET)
	public String contractDelete(Model model , @RequestParam(value="contractCd" , required=true)String contractCd) {
		logger.debug("{} < -- contractDelete 메서드 실행 ContractController.java",contractCd);
		contractService.contractDelete(contractCd);
		return "redirect:/ContractList";		
	}
}
