package com.cafe24.hanboa.program;

public class ProgramApplication {
	private String programApplCd;
	private String kidsCd;
	private String programCd;
	private String programDivision;
	private int programCost;
	private int programClosingProgramCost;
	private String programClosingOption;
	private String programRegistrationDate;
	private String programRegistrant;
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
	public String getProgramDivision() {
		return programDivision;
	}
	public void setProgramDivision(String programDivision) {
		this.programDivision = programDivision;
	}
	public int getProgramCost() {
		return programCost;
	}
	public void setProgramCost(int programCost) {
		this.programCost = programCost;
	}
	public int getProgramClosingProgramCost() {
		return programClosingProgramCost;
	}
	public void setProgramClosingProgramCost(int programClosingProgramCost) {
		this.programClosingProgramCost = programClosingProgramCost;
	}
	public String getProgramClosingOption() {
		return programClosingOption;
	}
	public void setProgramClosingOption(String programClosingOption) {
		this.programClosingOption = programClosingOption;
	}
	public String getProgramRegistrationDate() {
		return programRegistrationDate;
	}
	public void setProgramRegistrationDate(String programRegistrationDate) {
		this.programRegistrationDate = programRegistrationDate;
	}
	public String getProgramRegistrant() {
		return programRegistrant;
	}
	public void setProgramRegistrant(String programRegistrant) {
		this.programRegistrant = programRegistrant;
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
				+ ", programDivision=" + programDivision + ", programCost=" + programCost
				+ ", programClosingProgramCost=" + programClosingProgramCost + ", programClosingOption="
				+ programClosingOption + ", programRegistrationDate=" + programRegistrationDate + ", programRegistrant="
				+ programRegistrant + ", licenseKindergarten=" + licenseKindergarten + "]";
	}
}
