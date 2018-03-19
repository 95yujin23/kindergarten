package com.cafe24.hanboa.client;

public class Client {
	private String clientCd;
	private String clientPhone;
	private String clientType;
	private String clientNm;
	private String clientManager;
	private String clientAddress;
	private String clientRegistrationDate;
	private String clientRegistrant;
	private String licenseKindergarten;
	
	
	public String getClientCd() {
		return clientCd;
	}
	public void setClientCd(String clientCd) {
		this.clientCd = clientCd;
	}
	public String getClientPhone() {
		return clientPhone;
	}
	public void setClientPhone(String clientPhone) {
		this.clientPhone = clientPhone;
	}
	public String getClientType() {
		return clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	public String getClientNm() {
		return clientNm;
	}
	public void setClientNm(String clientNm) {
		this.clientNm = clientNm;
	}
	public String getClientManager() {
		return clientManager;
	}
	public void setClientManager(String clientManager) {
		this.clientManager = clientManager;
	}
	public String getClientAddress() {
		return clientAddress;
	}
	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}
	public String getClientRegistrationDate() {
		return clientRegistrationDate;
	}
	public void setClientRegistrationDate(String clientRegistrationDate) {
		this.clientRegistrationDate = clientRegistrationDate;
	}
	public String getClientRegistrant() {
		return clientRegistrant;
	}
	public void setClientRegistrant(String clientRegistrant) {
		this.clientRegistrant = clientRegistrant;
	}
	public String getLicenseKindergarten() {
		return licenseKindergarten;
	}
	public void setLicenseKindergarten(String licenseKindergarten) {
		this.licenseKindergarten = licenseKindergarten;
	}
	
	
	@Override
	public String toString() {
		return "Client [clientCd=" + clientCd + ", clientPhone=" + clientPhone + ", clientType=" + clientType
				+ ", clientNm=" + clientNm + ", clientManager=" + clientManager + ", clientAddress=" + clientAddress
				+ ", clientRegistrationDate=" + clientRegistrationDate + ", clientRegistrant=" + clientRegistrant
				+ ", licenseKindergarten=" + licenseKindergarten + "]";
	}
	
	

}
