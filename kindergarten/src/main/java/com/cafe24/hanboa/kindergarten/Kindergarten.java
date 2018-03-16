package com.cafe24.hanboa.kindergarten;

public class Kindergarten {
	private String licenseKindergarten;
	private String kindergartenNm;
	private String licenseGrantDay;
	private String licenseExpirationDay;
	private String kindergartenAddress;
	private String kindergartenPhone;
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
	public String getKindergartenPhone() {
		return kindergartenPhone;
	}
	public void setKindergartenPhone(String kindergartenPhone) {
		this.kindergartenPhone = kindergartenPhone;
	}
	
	@Override
	public String toString() {
		return "Kindergarten [licenseKindergarten=" + licenseKindergarten + ", kindergartenNm=" + kindergartenNm
				+ ", licenseGrantDay=" + licenseGrantDay + ", licenseExpirationDay=" + licenseExpirationDay
				+ ", kindergartenAddress=" + kindergartenAddress + ", kindergartenPhone=" + kindergartenPhone + "]";
	}
}
