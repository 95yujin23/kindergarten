package com.cafe24.hanboa.classformation;

public class KidsClass {
	//영유아반관리 TB_KIDS_CLASS
	// 주석
	
	private String kidsClassCd;
	private String classNm;
	private String createDate;
	private int classKidsAge;
	private String licenseKindergarten;
	
	public String getKidsClassCd() {
		return kidsClassCd;
	}
	public void setKidsClassCd(String kidsClassCd) {
		this.kidsClassCd = kidsClassCd;
	}
	public String getClassNm() {
		return classNm;
	}
	public void setClassNm(String classNm) {
		this.classNm = classNm;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public int getClassKidsAge() {
		return classKidsAge;
	}
	public void setClassKidsAge(int classKidsAge) {
		this.classKidsAge = classKidsAge;
	}
	public String getLicenseKindergarten() {
		return licenseKindergarten;
	}
	public void setLicenseKindergarten(String licenseKindergarten) {
		this.licenseKindergarten = licenseKindergarten;
	}
	
	
	
	
}
