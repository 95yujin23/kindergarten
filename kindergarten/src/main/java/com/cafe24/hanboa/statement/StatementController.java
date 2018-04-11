package com.cafe24.hanboa.statement;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cafe24.hanboa.classformation.ClassController;

@Controller
public class StatementController {
	//회계 관련 컨트롤러
	@Autowired
	private StatementService statementService;
	private static final Logger logger = LoggerFactory.getLogger(ClassController.class);
	
	// 전표 추가 
	@RequestMapping(value="/StatementAdd")
	public String addStatement(Model model) {
			List<StatementCategory> list = statementService.selectStatementCategory();
			model.addAttribute("list",list);
		return "statement/add_statement";
	}
	
	//회계전표분류 리스트
	
}
