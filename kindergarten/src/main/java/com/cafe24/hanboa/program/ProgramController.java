package com.cafe24.hanboa.program;

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

import com.cafe24.hanboa.contract.Contract;
import com.cafe24.hanboa.kids.Kids;
import com.cafe24.hanboa.teacher.Teacher;
import com.cafe24.hanboa.totalResource.TotalResource;

@Controller
public class ProgramController {
	@Autowired
	private ProgramService programService;
	private static final Logger logger = LoggerFactory.getLogger(ProgramController.class);
	
	// 특별활동
	// 1-1. 특별활동 등록을 위한 통합자원 코드, 계약 코드 불러오기 및 입력 요청
	@RequestMapping(value="/ProgramAdd", method=RequestMethod.GET)
	public String ProgramInsert(Model model) {
		List<TotalResource> resource = programService.callTotalResource();
		List<Contract> contract = programService.callContract();
		model.addAttribute("resource", resource);
		model.addAttribute("contract", contract);
		logger.debug("1. ProgramController.java ProgramInsert()메소드 실행 ");
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
	// 2. 특별활동 전체조회+페이징
	@RequestMapping(value = "/ProgramList", method = RequestMethod.GET)
	public String ProgramList(Model model
							, @RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage
							, @RequestParam(value = "pagePerRow", required = false, defaultValue = "10") int pagePerRow) {
		logger.debug("2. ProgramController.java ProgramList()메소드 실행 ");
		logger.debug("{} <- currentPage ProgramController.java", currentPage);
		logger.debug("{} <- pagePerRow ProgramController.java", pagePerRow);
		Map<String, Object> map = programService.selectProgramList(currentPage, pagePerRow);
		List<ProgramApplication> list = (List<ProgramApplication>)(map.get("list"));
		int countPage = (Integer)map.get("countPage");
		model.addAttribute("list", list);
		model.addAttribute("countPage", countPage);
		model.addAttribute("currentPage", currentPage);
		logger.debug("{} <- list ProgramController.java", list);
		logger.debug("------------------------------------------------------------");
		model.addAttribute("list", list);
		return "program/program_list";
	}
	// 3-1. 특별활동 업데이트 정보요청
	@RequestMapping(value = "/ProgramModify", method = RequestMethod.GET)
	public String ProgramModify(Model model, @RequestParam(value = "programCd", required = true) String programCd) {
		Program program = programService.getProgramOne(programCd);
		logger.debug("3. ProgramController.java ProgramModify()메소드 실행 ");
		logger.debug("{} <- programCd ProgramController.java", programCd);
		logger.debug("{} <- program ProgramController.java", program);
		logger.debug("------------------------------------------------------------");
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
	// 4. 특별활동 삭제
	@RequestMapping(value="/ProgramDelete", method=RequestMethod.GET)
	public String ProgramDelete(HttpSession session, Teacher teacher, @RequestParam(value = "programCd", required = true) String programCd) {
		Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
		// loginTeacher객체에 session에 담긴 loginTeacher의 값을 담는다.
		if(loginTeacher == null) {
			// loginTeacher의 값이 null이라면 login화면으로
			return "redirect:/Login";
		}
		programService.programDelete(programCd);
		logger.debug("4. ProgramController.java ProgramDelete()메소드 실행 ");
		logger.debug("------------------------------------------------------------");
		return "redirect:/ProgramList";
	}
	
	// 특별활동신청
	// 1-1. 특별활동신청 등록을 위한 영유아 목록, 특별활동 목록 입력 요청
	@RequestMapping(value="/ProgramApplication", method=RequestMethod.GET)
	public String ProgramApplicationInsert(Model model) {
		List<Kids> kids = programService.callKids();
		List<Program> program = programService.callProgram();
		model.addAttribute("kids", kids);
		model.addAttribute("program", program);
		logger.debug("1. ProgramController ProgramApplInsert()메소드 실행 ");
		logger.debug("------------------------------------------------------------");
		return "program/program_application";
	}
	// 1-2. 특별활동신청 등록 입력
	@RequestMapping(value="/ProgramApplication", method=RequestMethod.POST)
	public String ProgramApplication(Model model, HttpSession session, Teacher teacher, ProgramApplication programApplication) {
		Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
		// loginTeacher객체에 session에 담긴 loginTeacher의 값을 담는다.
		if(loginTeacher == null) {
			// loginTeacher의 값이 null이라면 login화면으로
			return "redirect:/Login";
		}
		// null이 아니라면 loginTeacher세션에서 교원번호와 라이센스를 받아서 teacher객체에 셋팅한다.
		programApplication.setLicenseKindergarten(loginTeacher.getLicenseKindergarten());
		programService.insertProgramApplication(programApplication);
		return "redirect:/ProgramApplicationList";
	}
	// 2. 특별활동신청 전체조회+검색+페이징
	@RequestMapping(value="/ProgramApplicationList", method=RequestMethod.GET)
	public String selectProgramApplicationList(Model model
											, @RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage
											, @RequestParam(value = "pagePerRow", required = false, defaultValue = "10") int pagePerRow) {
		logger.debug("2. ProgramController.java selectProgramApplicationList()메소드 실행 ");
		logger.debug("{} <- currentPage ProgramController.java", currentPage);
		logger.debug("{} <- pagePerRow ProgramController.java", pagePerRow);
		logger.debug("2. ProgramController selectProgramApplicationList()메소드 실행 ");
		Map<String, Object> map = programService.getProgramApplicationList(currentPage, pagePerRow);
		List<ProgramApplication> list = (List<ProgramApplication>)(map.get("list"));
		int countPage = (Integer)map.get("countPage");
		model.addAttribute("list", list);
		model.addAttribute("countPage", countPage);
		model.addAttribute("currentPage", currentPage);
		logger.debug("{} <- list ProgramController.java", list);
		logger.debug("------------------------------------------------------------");
		model.addAttribute("list", list);
		return "/program/program_application_list";
	}
	// 3-1. 특별활동신청 업데이트 정보요청 개별조회
	@RequestMapping(value="/ProgramApplicationModify", method=RequestMethod.GET)
	public String ProgramApplicationModify(Model model, HttpSession session, Teacher teacher, @RequestParam(value = "programApplCd", required = true) String programApplCd) {
		Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
		// loginTeacher객체에 session에 담긴 loginTeacher의 값을 담는다.
		if(loginTeacher == null) {
			// loginTeacher의 값이 null이라면 login화면으로
			return "redirect:/Login";
		}
		ProgramApplication programApplication = programService.GetProgramApplication(programApplCd);
		logger.debug("3. ProgramController.java ProgramApplicationModify()메소드 실행 ");
		logger.debug("{} <- programCd ProgramController.java", programApplCd);
		logger.debug("{} <- program ProgramController.java", programApplication);
		logger.debug("------------------------------------------------------------");
		model.addAttribute("programApplication", programApplication);
		return "/program/program_application_modify";
	}
	// 3-2. 특별활동신청 업데이트
	@RequestMapping(value="/ProgramApplicationModify", method=RequestMethod.POST)
	public String ProgramApplicationModify(ProgramApplication programApplication) {
		programService.programApplicationModify(programApplication);
		logger.debug("{} <- ProgramModify ProgramController.java", programApplication);
		return "redirect:/ProgramApplicationList";
	}
	// 4. 특별활동신청 삭제
	@RequestMapping(value="/ProgramApplicationDelete", method=RequestMethod.GET)
	public String ProgramApplicationDelete(HttpSession session, Teacher teacher, @RequestParam(value = "programApplCd", required = true) String programApplCd) {
		Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
		// loginTeacher객체에 session에 담긴 loginTeacher의 값을 담는다.
		if(loginTeacher == null) {
			// loginTeacher의 값이 null이라면 login화면으로
			return "redirect:/Login";
		}
		programService.programApplicationDelete(programApplCd);
		logger.debug("4. ProgramController.java ProgramApplicationDelete()메소드 실행 ");
		logger.debug("------------------------------------------------------------");
		return "redirect:/ProgramApplicationList";
	}
}