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

@Controller
public class ClientController {
	@Autowired
	public ClientService clientService;
	private static final Logger logger = LoggerFactory.getLogger(Client.class);
	
	// 1.목록조회
	@RequestMapping(value="/client/client_list")
	public String clientList(Model model, HttpSession session) {
		List<Client> list = clientService.getClientList();
		model.addAttribute("list",list);
		return "client/client_list";		
	}
	// 2. 항목별 조회
	//@RequestMapping(value="")

}
