package com.cafe24.hanboa.attendance;

import java.util.List;

public class teacherAndAttendance {
	private String theacherCd;
	private String theacherNm;
	private List<TeacherAttendance> list;
	public String getTheacherCd() {
		return theacherCd;
	}
	public void setTheacherCd(String theacherCd) {
		this.theacherCd = theacherCd;
	}
	public String getTheacherNm() {
		return theacherNm;
	}
	public void setTheacherNm(String theacherNm) {
		this.theacherNm = theacherNm;
	}
	public List<TeacherAttendance> getList() {
		return list;
	}
	public void setList(List<TeacherAttendance> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "teacherAndAttendance [theacherCd=" + theacherCd + ", theacherNm=" + theacherNm + ", list=" + list + "]";
	}
}
