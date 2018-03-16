package com.cafe24.hanboa.statement;

public class Closing {
	//회계마감수정DTO TB_closing
	private String closingCd;
	private String statementCd;
	private int totalIncome;
	private int totalExpenditure;
	private String finalDeadline;
	private int totalGap;
	private String registrant;
	private String licenseKindergarten;
	
	public String getClosingCd() {
		return closingCd;
	}
	public void setClosingCd(String closingCd) {
		this.closingCd = closingCd;
	}
	public String getStatementCd() {
		return statementCd;
	}
	public void setStatementCd(String statementCd) {
		this.statementCd = statementCd;
	}
	public int getTotalIncome() {
		return totalIncome;
	}
	public void setTotalIncome(int totalIncome) {
		this.totalIncome = totalIncome;
	}
	public int getTotalExpenditure() {
		return totalExpenditure;
	}
	public void setTotalExpenditure(int totalExpenditure) {
		this.totalExpenditure = totalExpenditure;
	}
	public String getFinalDeadline() {
		return finalDeadline;
	}
	public void setFinalDeadline(String finalDeadline) {
		this.finalDeadline = finalDeadline;
	}
	public int getTotalGap() {
		return totalGap;
	}
	public void setTotalGap(int totalGap) {
		this.totalGap = totalGap;
	}
	public String getRegistrant() {
		return registrant;
	}
	public void setRegistrant(String registrant) {
		this.registrant = registrant;
	}
	public String getLicenseKindergarten() {
		return licenseKindergarten;
	}
	public void setLicenseKindergarten(String licenseKindergarten) {
		this.licenseKindergarten = licenseKindergarten;
	}
	
	
}
