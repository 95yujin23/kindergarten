package com.cafe24.hanboa.kids;

import java.util.List;

public class KidsAndKidsFile {
	private String kidsCd;
	private String kidsNm;
	private String kidsDateOfBirth;
	private String kidsAddress;
	private String kidsParentPhone;
	private String kidsSparePhone;
	private String kidsGender;
	private String kidsCommutingType;
	private String kidsCaution;
	private String kidsAdmission;
	private String kidsGraduation;
	private String licenseKindergarten;
	List<KidsFile> list;
	
	public String getKidsCd() {
		return kidsCd;
	}
	public void setKidsCd(String kidsCd) {
		this.kidsCd = kidsCd;
	}
	public String getKidsNm() {
		return kidsNm;
	}
	public void setKidsNm(String kidsNm) {
		this.kidsNm = kidsNm;
	}
	public String getKidsDateOfBirth() {
		return kidsDateOfBirth;
	}
	public void setKidsDateOfBirth(String kidsDateOfBirth) {
		this.kidsDateOfBirth = kidsDateOfBirth;
	}
	public String getKidsAddress() {
		return kidsAddress;
	}
	public void setKidsAddress(String kidsAddress) {
		this.kidsAddress = kidsAddress;
	}
	public String getKidsParentPhone() {
		return kidsParentPhone;
	}
	public void setKidsParentPhone(String kidsParentPhone) {
		this.kidsParentPhone = kidsParentPhone;
	}
	public String getKidsSparePhone() {
		return kidsSparePhone;
	}
	public void setKidsSparePhone(String kidsSparePhone) {
		this.kidsSparePhone = kidsSparePhone;
	}
	public String getKidsGender() {
		return kidsGender;
	}
	public void setKidsGender(String kidsGender) {
		this.kidsGender = kidsGender;
	}
	public String getKidsCommutingType() {
		return kidsCommutingType;
	}
	public void setKidsCommutingType(String kidsCommutingType) {
		this.kidsCommutingType = kidsCommutingType;
	}
	public String getKidsCaution() {
		return kidsCaution;
	}
	public void setKidsCaution(String kidsCaution) {
		this.kidsCaution = kidsCaution;
	}
	public String getKidsAdmission() {
		return kidsAdmission;
	}
	public void setKidsAdmission(String kidsAdmission) {
		this.kidsAdmission = kidsAdmission;
	}
	public String getKidsGraduation() {
		return kidsGraduation;
	}
	public void setKidsGraduation(String kidsGraduation) {
		this.kidsGraduation = kidsGraduation;
	}
	public String getLicenseKindergarten() {
		return licenseKindergarten;
	}
	public void setLicenseKindergarten(String licenseKindergarten) {
		this.licenseKindergarten = licenseKindergarten;
	}
	public List<KidsFile> getList() {
		return list;
	}
	public void setList(List<KidsFile> list) {
		this.list = list;
	}
	
	@Override
	public String toString() {
		return "KidsAndKidsFile [kidsCd=" + kidsCd + ", kidsNm=" + kidsNm + ", kidsDateOfBirth=" + kidsDateOfBirth
				+ ", kidsAddress=" + kidsAddress + ", kidsParentPhone=" + kidsParentPhone + ", kidsSparePhone="
				+ kidsSparePhone + ", kidsGender=" + kidsGender + ", kidsCommutingType=" + kidsCommutingType
				+ ", kidsCaution=" + kidsCaution + ", kidsAdmission=" + kidsAdmission + ", kidsGraduation="
				+ kidsGraduation + ", licenseKindergarten=" + licenseKindergarten + ", list=" + list + "]";
	}
}
