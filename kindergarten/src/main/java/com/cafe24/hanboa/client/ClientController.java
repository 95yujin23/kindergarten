package com.cafe24.hanboa.client;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.hanboa.teacher.Teacher;

@Controller
public class ClientController {
	@Autowired
	public ClientService clientService;
	public ClientDao clientDao;
	private static final Logger logger = LoggerFactory.getLogger(Client.class);
	
	// 1.목록조회
	@RequestMapping(value="/ClientList", method = RequestMethod.GET)
	public String clientList(Model model
							, @RequestParam(value="searchOption", required=false)String searchOption
							, @RequestParam(value="keyword", required=false)String keyword
							, @RequestParam(value="currentPage", required=false, defaultValue="1")int currentPage
							, @RequestParam(value="pagePerRow", required=false, defaultValue="10")int pagePerRow) {
		logger.debug("{} < -- clientList메서드 실행 ClientController.java",keyword);
		logger.debug("{} < -- clientList메서드 실행 ClientController.java",currentPage);
		logger.debug("{} < -- clientList메서드 실행 ClientController.java",pagePerRow);
		Map<String, Object> map = clientService.getClientList(currentPage, pagePerRow, searchOption, keyword);
		List<Client> list = (List<Client>)(map.get("list"));
		int countPage = (Integer)map.get("countPage");
		String searchKeyword = (String) map.get("keyword");
		String searchOptionWord = (String) map.get("searchOption");
		logger.debug("{} <- list clientController.java",list);
		model.addAttribute("list",list);
		model.addAttribute("countPage",countPage);
		model.addAttribute("currentPage",currentPage);
		model.addAttribute("keyword",keyword);
		model.addAttribute("searchOption",searchOption);
		logger.debug("{} <- list clientController.java", list);
		logger.debug("------------------------------------------------------------");
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
		return "redirect:/ClientList";
	}
	
	//4. 등록
	@RequestMapping(value="/ClientAdd", method=RequestMethod.POST)
	public String clientAdd(Model model, HttpSession session, Teacher teacher, Client client) {
		Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
		// loginTeacher객체에 session에 담긴 loginTeacher의 값을 담는다.
		if(loginTeacher == null) {
			// loginTeacher의 값이 null이라면 login화면으로
			return "redirect:/Login";
		}
		// null이 아니라면 loginTeacher세션에서 교원번호와 라이센스를 받아서 teacher객체에 셋팅한다.
		client.setLicenseKindergarten(loginTeacher.getLicenseKindergarten());
		clientService.cleintAdd(client);
		logger.debug("{} < -- clientAdd ClientController.java",client);
		return "redirect:/ClientList";		
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
		return "redirect:/ClientList";
	}
	
	
	
	
	
	
	
	

}
