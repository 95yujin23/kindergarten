package com.cafe24.hanboa.attendance;

public class KidsAttendance {
	//영유아등하원 tb_kids_attendance
	
	private String attendanceCd;
	private String kidsCd;
	private String kidsAttendanceDay;
	private String kidsAttendance;
	private String kidsComeHome;
	private String kidsRestLateType;
	private String kidsReason;
	private String licenseKindergarten;
	
	public String getAttendanceCd() {
		return attendanceCd;
	}
	public void setAttendanceCd(String attendanceCd) {
		this.attendanceCd = attendanceCd;
	}
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
}
