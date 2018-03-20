package com.cafe24.hanboa.program;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProgramController {
	@Autowired
	private ProgramService programService;
	private static final Logger logger = LoggerFactory.getLogger(ProgramController.class);
	
	// Program 전체 조회(교직원)
	@RequestMapping(value = "/program/programList", method = RequestMethod.GET)
	public String ProgramList(Model model) {
		List<Program> list = programService.selectProgramList();
		logger.debug("{} <- list ProgramController.java");
		model.addAttribute("list", list);
		return "program/programList";
	}
	// Program 수정 정보요청
	@RequestMapping(value = "/program/programModify", method = RequestMethod.GET)
	public String ProgramModify(Model model, @RequestParam(value="programCd", required = true) String programCd) {
		Program program = programService.modifyGetProgram(programCd);
		model.addAttribute("program", program);
		return "program/programModify";
	}
	// Program 수정 처리요청
	@RequestMapping(value = "/program/programModify", method = RequestMethod.POST)
	public String ProgramModify(Program program) {
		programService.programModify(program);
		return "redirect:program/programList";
	}
}