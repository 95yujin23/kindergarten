package com.cafe24.hanboa.teacher;

public class TeacherPay {
	String payCd;
	String teacherCd;
	int payPayment;
	int payClosingCd;
	String payClosingOption;
	String payRegistrationDate;
	String payRegistrant;
	String licenseKindergarten;
	
	public String getPayCd() {
		return payCd;
	}
	public void setPayCd(String payCd) {
		this.payCd = payCd;
	}
	public String getTeacherCd() {
		return teacherCd;
	}
	public void setTeacherCd(String teacherCd) {
		this.teacherCd = teacherCd;
	}
	public int getPayPayment() {
		return payPayment;
	}
	public void setPayPayment(int payPayment) {
		this.payPayment = payPayment;
	}
	public int getPayClosingCd() {
		return payClosingCd;
	}
	public void setPayClosingCd(int payClosingCd) {
		this.payClosingCd = payClosingCd;
	}
	public String getPayClosingOption() {
		return payClosingOption;
	}
	public void setPayClosingOption(String payClosingOption) {
		this.payClosingOption = payClosingOption;
	}
	public String getPayRegistrationDate() {
		return payRegistrationDate;
	}
	public void setPayRegistrationDate(String payRegistrationDate) {
		this.payRegistrationDate = payRegistrationDate;
	}
	public String getPayRegistrant() {
		return payRegistrant;
	}
	public void setPayRegistrant(String payRegistrant) {
		this.payRegistrant = payRegistrant;
	}
	public String getLicenseKindergarten() {
		return licenseKindergarten;
	}
	public void setLicenseKindergarten(String licenseKindergarten) {
		this.licenseKindergarten = licenseKindergarten;
	}
	
	@Override
	public String toString() {
		return "TeacherPay [payCd=" + payCd + ", teacherCd=" + teacherCd + ", payPayment=" + payPayment
				+ ", payClosingCd=" + payClosingCd + ", payClosingOption=" + payClosingOption + ", payRegistrationDate="
				+ payRegistrationDate + ", payRegistrant=" + payRegistrant + ", licenseKindergarten="
				+ licenseKindergarten + "]";
	}	
}
