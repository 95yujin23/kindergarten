package com.cafe24.hanboa.report;

public class ReportList {
	private String kidsReportCd;
	private String reportNm; //tb_report_resource
	private String kidsNm; //tb_kids
	private String classNm;
	private String registrant;
	private String registrationDate;
	
	
	
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
