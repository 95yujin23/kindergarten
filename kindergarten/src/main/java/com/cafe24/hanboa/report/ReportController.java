package com.cafe24.hanboa.report;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cafe24.hanboa.kids.KidsController;

@Controller
public class ReportController {
	//일지 컨트롤러
	
	@Autowired
	private ReportService reportService;
	
	private static final Logger logger = LoggerFactory.getLogger(KidsController.class);
	
	// 1. 영유아일지 전체 조회
	@RequestMapping(value="/kidsReport")
	public String kidsReport(Model model, HttpSession session) {
		List<Report> list = reportService.selectAllReport();
		logger.debug("ReportController kidsReport()메소드 실행 list is  : {}",list);
		logger.debug("----------------------------------------------------------------------");
		model.addAttribute("list",list);
		return "report/kids_report_list";
	}
	
}
