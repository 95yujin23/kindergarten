package com.cafe24.hanboa.client;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class ClientController {
	public ClientService clientService;
	private static final Logger logger = LoggerFactory.getLogger(Client.class);
	
	// 1.목록조회
	@RequestMapping(value="/client/client_list")
	public String clientList(Model model, HttpSession session) {
		return "client/client_list";
		
	}

}
