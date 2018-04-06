package com.cafe24.hanboa.license;

public class License {
	private String licenseKindergarten;
	private String kindergartenNm;
	private String licenseGrantDay;
	private String licenseExpirationDay;
	private String kindergartenAddress;
	private String kindergartenPostCd;
	private String kindergartenPhone;
	private String kindergartenHomepage;
	private String kindergartenOpenHour;
	private String kindergartenDateOfFoundation;
	private String kindergartenTypeOfFoundation;
	private String kindergartenLeader;
	
	public String getLicenseKindergarten() {
		return licenseKindergarten;
	}
	public void setLicenseKindergarten(String licenseKindergarten) {
		this.licenseKindergarten = licenseKindergarten;
	}
	public String getKindergartenNm() {
		return kindergartenNm;
	}
	public void setKindergartenNm(String kindergartenNm) {
		this.kindergartenNm = kindergartenNm;
	}
	public String getLicenseGrantDay() {
		return licenseGrantDay;
	}
	public void setLicenseGrantDay(String licenseGrantDay) {
		this.licenseGrantDay = licenseGrantDay;
	}
	public String getLicenseExpirationDay() {
		return licenseExpirationDay;
	}
	public void setLicenseExpirationDay(String licenseExpirationDay) {
		this.licenseExpirationDay = licenseExpirationDay;
	}
	public String getKindergartenAddress() {
		return kindergartenAddress;
	}
	public void setKindergartenAddress(String kindergartenAddress) {
		this.kindergartenAddress = kindergartenAddress;
	}
	public String getKindergartenPostCd() {
		return kindergartenPostCd;
	}
	public void setKindergartenPostCd(String kindergartenPostCd) {
		this.kindergartenPostCd = kindergartenPostCd;
	}
	public String getKindergartenPhone() {
		return kindergartenPhone;
	}
	public void setKindergartenPhone(String kindergartenPhone) {
		this.kindergartenPhone = kindergartenPhone;
	}
	public String getKindergartenHomepage() {
		return kindergartenHomepage;
	}
	public void setKindergartenHomepage(String kindergartenHomepage) {
		this.kindergartenHomepage = kindergartenHomepage;
	}
	public String getKindergartenOpenHour() {
		return kindergartenOpenHour;
	}
	public void setKindergartenOpenHour(String kindergartenOpenHour) {
		this.kindergartenOpenHour = kindergartenOpenHour;
	}
	public String getKindergartenDateOfFoundation() {
		return kindergartenDateOfFoundation;
	}
	public void setKindergartenDateOfFoundation(String kindergartenDateOfFoundation) {
		this.kindergartenDateOfFoundation = kindergartenDateOfFoundation;
	}
	public String getKindergartenTypeOfFoundation() {
		return kindergartenTypeOfFoundation;
	}
	public void setKindergartenTypeOfFoundation(String kindergartenTypeOfFoundation) {
		this.kindergartenTypeOfFoundation = kindergartenTypeOfFoundation;
	}
	public String getKindergartenLeader() {
		return kindergartenLeader;
	}
	public void setKindergartenLeader(String kindergartenLeader) {
		this.kindergartenLeader = kindergartenLeader;
	}
	@Override
	public String toString() {
		return "License [licenseKindergarten=" + licenseKindergarten + ", kindergartenNm=" + kindergartenNm
				+ ", licenseGrantDay=" + licenseGrantDay + ", licenseExpirationDay=" + licenseExpirationDay
				+ ", kindergartenAddress=" + kindergartenAddress + ", kindergartenPhone=" + kindergartenPhone
				+ ", kindergartenHomepage=" + kindergartenHomepage + ", kindergartenOpenHour=" + kindergartenOpenHour
				+ ", kindergartenDateOfFoundation=" + kindergartenDateOfFoundation + ", kindergartenTypeOfFoundation=" + kindergartenTypeOfFoundation 
				+ ", kindergartenLeader=" + kindergartenLeader + ", kindergartenPostCd=" + kindergartenPostCd + "]";
	}
}
