package com.cafe24.hanboa.teacher;

public class TeacherAndTeacherPay {

	private String teacherCd;
	private String teacherNm;
	private String teacherDateOfBirth;
	private String teacherPhone;
	private String teacherEmail;
	private String teacherAddress;
	private String teacherEntryDate;
	private String teacherPosition;
	private String teacherBank;
	private String teacherAccount;
	private int teacherPayStep;
	private String licenseKindergarten;
	String payCd;
	int payPayment;
	int payClosingCd;
	String payClosingDivision;
	String payRegistrationDate;
	String payRegistrant;
	public String getTeacherCd() {
		return teacherCd;
	}
	public void setTeacherCd(String teacherCd) {
		this.teacherCd = teacherCd;
	}
	public String getTeacherNm() {
		return teacherNm;
	}
	public void setTeacherNm(String teacherNm) {
		this.teacherNm = teacherNm;
	}
	public String getTeacherDateOfBirth() {
		return teacherDateOfBirth;
	}
	public void setTeacherDateOfBirth(String teacherDateOfBirth) {
		this.teacherDateOfBirth = teacherDateOfBirth;
	}
	public String getTeacherPhone() {
		return teacherPhone;
	}
	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}
	public String getTeacherEmail() {
		return teacherEmail;
	}
	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}
	public String getTeacherAddress() {
		return teacherAddress;
	}
	public void setTeacherAddress(String teacherAddress) {
		this.teacherAddress = teacherAddress;
	}
	public String getTeacherEntryDate() {
		return teacherEntryDate;
	}
	public void setTeacherEntryDate(String teacherEntryDate) {
		this.teacherEntryDate = teacherEntryDate;
	}
	public String getTeacherPosition() {
		return teacherPosition;
	}
	public void setTeacherPosition(String teacherPosition) {
		this.teacherPosition = teacherPosition;
	}
	public String getTeacherBank() {
		return teacherBank;
	}
	public void setTeacherBank(String teacherBank) {
		this.teacherBank = teacherBank;
	}
	public String getTeacherAccount() {
		return teacherAccount;
	}
	public void setTeacherAccount(String teacherAccount) {
		this.teacherAccount = teacherAccount;
	}
	public int getTeacherPayStep() {
		return teacherPayStep;
	}
	public void setTeacherPayStep(int teacherPayStep) {
		this.teacherPayStep = teacherPayStep;
	}
	public String getLicenseKindergarten() {
		return licenseKindergarten;
	}
	public void setLicenseKindergarten(String licenseKindergarten) {
		this.licenseKindergarten = licenseKindergarten;
	}
	public String getPayCd() {
		return payCd;
	}
	public void setPayCd(String payCd) {
		this.payCd = payCd;
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
	public String getPayClosingDivision() {
		return payClosingDivision;
	}
	public void setPayClosingDivision(String payClosingDivision) {
		this.payClosingDivision = payClosingDivision;
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
	
	@Override
	public String toString() {
		return "TeacherAndTeacherPay [teacherCd=" + teacherCd + ", teacherNm=" + teacherNm + ", teacherDateOfBirth="
				+ teacherDateOfBirth + ", teacherPhone=" + teacherPhone + ", teacherEmail=" + teacherEmail
				+ ", teacherAddress=" + teacherAddress + ", teacherEntryDate=" + teacherEntryDate + ", teacherPosition="
				+ teacherPosition + ", teacherBank=" + teacherBank + ", teacherAccount=" + teacherAccount
				+ ", teacherPayStep=" + teacherPayStep + ", licenseKindergarten=" + licenseKindergarten + ", payCd="
				+ payCd + ", payPayment=" + payPayment + ", payClosingCd=" + payClosingCd + ", payClosingDivision="
				+ payClosingDivision + ", payRegistrationDate=" + payRegistrationDate + ", payRegistrant=" + payRegistrant
				+ "]";
	}
}