package com.cafe24.hanboa.report;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.cafe24.hanboa.classformation.KidsClass;
import com.cafe24.hanboa.kids.KidsFile;
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
	
	/*
	 * description : 일지등록 부분 테이블에 리스트를 불러오기 위한 메소드
	 * */
	public List<KidsReportSelect> selectKidsListForUpload(KidsReportSelect kidsReportSelect){
		List<KidsReportSelect> list = reportDao.selectKidsListForUpload(kidsReportSelect);
		return list;
	}
	
	public List<Report> selectReportList(ReportList reportList) {
		logger.debug("ReportService selectReportList()메소드 실행");
		List<Report> list = reportDao.selectReportList(reportList);
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
	// 반 리스트 출력
	public List<KidsClass> selectKidsClassListForSelectBox(){
		List<KidsClass> list = reportDao.selectKidsClassListForSelectBox();
		return list;
	}
	// 일지등록
	public void addReport(ReportCommand reportCommand, String path) throws IOException {
		logger.debug("4. KidsService -- addReport(KidsCommand kidsCommand, String path)");
		logger.debug("kidsCommand : {}",reportCommand);
		logger.debug("String path : {}",path);
		// report , kidsFile 객체생성
		Report report = new Report();
		KidsFile kidsFile = new KidsFile();
		
		report.setReportCd(reportCommand.getReportCd());
		report.setKidsCd(reportCommand.getKidsCd());
		report.setLicenseKindergarten(reportCommand.getLicenseKindergarten());
		report.setRegistrant(reportCommand.getRegistrant());
	
		reportDao.addKidsReport(report);
		// kidsCd 가져오기
		String kidsCd = report.getKidsCd();
		logger.debug("String kidsCd is : {} ",kidsCd);
			for(MultipartFile file : reportCommand.getFile()) {
				
				// 1. DB에 입력하기
				UUID uuid = UUID.randomUUID();
				String fileName = uuid.toString();
				// 중복되지 않는 파일 이름 랜덤으로 받기
				logger.debug("String kidsCd is {}",kidsCd);
				String originalName = file.getOriginalFilename();
				logger.debug("String originalName is {}",originalName);
				int pos = originalName.lastIndexOf(".");
				// 오리지널  이름에서 "." 다음에 있는 문자(확장자)추출
				logger.debug("String pos is {}",pos);
				String fileExt = originalName.substring(pos+1);
				//subString : 문자열에서 특정 부분을 골라낼 때 사용 - "."다음에 있는 확장자 + 1
				logger.debug("String fileExt is {}",fileExt);
				// 오리지날 파일 확장자
				fileExt = fileExt.toLowerCase();
				// toLowerCase : 문자열의 모든 알파벳 문자를 소문자로 변환
				logger.debug("fileExt : {}",fileExt);
				long fileSize = file.getSize(); // 오리지널 파일 크기 받기
				logger.debug("long fileSize : {}",fileSize);
				
				kidsFile.setKidsCd(kidsCd);
				kidsFile.setKidsFileNm(fileName);
				kidsFile.setKidsFileExt(fileExt);
				kidsFile.setKidsFileSize(fileSize);
				logger.debug("kidsFile : {}",kidsFile);
				reportDao.addKidsReportFile(kidsFile);
				
				// 2. 파일 저장하기 (resources)
				File temp = new File(path+"\\"+fileName+"."+fileExt);
				try {
					file.transferTo(temp);
					//transferTo : 업로드 한 파일 데이터를 지정한 파일에 저장
				}catch (IllegalStateException e){
					e.printStackTrace();
					if(temp.exists()) {
						if(temp.delete()) {
							logger.debug("{} 파일 삭제 성공 ",temp);
						}else {
							logger.debug("{} 파일 삭제 실패 ",temp);
						}
					}
				}
			}
		}
	}
