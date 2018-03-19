package com.cafe24.hanboa.program;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProgramController {
	@Autowired
	private ProgramService programService;
	private static final Logger logger = LoggerFactory.getLogger(ProgramController.class);
	
	@RequestMapping(value = "/program/programList", method = RequestMethod.GET)
	public String ProgramList(Model model) {
		List<Program> list = programService.selectProgramList();
		logger.debug("{} <- list ProgramController.java");
		model.addAttribute("list", list);
		return "program/programList";
	}
}
