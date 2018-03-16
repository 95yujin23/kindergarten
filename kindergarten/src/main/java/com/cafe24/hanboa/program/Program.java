package com.cafe24.hanboa.program;

public class Program {
	private String programCd;
	private String totalResourceCd;
	private String programNm;
	private int programNumberWeek;
	private int programOperationTime;
	private int programOutsourcingCost;
	private int programClosingAccoutingExpenditurePayment;
	private String programClosingoption;
	private String contractCd;
	private String programRegistrationDate;
	private String programRegistrant;
	private String licenseKindergarten;
	public String getProgramCd() {
		return programCd;
	}
	public void setProgramCd(String programCd) {
		this.programCd = programCd;
	}
	public String getTotalResourceCd() {
		return totalResourceCd;
	}
	public void setTotalResourceCd(String totalResourceCd) {
		this.totalResourceCd = totalResourceCd;
	}
	public String getProgramNm() {
		return programNm;
	}
	public void setProgramNm(String programNm) {
		this.programNm = programNm;
	}
	public int getProgramNumberWeek() {
		return programNumberWeek;
	}
	public void setProgramNumberWeek(int programNumberWeek) {
		this.programNumberWeek = programNumberWeek;
	}
	public int getProgramOperationTime() {
		return programOperationTime;
	}
	public void setProgramOperationTime(int programOperationTime) {
		this.programOperationTime = programOperationTime;
	}
	public int getProgramOutsourcingCost() {
		return programOutsourcingCost;
	}
	public void setProgramOutsourcingCost(int programOutsourcingCost) {
		this.programOutsourcingCost = programOutsourcingCost;
	}
	public int getProgramClosingAccoutingExpenditurePayment() {
		return programClosingAccoutingExpenditurePayment;
	}
	public void setProgramClosingAccoutingExpenditurePayment(int programClosingAccoutingExpenditurePayment) {
		this.programClosingAccoutingExpenditurePayment = programClosingAccoutingExpenditurePayment;
	}
	public String getProgramClosingoption() {
		return programClosingoption;
	}
	public void setProgramClosingoption(String programClosingoption) {
		this.programClosingoption = programClosingoption;
	}
	public String getContractCd() {
		return contractCd;
	}
	public void setContractCd(String contractCd) {
		this.contractCd = contractCd;
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
		return "Program [programCd=" + programCd + ", totalResourceCd=" + totalResourceCd + ", programNm=" + programNm
				+ ", programNumberWeek=" + programNumberWeek + ", programOperationTime=" + programOperationTime
				+ ", programOutsourcingCost=" + programOutsourcingCost + ", programClosingAccoutingExpenditurePayment="
				+ programClosingAccoutingExpenditurePayment + ", programClosingoption=" + programClosingoption
				+ ", contractCd=" + contractCd + ", programRegistrationDate=" + programRegistrationDate
				+ ", programRegistrant=" + programRegistrant + ", licenseKindergarten=" + licenseKindergarten + "]";
	}
}