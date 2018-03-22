package com.cafe24.hanboa.contract;

public class Contract {
	private String contractCd;
	private String contractStartDate;
	private String contractEndDate;
	private String clientCd;
	private int contractAmaount;
	private String contractContents;
	private String contractType;
	private String contractRegistrationDate;
	private String contractRegistant;
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
	public int getContractAmaount() {
		return contractAmaount;
	}
	public void setContractAmaount(int contractAmaount) {
		this.contractAmaount = contractAmaount;
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
	public String getContractRegistant() {
		return contractRegistant;
	}
	public void setContractRegistant(String contractRegistant) {
		this.contractRegistant = contractRegistant;
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
				+ contractEndDate + ", clientCd=" + clientCd + ", contractAmaount=" + contractAmaount
				+ ", contractContents=" + contractContents + ", contractType=" + contractType
				+ ", contractRegistrationDate=" + contractRegistrationDate + ", contractRegistant=" + contractRegistant
				+ ", licenseKindergarten=" + licenseKindergarten + "]";
	}
	
	
	

}
