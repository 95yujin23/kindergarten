package com.cafe24.hanboa.classformation;

public class KidsClass {
	//영유아반관리 TB_KIDS_CLASS
	private String kidsClassCd;
	private String classNm;
	private String createDate;
	private int classKidsAge;
	private String licenseKindergarten;
	
	public String getKidsClassCd() {
		return kidsClassCd;
	}
	public void setKidsClassCd(String kidsClassCd) {
		System.out.println("KidsClass setKidsClassCd is =  " + kidsClassCd);
		this.kidsClassCd = kidsClassCd;
	}
	public String getClassNm() {
		return classNm;
	}
	public void setClassNm(String classNm) {
		System.out.println("KidsClass setClassNm is =  " + classNm);
		this.classNm = classNm;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		System.out.println("KidsClass setCreateDate is =  " + createDate);
		this.createDate = createDate;
	}
	public int getClassKidsAge() {
		return classKidsAge;
	}
	public void setClassKidsAge(int classKidsAge) {
		System.out.println("KidsClass setClassKidsAge is =  " + classKidsAge);
		this.classKidsAge = classKidsAge;
	}
	public String getLicenseKindergarten() {
		return licenseKindergarten;
	}
	public void setLicenseKindergarten(String licenseKindergarten) {
		System.out.println("KidsClass setLicenseKindergarten is =  " + licenseKindergarten);
		this.licenseKindergarten = licenseKindergarten;
	}
	
	
	
	
}
