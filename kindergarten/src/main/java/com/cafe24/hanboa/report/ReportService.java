package com.cafe24.hanboa.report;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.hanboa.classformation.KidsClass;
import com.cafe24.hanboa.teacher.Teacher;
import com.cafe24.hanboa.teacher.TeacherService;

@Service
@Transactional
public class ReportService {	
	//모둔 일지관련 Service
	
	@Autowired
	private ReportDao reportDao;
	private static final Logger logger = LoggerFactory.getLogger(ReportService.class);
	
	// 1. 영유아일지 전체 목록조회
	/*public List<Report> selectAllReport() {
		logger.debug("ReportService selectAllReport()메소드 실행");
		List<Report> list = reportDao.selectAllReport();
		logger.debug("ReportService selecatAllReport() 메소드 list {}", list);
		logger.debug("------------------------------------------------------------------------------------------------");
		return list;
		
	}*/
	
	public List<Report> selectReportList() {
		logger.debug("ReportService selectReportList()메소드 실행");
		List<Report> list = reportDao.selectReportList();
		return list;
	}
	//kids_report_list.jsp 선택옵션 반 리스트 보여주기
	public List<KidsClass> selectClassListForSearch() {
		logger.debug("ReportService ---> selectClassListForSearch() 메소드 실행");
		List<KidsClass> list = reportDao.selectClassListForSearch();
		return list;
	}
	
	// kids_report_list.jsp 선택옵션 선생님 리스트 보여주기
	public List<Teacher> selectTeacherListForSearch() {
		logger.debug("ReportService ---> selectTeacherListForSerach() 메소드 실행 ");
		List<Teacher> list = reportDao.selectTeacherListForSearch();
		return list;
	}
	
	public List<ReportDivision> selectReportDivisionListForSearch() {
		logger.debug("ReportService ---> selectReportDivisionListForSearch() 메소드 실행");
		List<ReportDivision> list = reportDao.selectReportDivisionListForSearch();
		return list;
	}
	
	public List<Map<String,Object>> selectReportListForSearch(Map<String,Object> map, HttpSession session){
		logger.debug("ReportService selectReportListForSearch() 메소드 실행 ");
		List<Map<String,Object>> list = reportDao.selectReportListForSearch(map, session);
		logger.debug("ReportService selectReportListForSearch() list is :  {} ", list);
		return list;
	}
	// report_resource list
	public List<ReportResource> selectReportResourceList() {
		List<ReportResource> list = reportDao.selectReportResourceList();
		return list;
	}
	
	// 일지구분 추가
	public void addReportDivision(ReportDivision reportDivision) {
		logger.debug("ReportService addReportDivision() 메소드 실행 ");
		reportDao.addReportDivision(reportDivision);
	}
	
	// 일지자원 추가
	public void addReportResource(ReportResource reportResource) {
		logger.debug("ReportService addReportResource() 메소드 실행 ");
		reportDao.addReportResource(reportResource);
	}
	
	//  일지구분 수정 report_division
	public void modifyReportDivision(ReportDivision reportDivision) {
		logger.debug("ReportService modifyReportDivision() 메소드 실행 ");
		reportDao.modifyReportDivision(reportDivision);
	}
	
	// 일지구분 삭제 report_division
	public void removeReportDivision(ReportDivision reportDivision) {
		logger.debug("ReportService removeReportDivision() 메소드 실행 ");
		reportDao.removeReportDivision(reportDivision);
	}
	
	// 일지자원 수정 report_resource
	public void modifyReportResource(ReportResource reportResource) {
		logger.debug("ReportService modifyReportResource() 메소드 실행 ");
		reportDao.modifyReportResource(reportResource);
	}
	
	// 일지자원 삭제 report_resource
	public void removeReportResource(ReportResource reportResource) {
		logger.debug("ReportService removeReportResource() 메소드 실행 ");
		reportDao.removeReportResource(reportResource);
	}
}
