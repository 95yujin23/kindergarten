package com.cafe24.hanboa.report;

public class ReportList {
	private String kidsReportCd; //리포트 코드
	private String reportNm; //리포트 이름
	private String kidsNm; //유아이름
	private String classNm; // 반이름
	private String registrant; //등록자
	private String registrationDate; //등록시기
	
	
	
	public String getReportNm() {
		return reportNm;
	}
	public void setReportNm(String reportNm) {
		this.reportNm = reportNm;
	}
	public String getClassNm() {
		return classNm;
	}
	public void setClassNm(String classNm) {
		this.classNm = classNm;
	}
	public String getKidsReportCd() {
		return kidsReportCd;
	}
	public void setKidsReportCd(String kidsReportCd) {
		this.kidsReportCd = kidsReportCd;
	}
	public String getKidsNm() {
		return kidsNm;
	}
	public void setKidsNm(String kidsNm) {
		this.kidsNm = kidsNm;
	}
	public String getRegistrant() {
		return registrant;
	}
	public void setRegistrant(String registrant) {
		this.registrant = registrant;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	
}
