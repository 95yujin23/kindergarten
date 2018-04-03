package com.cafe24.hanboa.client;

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
public class ClientController {
	@Autowired
	public ClientService clientService;
	public ClientDao clientDao;
	private static final Logger logger = LoggerFactory.getLogger(Client.class);
	
	// 1.목록조회
	@RequestMapping(value="/ClientList")
	public String clientList(Model model, HttpSession session) {
		List<Client> list = clientService.getClientList();
		logger.debug("{} <- list clientController.java",list);
		model.addAttribute("list",list);
		return "client/client_list";		
	}
	// 2. 수정정보요청
	@RequestMapping(value = "/client/client_modify", method=RequestMethod.GET)
	public String clientModify(Model model, @RequestParam(value="clientCd", required=true) String clientCd){
		Client client = clientService.modifyGetClient(clientCd);
		logger.debug("{} <- ClientCd ClientController.java",clientCd);
		logger.debug("{} <- Client ClientController.java",client);
		model.addAttribute("client", client);
		return "client/client_modify";
	}
	//3. 수정 처리요청
	@RequestMapping(value = "/client/client_modify", method = RequestMethod.POST)
	public String clientModify(Model model, Client client) {
		clientService.updateClient(client);
		logger.debug("{} <-clientModify ClientController.java", client);
		return "redirect:/client/client_list";
	}
	
	//4. 등록
	@RequestMapping(value="/ClientAdd", method=RequestMethod.POST)
	public String clientAdd(Model model, Client client) {
		clientService.cleintAdd(client);
		logger.debug("{} < -- clientAdd ClientController.java",client);
		return "redirect:/";		
	}
	
	// 5. 등록화면
	@RequestMapping(value="/ClientAdd", method=RequestMethod.GET)
	public String clientAdd() {
		logger.debug("{} <-- clientAdd ClientController insertForm");
		return "client/client_add";		
	}
	
	// 6. 삭제
	@RequestMapping(value="/ClientDelete" , method=RequestMethod.GET)
	public String clientDelete(Model model , @RequestParam(value="clientCd",required=true) String clientCd) {
		clientService.deleteClient(clientCd);
		return "redirect:/";
	}
	
	
	
	
	
	
	
	

}
