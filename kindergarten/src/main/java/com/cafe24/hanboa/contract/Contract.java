package com.cafe24.hanboa.contract;

public class Contract {
	private String contractCd;
	private String contractStartDate;
	private String contractEndDate;
	private String clientCd;
	private int contractAmount;
	private String contractContents;
	private String contractType;
	private String contractRegistrationDate;
	private String contractRegistrant;
	private String licenseKindergarten;
	
	
	public String getContractCd() {
		return contractCd;
	}
	public void setContractCd(String contractCd) {
		this.contractCd = contractCd;
	}
	public String getContractStartDate() {
		return contractStartDate;
	}
	public void setContractStartDate(String contractStartDate) {
		this.contractStartDate = contractStartDate;
	}
	public String getContractEndDate() {
		return contractEndDate;
	}
	public void setContractEndDate(String contractEndDate) {
		this.contractEndDate = contractEndDate;
	}
	public String getClientCd() {
		return clientCd;
	}
	public void setClientCd(String clientCd) {
		this.clientCd = clientCd;
	}
	public int getContractAmount() {
		return contractAmount;
	}
	public void setContractAmount(int contractAmount) {
		this.contractAmount = contractAmount;
	}
	public String getContractContents() {
		return contractContents;
	}
	public void setContractContents(String contractContents) {
		this.contractContents = contractContents;
	}
	public String getContractType() {
		return contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	public String getContractRegistrationDate() {
		return contractRegistrationDate;
	}
	public void setContractRegistrationDate(String contractRegistrationDate) {
		this.contractRegistrationDate = contractRegistrationDate;
	}
	public String getContractRegistrant() {
		return contractRegistrant;
	}
	public void setContractRegistrant(String contractRegistrant) {
		this.contractRegistrant = contractRegistrant;
	}
	public String getLicenseKindergarten() {
		return licenseKindergarten;
	}
	public void setLicenseKindergarten(String licenseKindergarten) {
		this.licenseKindergarten = licenseKindergarten;
	}
	
	@Override
	public String toString() {
		return "Contract [contractCd=" + contractCd + ", contractStartDate=" + contractStartDate + ", contractEndDate="
				+ contractEndDate + ", clientCd=" + clientCd + ", contractAmount=" + contractAmount
				+ ", contractContents=" + contractContents + ", contractType=" + contractType
				+ ", contractRegistrationDate=" + contractRegistrationDate + ", contractRegistrant="
				+ contractRegistrant + ", licenseKindergarten=" + licenseKindergarten + "]";
	}
	
	
	
	
	
	

}
