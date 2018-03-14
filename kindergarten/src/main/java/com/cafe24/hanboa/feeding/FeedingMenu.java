package com.cafe24.hanboa.feeding;

public class FeedingMenu {
	private String feedingMenuCd;
	private String menuDate;
	private String lunchCaloryProtein;
	private String morningSnack;
	private String afternoonSnack;
	private String origin;
	private String menuManager;
	private String licenseKindergarten;
	public String getFeedingMenuCd() {
		return feedingMenuCd;
	}
	public void setFeedingMenuCd(String feedingMenuCd) {
		this.feedingMenuCd = feedingMenuCd;
	}
	public String getMenuDate() {
		return menuDate;
	}
	public void setMenuDate(String menuDate) {
		this.menuDate = menuDate;
	}
	public String getLunchCaloryProtein() {
		return lunchCaloryProtein;
	}
	public void setLunchCaloryProtein(String lunchCaloryProtein) {
		this.lunchCaloryProtein = lunchCaloryProtein;
	}
	public String getMorningSnack() {
		return morningSnack;
	}
	public void setMorningSnack(String morningSnack) {
		this.morningSnack = morningSnack;
	}
	public String getAfternoonSnack() {
		return afternoonSnack;
	}
	public void setAfternoonSnack(String afternoonSnack) {
		this.afternoonSnack = afternoonSnack;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getMenuManager() {
		return menuManager;
	}
	public void setMenuManager(String menuManager) {
		this.menuManager = menuManager;
	}
	public String getLicenseKindergarten() {
		return licenseKindergarten;
	}
	public void setLicenseKindergarten(String licenseKindergarten) {
		this.licenseKindergarten = licenseKindergarten;
	}
	
	@Override
	public String toString() {
		return "FeedingMenu [feedingMenuCd=" + feedingMenuCd + ", menuDate=" + menuDate + ", lunchCaloryProtein="
				+ lunchCaloryProtein + ", morningSnack=" + morningSnack + ", afternoonSnack=" + afternoonSnack
				+ ", origin=" + origin + ", menuManager=" + menuManager + ", licenseKindergarten=" + licenseKindergarten
				+ "]";
	}
	

}
