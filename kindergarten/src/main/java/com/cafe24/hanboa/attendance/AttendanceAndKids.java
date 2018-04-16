package com.cafe24.hanboa.attendance;

public class AttendanceAndKids {
	private String kidsCd;
	private String kidsAttendanceDay;
	private String kidsAttendance;
	private String kidsComeHome;
	private String kidsRestLateType;
	private String kidsReason;
	private String licenseKindergarten;
	private String kidsNm;
	public String getKidsCd() {
		return kidsCd;
	}
	public void setKidsCd(String kidsCd) {
		this.kidsCd = kidsCd;
	}
	public String getKidsAttendanceDay() {
		return kidsAttendanceDay;
	}
	public void setKidsAttendanceDay(String kidsAttendanceDay) {
		this.kidsAttendanceDay = kidsAttendanceDay;
	}
	public String getKidsAttendance() {
		return kidsAttendance;
	}
	public void setKidsAttendance(String kidsAttendance) {
		this.kidsAttendance = kidsAttendance;
	}
	public String getKidsComeHome() {
		return kidsComeHome;
	}
	public void setKidsComeHome(String kidsComeHome) {
		this.kidsComeHome = kidsComeHome;
	}
	public String getKidsRestLateType() {
		return kidsRestLateType;
	}
	public void setKidsRestLateType(String kidsRestLateType) {
		this.kidsRestLateType = kidsRestLateType;
	}
	public String getKidsReason() {
		return kidsReason;
	}
	public void setKidsReason(String kidsReason) {
		this.kidsReason = kidsReason;
	}
	public String getLicenseKindergarten() {
		return licenseKindergarten;
	}
	public void setLicenseKindergarten(String licenseKindergarten) {
		this.licenseKindergarten = licenseKindergarten;
	}
	public String getKidsNm() {
		return kidsNm;
	}
	public void setKidsNm(String kidsNm) {
		this.kidsNm = kidsNm;
	}
	@Override
	public String toString() {
		return "AttendanceAndKids [kidsCd=" + kidsCd + ", kidsAttendanceDay=" + kidsAttendanceDay + ", kidsAttendance="
				+ kidsAttendance + ", kidsComeHome=" + kidsComeHome + ", kidsRestLateType=" + kidsRestLateType
				+ ", kidsReason=" + kidsReason + ", licenseKindergarten=" + licenseKindergarten + ", kidsNm=" + kidsNm
				+ "]";
	}
}
