package com.cafe24.hanboa.classformation;

public class ClassFormation {
	//영유아반편성 TB_KIDS_CLASS_FORMATION
	// 영유아 반편성을 위한 테이블
	
	private String classFormationCd;
	private String kidsCd;
	private String kidsClassCd;
	private String licenseKindergarten;
	
	public String getClassFormationCd() {
		return classFormationCd;
	}
	public void setClassFormationCd(String classFormationCd) {
		this.classFormationCd = classFormationCd;
	}
	public String getKidsCd() {
		return kidsCd;
	}
	public void setKidsCd(String kidsCd) {
		this.kidsCd = kidsCd;
	}
	public String getKidsClassCd() {
		return kidsClassCd;
	}
	public void setKidsClassCd(String kidsClassCd) {
		this.kidsClassCd = kidsClassCd;
	}
	public String getLicenseKindergarten() {
		return licenseKindergarten;
	}
	public void setLicenseKindergarten(String licenseKindergarten) {
		this.licenseKindergarten = licenseKindergarten;
	}
	
	
}
