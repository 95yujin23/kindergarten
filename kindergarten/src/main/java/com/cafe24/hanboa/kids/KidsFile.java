package com.cafe24.hanboa.kids;

public class KidsFile {
	private String kidsFileCd;
	private String kidsCd;
	private String kidsFileNm;
	private String kidsFileExt;
	private long kidsFileSize;
	
	public String getKidsFileCd() {
		return kidsFileCd;
	}
	public void setKidsFileCd(String kidsFileCd) {
		this.kidsFileCd = kidsFileCd;
	}
	public String getKidsCd() {
		return kidsCd;
	}
	public void setKidsCd(String kidsCd) {
		this.kidsCd = kidsCd;
	}
	public String getKidsFileNm() {
		return kidsFileNm;
	}
	public void setKidsFileNm(String kidsFileNm) {
		this.kidsFileNm = kidsFileNm;
	}
	public String getKidsFileExt() {
		return kidsFileExt;
	}
	public void setKidsFileExt(String kidsFileExt) {
		this.kidsFileExt = kidsFileExt;
	}
	public long getKidsFileSize() {
		return kidsFileSize;
	}
	public void setKidsFileSize(long kidsFileSize) {
		this.kidsFileSize = kidsFileSize;
	}
	
	@Override
	public String toString() {
		return "KidsFile [kidsFileCd=" + kidsFileCd + ", kidsCd=" + kidsCd + ", kidsFileNm=" + kidsFileNm
				+ ", kidsFileExt=" + kidsFileExt + ", kidsFileSize=" + kidsFileSize + "]";
	}
}
