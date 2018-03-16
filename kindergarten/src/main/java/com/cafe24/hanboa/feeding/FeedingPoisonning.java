package com.cafe24.hanboa.feeding;

public class FeedingPoisonning {
	private String foodPoisonningGenerationCd;
	private String feedingMonthlyCd;
	private String fepoGenerationDate;
	private int fopoWholeKidsCount;
	private int fopoGeneratedKidsCount;
	private String fopoFoodPoisonningKids;
	private String fopoProcessingResult;
	private String fopoRegistrationDate;
	private String registrant;
	private String licenseKindergarten;
	
	
	public String getFoodPoisonningGenerationCd() {
		return foodPoisonningGenerationCd;
	}
	public void setFoodPoisonningGenerationCd(String foodPoisonningGenerationCd) {
		this.foodPoisonningGenerationCd = foodPoisonningGenerationCd;
	}
	public String getFeedingMonthlyCd() {
		return feedingMonthlyCd;
	}
	public void setFeedingMonthlyCd(String feedingMonthlyCd) {
		this.feedingMonthlyCd = feedingMonthlyCd;
	}
	public String getFepoGenerationDate() {
		return fepoGenerationDate;
	}
	public void setFepoGenerationDate(String fepoGenerationDate) {
		this.fepoGenerationDate = fepoGenerationDate;
	}
	public int getFopoWholeKidsCount() {
		return fopoWholeKidsCount;
	}
	public void setFopoWholeKidsCount(int fopoWholeKidsCount) {
		this.fopoWholeKidsCount = fopoWholeKidsCount;
	}
	public int getFopoGeneratedKidsCount() {
		return fopoGeneratedKidsCount;
	}
	public void setFopoGeneratedKidsCount(int fopoGeneratedKidsCount) {
		this.fopoGeneratedKidsCount = fopoGeneratedKidsCount;
	}
	public String getFopoFoodPoisonningKids() {
		return fopoFoodPoisonningKids;
	}
	public void setFopoFoodPoisonningKids(String fopoFoodPoisonningKids) {
		this.fopoFoodPoisonningKids = fopoFoodPoisonningKids;
	}
	public String getFopoProcessingResult() {
		return fopoProcessingResult;
	}
	public void setFopoProcessingResult(String fopoProcessingResult) {
		this.fopoProcessingResult = fopoProcessingResult;
	}
	public String getFopoRegistrationDate() {
		return fopoRegistrationDate;
	}
	public void setFopoRegistrationDate(String fopoRegistrationDate) {
		this.fopoRegistrationDate = fopoRegistrationDate;
	}
	public String getRegistrant() {
		return registrant;
	}
	public void setRegistrant(String registrant) {
		this.registrant = registrant;
	}
	public String getLicenseKindergarten() {
		return licenseKindergarten;
	}
	public void setLicenseKindergarten(String licenseKindergarten) {
		this.licenseKindergarten = licenseKindergarten;
	}
	@Override
	public String toString() {
		return "FeedingPoisonning [foodPoisonningGenerationCd=" + foodPoisonningGenerationCd + ", feedingMonthlyCd="
				+ feedingMonthlyCd + ", fepoGenerationDate=" + fepoGenerationDate + ", fopoWholeKidsCount="
				+ fopoWholeKidsCount + ", fopoGeneratedKidsCount=" + fopoGeneratedKidsCount
				+ ", fopoFoodPoisonningKids=" + fopoFoodPoisonningKids + ", fopoProcessingResult="
				+ fopoProcessingResult + ", fopoRegistrationDate=" + fopoRegistrationDate + ", registrant=" + registrant
				+ ", licenseKindergarten=" + licenseKindergarten + "]";
	}
	
	
	

}
