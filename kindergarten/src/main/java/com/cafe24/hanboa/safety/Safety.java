package com.cafe24.hanboa.safety;

public class Safety {
	String safetyExecutionCd;
	String totalResourceCd;
	String safetyTime;
	String safetyKidsCount;
	String safetyHost;
	String safetyExpenditureCost;
	String safetyClosingCd;
	String safetyDivision;
	String safetyClosingOption;
	String safetyRestrant;
	String safetyRegistrationDate;
	String licenseKindergarten;
	
	public String getSafetyExecutionCd() {
		return safetyExecutionCd;
	}
	public void setSafetyExecutionCd(String safetyExecutionCd) {
		this.safetyExecutionCd = safetyExecutionCd;
	}
	public String getTotalResourceCd() {
		return totalResourceCd;
	}
	public void setTotalResourceCd(String totalResourceCd) {
		this.totalResourceCd = totalResourceCd;
	}
	public String getSafetyTime() {
		return safetyTime;
	}
	public void setSafetyTime(String safetyTime) {
		this.safetyTime = safetyTime;
	}
	public String getSafetyKidsCount() {
		return safetyKidsCount;
	}
	public void setSafetyKidsCount(String safetyKidsCount) {
		this.safetyKidsCount = safetyKidsCount;
	}
	public String getSafetyHost() {
		return safetyHost;
	}
	public void setSafetyHost(String safetyHost) {
		this.safetyHost = safetyHost;
	}
	public String getSafetyExpenditureCost() {
		return safetyExpenditureCost;
	}
	public void setSafetyExpenditureCost(String safetyExpenditureCost) {
		this.safetyExpenditureCost = safetyExpenditureCost;
	}
	public String getSafetyClosingCd() {
		return safetyClosingCd;
	}
	public void setSafetyClosingCd(String safetyClosingCd) {
		this.safetyClosingCd = safetyClosingCd;
	}
	public String getSafetyDivision() {
		return safetyDivision;
	}
	public void setSafetyDivision(String safetyDivision) {
		this.safetyDivision = safetyDivision;
	}
	public String getSafetyClosingOption() {
		return safetyClosingOption;
	}
	public void setSafetyClosingOption(String safetyClosingOption) {
		this.safetyClosingOption = safetyClosingOption;
	}
	public String getSafetyRestrant() {
		return safetyRestrant;
	}
	public void setSafetyRestrant(String safetyRestrant) {
		this.safetyRestrant = safetyRestrant;
	}
	public String getSafetyRegistrationDate() {
		return safetyRegistrationDate;
	}
	public void setSafetyRegistrationDate(String safetyRegistrationDate) {
		this.safetyRegistrationDate = safetyRegistrationDate;
	}
	public String getLicenseKindergarten() {
		return licenseKindergarten;
	}
	public void setLicenseKindergarten(String licenseKindergarten) {
		this.licenseKindergarten = licenseKindergarten;
	}
	
	@Override
	public String toString() {
		return "Safety [safetyExecutionCd=" + safetyExecutionCd + ", totalResourceCd=" + totalResourceCd
				+ ", safetyTime=" + safetyTime + ", safetyKidsCount=" + safetyKidsCount + ", safetyHost=" + safetyHost
				+ ", safetyExpenditureCost=" + safetyExpenditureCost + ", safetyClosingCd=" + safetyClosingCd
				+ ", safetyDivision=" + safetyDivision + ", safetyClosingOption=" + safetyClosingOption
				+ ", safetyRestrant=" + safetyRestrant + ", safetyRegistrationDate=" + safetyRegistrationDate
				+ ", licenseKindergarten=" + licenseKindergarten + "]";
	}
}
