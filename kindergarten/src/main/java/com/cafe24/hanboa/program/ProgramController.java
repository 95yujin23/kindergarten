package com.cafe24.hanboa.program;

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

import com.cafe24.hanboa.contract.Contract;
import com.cafe24.hanboa.teacher.Teacher;
import com.cafe24.hanboa.totalResource.TotalResource;

@Controller
public class ProgramController {
	@Autowired
	private ProgramService programService;
	private static final Logger logger = LoggerFactory.getLogger(ProgramController.class);
	
	// 1-1. 특별활동 등록을 위한 통합자원 코드, 계약 코드 불러오기 및 입력 요청
	@RequestMapping(value="/ProgramAdd", method=RequestMethod.GET)
	public String ProgramInsert(Model model) {
		List<TotalResource> resource = programService.callTotalResource();
		List<Contract> contract = programService.callContract();
		model.addAttribute("resource", resource);
		model.addAttribute("contract", contract);
		logger.debug("1. ProgramController ProgramInsert()메소드 실행 ");
		logger.debug("------------------------------------------------------------");
		return "program/program_add";
	}
	// 1-2. 특별활동 등록 입력
	@RequestMapping(value="/ProgramAdd", method=RequestMethod.POST)
	public String ProgramInsert(Model model, HttpSession session, Teacher teacher, Program program) {
		Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
		// loginTeacher객체에 session에 담긴 loginTeacher의 값을 담는다.
		if(loginTeacher == null) {
			// loginTeacher의 값이 null이라면 login화면으로
			return "redirect:/Login";
		}
		// null이 아니라면 loginTeacher세션에서 교원번호와 라이센스를 받아서 teacher객체에 셋팅한다.
		program.setLicenseKindergarten(loginTeacher.getLicenseKindergarten());
		programService.insertProgram(program);
		logger.debug("{} <- ProgramInsert ProgramController.java", program);
		return "redirect:/ProgramList";
	}
	// 2. 특별활동 전체조회
	@RequestMapping(value = "/ProgramList", method = RequestMethod.GET)
	public String ProgramList(Model model) {
		List<Program> list = programService.selectProgramList();
		logger.debug("{} <- list ProgramController.java", list);
		model.addAttribute("list", list);
		return "program/program_list";
	}
	// 3-1. 특별활동 업데이트 정보요청
	@RequestMapping(value = "/ProgramModify", method = RequestMethod.GET)
	public String ProgramModify(Model model, @RequestParam(value = "programCd", required = true) String programCd) {
		Program program = programService.getProgramOne(programCd);
		logger.debug("{} <- programCd ProgramController.java", programCd);
		logger.debug("{} <- program ProgramController.java", program);
		model.addAttribute("program", program);
		return "/program/program_modify";
	}
	// 3-2. 특별활동 업데이트
	@RequestMapping(value="/ProgramModify", method=RequestMethod.POST)
	public String ProgramModify(HttpSession session, Teacher teacher, Program program) {
		Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
		// loginTeacher객체에 session에 담긴 loginTeacher의 값을 담는다.
		if(loginTeacher == null) {
			// loginTeacher의 값이 null이라면 login화면으로
			return "redirect:/Login";
		}
		programService.programModify(program);
		logger.debug("{} <- ProgramModify ProgramController.java", program);
		return "redirect:/ProgramList";
	}
}