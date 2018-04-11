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
import com.cafe24.hanboa.kids.KidsFile;
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
	
	public List<Report> selectReportList(ReportList reportList) {
		logger.debug("selectReportList() 실행");
		List<Report> list = sqlSession.selectList(localName + "selectReportList");
		logger.debug("selectReportList() 메소드 list is {}",list);
		return list;
	}
	/*
	 * description : 일지등록 부분 테이블에 리스트를 불러오기 위한 메소드
	 * */
	public List<KidsReportSelect> selectKidsListForUpload(KidsReportSelect kidsReportSelect){
		return sqlSession.selectList(localName + "selectKidsListForUpload");
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
	
	public List<ReportResource> selectReportResourceList() {
		return sqlSession.selectList(localName + "selectReportResourceList");
	}
	
	// 일지구분 추가
	public int addReportDivision(ReportDivision reportDivision) {
		return sqlSession.insert(localName + "addReportDivision", reportDivision);
	}
	
	// 일지구분 수정
	public int modifyReportDivision(ReportDivision reportDivision) {
		return sqlSession.update(localName + "modifyReportDivision", reportDivision);
	}
	
	// 일지구분 삭제
	public int removeReportDivision(ReportDivision reportDivision) {
		return sqlSession.delete(localName + "removeReportDivision", reportDivision);
	}
	
	// 일지자원 추가
	public int addReportResource(ReportResource reportResource) {
		return sqlSession.insert(localName + "addReportResource", reportResource);
		//맵퍼 추가하면됌
	}
	
	//일지자원 수정
	public int modifyReportResource(ReportResource reportResource) {
		return sqlSession.update(localName + "modifyReportResource", reportResource);
	}
	
	//일지자원 삭제
	public int removeReportResource(ReportResource reportResource) {
		return sqlSession.delete(localName + "removeReportResource", reportResource);
	}
	// 반 출력
	public List<KidsClass> selectKidsClassListForSelectBox(){
		return sqlSession.selectList(localName + "selectKidsClassListForSelectBox");
	}
	// 일지등록
	public int addKidsReport(Report report) {
		logger.debug("ReportDao ---> addKidsReport() 메소드 실행");
		return sqlSession.insert(localName + "addReport");
	}
	// 일지파일등록
	public int addKidsReportFile(KidsFile kidsFile) {
		logger.debug("ReportDao ---> addKidsReportFile() 메소드 실행");
		return sqlSession.insert(localName + "addReportFile");
	}

	
	
}
