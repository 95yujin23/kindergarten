package com.cafe24.hanboa.report;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class ReportCommand {
	private String kidsReportCd;
	private String reportCd;
	private String kidsCd;
	private String licenseKindergarten;
	private String registrant;
	private String registrationDate;
	List<MultipartFile> file;
	
	public String getKidsReportCd() {
		return kidsReportCd;
	}
	public void setKidsReportCd(String kidsReportCd) {
		this.kidsReportCd = kidsReportCd;
	}
	public String getReportCd() {
		return reportCd;
	}
	public void setReportCd(String reportCd) {
		this.reportCd = reportCd;
	}
	public String getKidsCd() {
		return kidsCd;
	}
	public void setKidsCd(String kidsCd) {
		this.kidsCd = kidsCd;
	}
	public String getLicenseKindergarten() {
		return licenseKindergarten;
	}
	public void setLicenseKindergarten(String licenseKindergarten) {
		this.licenseKindergarten = licenseKindergarten;
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
	public List<MultipartFile> getFile() {
		return file;
	}
	public void setFile(List<MultipartFile> file) {
		this.file = file;
	}
	
	
	
}
