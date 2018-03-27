package com.cafe24.hanboa.report;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.hanboa.classformation.*;
import com.cafe24.hanboa.teacher.Teacher;

@Repository
public class ReportDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(ReportDao.class);
	
	String localName = "com.cafe24.hanboa.report.ReportMapper.";
	
	/*public List<Report> selectAllReport() {
		logger.debug("ReportDao selectAllReport() 메소드 실행");
		return sqlSession.selectList(localName + "selectAllReport");
	}*/
	
	public List<Report> selectReportList() {
		logger.debug("selectReportList() 실행");
		List<Report> list = sqlSession.selectList(localName + "selectReportList");
		logger.debug("selectReportList() 메소드 list is {}",list);
		return list;
	}
	// kids_report_list.jsp 선택옵션 반 리스트 보여주기
	public List<KidsClass> selectClassListForSearch() {
		logger.debug("ReportDao ---> selectClassListForSearch() 메소드 실행 ");
		return sqlSession.selectList(localName + "selectClassListForSearch");
	}
	// kids_report_list.jsp 선택옵션 선생니 리스트 보여주기
	public List<Teacher> selectTeacherListForSearch() {
		logger.debug("ReportDao ---> selectTeacherListForSearch() 메소드 실행");
		return sqlSession.selectList("com.cafe24.hanboa.teacher.TeacherMapper.getTeacherList");
	}
	
	// kids_report_list.jsp 선택옵션 항목 별 리스트 보여주기
	public List<ReportDivision> selectReportDivisionListForSearch(){
		logger.debug("ReportDao ---> selectReportDivisionListForSerach() 메소드 실행");
		return sqlSession.selectList(localName + "selectReportDivisionList");
	}
	
	// 항목 별 검색
	/*public List<ReportList> selectReportListForSearch(HashMap<String,Object> map) {
		logger.debug("ReportDao ---> selectReportListForSearch() 실행");
		return sqlSession.selectList(localName + "selectReportList",map);
	}*/
	
	public List<Map<String, Object>> selectReportListForSearch(Map<String,Object> map
															,HttpSession session){
		logger.debug("ReportDao ---> selectReportListForSearch() 메소드 실행");
		return sqlSession.selectList(localName + "selectReportForSearch",map);
	}

	
	
}
