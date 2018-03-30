package com.cafe24.hanboa.report;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
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
	@RequestMapping(value="/KidsReportList")
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
	//선택 검색화면
	@RequestMapping(value="/reportSearch", method=RequestMethod.POST)
	public String reportSearch(Model model,HttpSession session
								,@RequestParam(value="classPointReport", defaultValue="") String classPoint
					
								,@RequestParam(value="teacherPointReport", defaultValue="") String teacherPoint
					
								,@RequestParam(value="reportPointList", defaultValue="") String reportPoint
								,Map<String, Object> map) {
	
		logger.debug("ReportController reportSearch() 메소드 실행 ");
		
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
	
	// 유아일지 설정화면
	@RequestMapping(value="/ReportSetting")
	public String reportSetting(Model model,HttpSession session) {
		
		logger.debug("ReportController reportSetting() 메소드 실행 ");
		
		List<ReportDivision> list = reportService.selectReportDivisionListForSearch();
		List<ReportResource> resourceList = reportService.selectReportResourceList();
		
		model.addAttribute("list", list);
		model.addAttribute("resourceList", resourceList);
		
		return "report/kids_report_setting";
	}
	
	// 일지구분 추가
	@RequestMapping(value="/addReportDivision", method=RequestMethod.POST)
	public String addReportDivision(Model model ,HttpServletRequest request, ReportDivision reportDivision) {
		logger.debug("ReportController addReportResource() 메소드 실행");
		
		 String addReportDivision = request.getParameter("addReportDivision");
		 logger.debug("ReportController addReportDivision() 메소드 실행 addReportDivision is : {} " , addReportDivision);
		 model.addAttribute("addReportDivision",addReportDivision);
		 reportService.addReportDivision(reportDivision);
		return "redirect:/ReportSetting";
	}
	
	// 일지자원 추가
	@RequestMapping(value="addReportResource", method=RequestMethod.POST)
	public String addReportResource(ReportResource reportResource
									,@RequestParam(value="groupNm", defaultValue="") String groupNm
									,@RequestParam(value="detail", defaultValue="") String detail) {
		logger.debug("ReportController addReportResource() 메소드 실행");
		logger.debug("ReportController modifyReportDivision() 메소드 실행 groupNm is : {}", groupNm);
		logger.debug("ReportController modifyReportDivision() 메소드 실행 detail is : {}", detail);
		
		reportService.addReportResource(reportResource);
		
		return "redirect:/ReportSetting";
	}
	
	//영유아일지구분 수정 report_division
	@RequestMapping(value="/modifyReportDivision", method=RequestMethod.POST)
	public String modifyReportDivision(Model model,ReportDivision reportDivision
									,@RequestParam(value="reportCd", defaultValue="") String reportCd
									,@RequestParam(value="reportNm", defaultValue="") String reportNm) {
		logger.debug("ReportController modifyReportDivision() 메소드 실행");
		logger.debug("ReportController modifyReportDivision() 메소드 실행 reportCd is : {}", reportCd);
		logger.debug("ReportController modifyReportDivision() 메소드 실행 reportNm is : {}", reportNm);
		
		reportService.modifyReportDivision(reportDivision);
		return "redirect:/ReportSetting";
	}
	//영유아일지구분 삭제 report_division
	@RequestMapping(value="/removeReportDivision", method=RequestMethod.GET)
	public String removeReportDivision(ReportDivision reportDivision
									,@RequestParam(value="reportCd", defaultValue="") String reportCd
									,@RequestParam(value="reportNm", defaultValue="") String reportNm) {
		
		reportService.removeReportDivision(reportDivision);
		return "redirect:/ReportSetting";
	}
	
	//영유아일지자원 수정 report_resource
	@RequestMapping(value="/modifyReportResource", method=RequestMethod.POST)
	public String modifyReportResource(Model model, ReportResource reportResource
									,@RequestParam(value="", defaultValue="") String groupNm
									,@RequestParam(value="", defaultValue="") String detail) {
		
		logger.debug("ReportController modifyReportResource() 메소드 실행");
		logger.debug("ReportController modifyReportResource() 메소드 실행 groupNm is : {}", groupNm);
		logger.debug("ReportController modifyReportResource() 메소드 실행 detail is : {}", detail);
		
		reportService.modifyReportResource(reportResource);
		
		return "redirect:/ReportSetting";
	}
	
	//영유아일지자원 삭제 report_resource
	@RequestMapping(value="/removeReportResource", method=RequestMethod.GET)
	public String removeReportResource(ReportResource reportResource
									,@RequestParam(value="") String reportResourceCd
									) {
		
		logger.debug("ReportController removeReportResource() 메소드 실행");
		logger.debug("ReportController removeReportResource() 메소드 실행 groupNm is : {}", reportResourceCd);
		
		
		reportService.removeReportResource(reportResource);
		
		return "redirect:/ReportSetting";
	}
}
	

