package com.cafe24.hanboa.teacher;

public class Teacher {

	private String teacherCd;
	private String teacherNm;
	private String teacherDateOfBirth;
	private String teacherPhone;
	private String teacherEmail;
	private String teacherPw;
	private String teacherAddress;
	private String teacherEntryDate;
	private String teacherPosition;
	private String teacherBank;
	private String teacherAccount;
	private int teacherPayStep;
	private String licenseKindergarten;
	
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
	public String getTeacherPw() {
		return teacherPw;
	}
	public void setTeacherPw(String teacherPw) {
		this.teacherPw = teacherPw;
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
	
	@Override
	public String toString() {
		return "Teacher [teacherCd=" + teacherCd + ", teacherNm=" + teacherNm + ", teacherDateOfBirth="
				+ teacherDateOfBirth + ", teacherPhone=" + teacherPhone + ", teacherEmail=" + teacherEmail
				+ ", teacherPw=" + teacherPw + ", teacherAddress=" + teacherAddress + ", teacherEntryDate="
				+ teacherEntryDate + ", teacherPosition=" + teacherPosition + ", teacherBank=" + teacherBank
				+ ", teacherAccount=" + teacherAccount + ", teacherPayStep=" + teacherPayStep + ", licenseKindergarten="
				+ licenseKindergarten + "]";
	}
}