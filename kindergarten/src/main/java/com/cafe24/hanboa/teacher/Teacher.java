package com.cafe24.hanboa.teacher;

public class Teacher {
	private String teacherCd;
	private String teacherNm;
	private String dateOfBirth;
	private String phone;
	private String email;
	private String password;
	private String address;
	private String entryDate;
	private String position;
	private String bank;
	private String account;
	private int payStep;
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
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getPayStep() {
		return payStep;
	}
	public void setPayStep(int payStep) {
		this.payStep = payStep;
	}
	public String getLicenseKindergarten() {
		return licenseKindergarten;
	}
	public void setLicenseKindergarten(String licenseKindergarten) {
		this.licenseKindergarten = licenseKindergarten;
	}
	
	@Override
	public String toString() {
		return "Teacher [teacherCd=" + teacherCd + ", teacherNm=" + teacherNm + ", dateOfBirth=" + dateOfBirth
				+ ", phone=" + phone + ", email=" + email + ", password=" + password + ", address=" + address
				+ ", entryDate=" + entryDate + ", position=" + position + ", bank=" + bank + ", account=" + account
				+ ", payStep=" + payStep + ", licenseKindergarten=" + licenseKindergarten + "]";
	}
}