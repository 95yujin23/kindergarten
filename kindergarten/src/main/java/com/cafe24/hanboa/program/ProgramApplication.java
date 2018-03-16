package com.cafe24.hanboa.program;

public class ProgramApplication {
	private String programApplCd;
	private String kidsCd;
	private String programCd;
	private String PRAPDivision;
	private int PRAPCost;
	private int PRAPClosingIncome;
	private String PRAPClosingOption;
	private String PRAPRegistrationDate;
	private String PRAPRegistrant;
	private String licenseKindergarten;
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
	public int getPRAPClosingIncome() {
		return PRAPClosingIncome;
	}
	public void setPRAPClosingIncome(int pRAPClosingIncome) {
		PRAPClosingIncome = pRAPClosingIncome;
	}
	public String getPRAPClosingOption() {
		return PRAPClosingOption;
	}
	public void setPRAPClosingOption(String pRAPClosingOption) {
		PRAPClosingOption = pRAPClosingOption;
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
	@Override
	public String toString() {
		return "ProgramApplication [programApplCd=" + programApplCd + ", kidsCd=" + kidsCd + ", programCd=" + programCd
				+ ", PRAPDivision=" + PRAPDivision + ", PRAPCost=" + PRAPCost + ", PRAPClosingIncome="
				+ PRAPClosingIncome + ", PRAPClosingOption=" + PRAPClosingOption + ", PRAPRegistrationDate="
				+ PRAPRegistrationDate + ", PRAPRegistrant=" + PRAPRegistrant + ", licenseKindergarten="
				+ licenseKindergarten + "]";
	}
}
