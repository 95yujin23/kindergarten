package com.cafe24.hanboa.feeding;

public class FeedingApplication {
	private String feedingApplicationCd;
	private String kidsCd;
	private String feedingMonthlyCd;
	private int feapEspenseMonth;
	private int feapClosingIncome;
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
	public int getFeapEspenseMonth() {
		return feapEspenseMonth;
	}
	public void setFeapEspenseMonth(int feapEspenseMonth) {
		this.feapEspenseMonth = feapEspenseMonth;
	}
	public int getFeapClosingIncome() {
		return feapClosingIncome;
	}
	public void setFeapClosingIncome(int feapClosingIncome) {
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
				+ ", feedingMonthlyCd=" + feedingMonthlyCd + ", feapEspenseMonth=" + feapEspenseMonth
				+ ", feapClosingIncome=" + feapClosingIncome + ", feapClosingOption=" + feapClosingOption
				+ ", feapDivision=" + feapDivision + ", feapRegistrationDate=" + feapRegistrationDate
				+ ", feapRegistrant=" + feapRegistrant + ", licenseKindergarten=" + licenseKindergarten + "]";
	}
	

	
	
	
	
	

}
