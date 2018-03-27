package com.cafe24.hanboa.report;


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

import com.cafe24.hanboa.classformation.KidsClass;
import com.cafe24.hanboa.teacher.Teacher;

@Controller
public class ReportController {
	//일지 컨트롤러
	
	@Autowired
	private ReportService reportService;
	
	private static final Logger logger = LoggerFactory.getLogger(ReportController.class);
	
	// 1. 영유아일지 전체 조회
	@RequestMapping(value="/kidsReport")
	public String kidsReport(Model model) {
	
			/*	List<Report> list = reportService.selectAllReport();*/
		logger.debug("ReportController kidsReport() 메소드 실행");

		
		List<Report> list = reportService.selectReportList();
		List<KidsClass> kidsClass = reportService.selectClassListForSearch();
		List<Teacher> teacher = reportService.selectTeacherListForSearch();
		List<ReportDivision> division = reportService.selectReportDivisionListForSearch();
		
		logger.debug("ReportController kidsReport()메소드 실행 list is  : {}",list);
		logger.debug("----------------------------------------------------------------------");
		
		model.addAttribute("list",list);
		model.addAttribute("kidsClass", kidsClass);
		model.addAttribute("teacher", teacher);
		model.addAttribute("division", division);
		
		return "report/kids_report_list";
	}
	
	@RequestMapping(value="/reportSearch", method=RequestMethod.POST)
	public String reportSearch(Model model,HttpSession session
								,@RequestParam(value="classPointReport", defaultValue="") String classPoint
					
								,@RequestParam(value="teacherPointReport", defaultValue="") String teacherPoint
					
								,@RequestParam(value="reportPointList", defaultValue="") String reportPoint
								,Map<String, Object> map) {
	
		logger.debug("reportSearch() 메소드 실행 ");
		
		logger.debug("reportSearch() classPoint is : {}  ", classPoint);
		logger.debug("reportSearch() teacherPoint is : {}  ",teacherPoint);
		logger.debug("reportSearch() reportPoint is : {}  ", reportPoint);
		
		map.put("classPoint", classPoint);
		map.put("teacherPoint", teacherPoint);
		map.put("reportPoint", reportPoint);
		
		List<KidsClass> kidsClass = reportService.selectClassListForSearch();
		List<Teacher> teacher = reportService.selectTeacherListForSearch();
		List<ReportDivision> division = reportService.selectReportDivisionListForSearch();
		List<Map<String,Object>> list = reportService.selectReportListForSearch(map,session);
		
		logger.debug("reportSearch() 메소드 list is : {}", list);
		model.addAttribute("list", list);
		model.addAttribute("kidsClass", kidsClass);
		model.addAttribute("teacher", teacher);
		model.addAttribute("division", division);
		
		return "report/kids_report_list";
	}
	
	
}
