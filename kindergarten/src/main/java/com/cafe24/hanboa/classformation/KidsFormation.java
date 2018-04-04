package com.cafe24.hanboa.classformation;

public class KidsFormation {
	private String kidsClassFormationCd;
	private String kidsCd;	// TB_KIDS
	private String kidsNm; // TB_KIDS
	private String kidsClassCd;	//TB_KIDS_CLASS_FORMATION 만약 이 부분이 NULL이면 kids_class_formation의 구분에서 미분류로 표시되어야 한다.
	private String classNm;	// TB_KIDS_CLASS
	private String kidsParentPhone; // TB_KIDS
	
	public String getKidsClassFormationCd() {
		return kidsClassFormationCd;
	}
	public void setKidsClassFormationCd(String kidsClassFormationCd) {
		this.kidsClassFormationCd = kidsClassFormationCd;
	}
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
	public String getKidsParentPhone() {
		return kidsParentPhone;
	}
	public void setKidsParentPhone(String kidsParentPhone) {
		this.kidsParentPhone = kidsParentPhone;
	}
	
	
	
	
}
