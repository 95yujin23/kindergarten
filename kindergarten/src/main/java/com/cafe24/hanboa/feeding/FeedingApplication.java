package com.cafe24.hanboa.feeding;

public class FeedingApplication {
	private String feedingApplicationCd;
	private String kidsCd;
	private String feedingMonthlyCd;
	private int feapExpenseMonth;
	private String feapClosingIncome;
	private String feapClosingOption;
	private String feapDivision;
	private String feapRegistrationDate;
	private String feapRegistrant;
	private String licenseKindergarten;
	
	public String getFeedingApplicationCd() {
		return feedingApplicationCd;
	}
	public void setFeedingApplicationCd(String feedingApplicationCd) {
		this.feedingApplicationCd = feedingApplicationCd;
	}
	public String getKidsCd() {
		return kidsCd;
	}
	public void setKidsCd(String kidsCd) {
		this.kidsCd = kidsCd;
	}
	public String getFeedingMonthlyCd() {
		return feedingMonthlyCd;
	}
	public void setFeedingMonthlyCd(String feedingMonthlyCd) {
		this.feedingMonthlyCd = feedingMonthlyCd;
	}
	public int getFeapExpenseMonth() {
		return feapExpenseMonth;
	}
	public void setFeapExpenseMonth(int feapExpenseMonth) {
		this.feapExpenseMonth = feapExpenseMonth;
	}
	public String getFeapClosingIncome() {
		return feapClosingIncome;
	}
	public void setFeapClosingIncome(String feapClosingIncome) {
		this.feapClosingIncome = feapClosingIncome;
	}
	public String getFeapClosingOption() {
		return feapClosingOption;
	}
	public void setFeapClosingOption(String feapClosingOption) {
		this.feapClosingOption = feapClosingOption;
	}
	public String getFeapDivision() {
		return feapDivision;
	}
	public void setFeapDivision(String feapDivision) {
		this.feapDivision = feapDivision;
	}
	public String getFeapRegistrationDate() {
		return feapRegistrationDate;
	}
	public void setFeapRegistrationDate(String feapRegistrationDate) {
		this.feapRegistrationDate = feapRegistrationDate;
	}
	public String getFeapRegistrant() {
		return feapRegistrant;
	}
	public void setFeapRegistrant(String feapRegistrant) {
		this.feapRegistrant = feapRegistrant;
	}
	public String getLicenseKindergarten() {
		return licenseKindergarten;
	}
	public void setLicenseKindergarten(String licenseKindergarten) {
		this.licenseKindergarten = licenseKindergarten;
	}
	@Override
	public String toString() {
		return "FeedingApplication [feedingApplicationCd=" + feedingApplicationCd + ", kidsCd=" + kidsCd
				+ ", feedingMonthlyCd=" + feedingMonthlyCd + ", feapExpenseMonth=" + feapExpenseMonth
				+ ", feapClosingIncome=" + feapClosingIncome + ", feapClosingOption=" + feapClosingOption
				+ ", feapDivision=" + feapDivision + ", feapRegistrationDate=" + feapRegistrationDate
				+ ", feapRegistrant=" + feapRegistrant + ", licenseKindergarten=" + licenseKindergarten + "]";
	}
	

	
	
	
	
	

}
