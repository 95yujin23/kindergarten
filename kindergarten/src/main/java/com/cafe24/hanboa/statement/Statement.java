package com.cafe24.hanboa.statement;

public class Statement {
	//회계전표 tb_statement
	
	private String statementCd;
	private String statementCateCd;
	private int amount;
	private String incomeExpendotureType;
	private String closingDate;
	private String registrant;
	private String closingAccountingTotalGroupCd;
	private String licenseKindergarten;
	
	public String getStatementCd() {
		return statementCd;
	}
	public void setStatementCd(String statementCd) {
		this.statementCd = statementCd;
	}
	public String getStatementCateCd() {
		return statementCateCd;
	}
	public void setStatementCateCd(String statementCateCd) {
		this.statementCateCd = statementCateCd;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getIncomeExpendotureType() {
		return incomeExpendotureType;
	}
	public void setIncomeExpendotureType(String incomeExpendotureType) {
		this.incomeExpendotureType = incomeExpendotureType;
	}
	public String getClosingDate() {
		return closingDate;
	}
	public void setClosingDate(String closingDate) {
		this.closingDate = closingDate;
	}
	public String getRegistrant() {
		return registrant;
	}
	public void setRegistrant(String registrant) {
		this.registrant = registrant;
	}
	public String getClosingAccountingTotalGroupCd() {
		return closingAccountingTotalGroupCd;
	}
	public void setClosingAccountingTotalGroupCd(String closingAccountingTotalGroupCd) {
		this.closingAccountingTotalGroupCd = closingAccountingTotalGroupCd;
	}
	public String getLicenseKindergarten() {
		return licenseKindergarten;
	}
	public void setLicenseKindergarten(String licenseKindergarten) {
		this.licenseKindergarten = licenseKindergarten;
	}
	
	
	
}
