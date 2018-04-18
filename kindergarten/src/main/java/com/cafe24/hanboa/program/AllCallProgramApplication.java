package com.cafe24.hanboa.program;

public class AllCallProgramApplication {
	private String programApplCd;
	private String kidsCd;
	private String programCd;
	private String PRAPDivision;
	private int PRAPCost;
	private String PRAPClosingCd;
	private String PRAPClosingDivision;
	private String PRAPRegistrationDate;
	private String PRAPRegistrant;
	private String licenseKindergarten;
	private String kidsNm;
	private String programNm;
	
	public String getProgramApplCd() {
		return programApplCd;
	}
	public void setProgramApplCd(String programApplCd) {
		this.programApplCd = programApplCd;
	}
	public String getKidsCd() {
		return kidsCd;
	}
	public void setKidsCd(String kidsCd) {
		this.kidsCd = kidsCd;
	}
	public String getProgramCd() {
		return programCd;
	}
	public void setProgramCd(String programCd) {
		this.programCd = programCd;
	}
	public String getPRAPDivision() {
		return PRAPDivision;
	}
	public void setPRAPDivision(String pRAPDivision) {
		PRAPDivision = pRAPDivision;
	}
	public int getPRAPCost() {
		return PRAPCost;
	}
	public void setPRAPCost(int pRAPCost) {
		PRAPCost = pRAPCost;
	}
	public String getPRAPClosingCd() {
		return PRAPClosingCd;
	}
	public void setPRAPClosingCd(String pRAPClosingCd) {
		PRAPClosingCd = pRAPClosingCd;
	}
	public String getPRAPClosingDivision() {
		return PRAPClosingDivision;
	}
	public void setPRAPClosingDivision(String pRAPClosingDivision) {
		PRAPClosingDivision = pRAPClosingDivision;
	}
	public String getPRAPRegistrationDate() {
		return PRAPRegistrationDate;
	}
	public void setPRAPRegistrationDate(String pRAPRegistrationDate) {
		PRAPRegistrationDate = pRAPRegistrationDate;
	}
	public String getPRAPRegistrant() {
		return PRAPRegistrant;
	}
	public void setPRAPRegistrant(String pRAPRegistrant) {
		PRAPRegistrant = pRAPRegistrant;
	}
	public String getLicenseKindergarten() {
		return licenseKindergarten;
	}
	public void setLicenseKindergarten(String licenseKindergarten) {
		this.licenseKindergarten = licenseKindergarten;
	}
	public String getKidsNm() {
		return kidsNm;
	}
	public void setKidsNm(String kidsNm) {
		this.kidsNm = kidsNm;
	}
	public String getProgramNm() {
		return programNm;
	}
	public void setProgramNm(String programNm) {
		this.programNm = programNm;
	}
	
	@Override
	public String toString() {
		return "AllCallProgramApplication [programApplCd=" + programApplCd + ", kidsCd=" + kidsCd + ", programCd="
				+ programCd + ", PRAPDivision=" + PRAPDivision + ", PRAPCost=" + PRAPCost + ", PRAPClosingCd="
				+ PRAPClosingCd + ", PRAPClosingDivision=" + PRAPClosingDivision + ", PRAPRegistrationDate="
				+ PRAPRegistrationDate + ", PRAPRegistrant=" + PRAPRegistrant + ", licenseKindergarten="
				+ licenseKindergarten + ", kidsNm=" + kidsNm + ", programNm=" + programNm + "]";
	}
}