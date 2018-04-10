package com.cafe24.hanboa.feeding;

public class FeedingMonthlyAndClientAndContract {
	private String contractCd;
	private String clientNm;
	public String getContractCd() {
		return contractCd;
	}
	public void setContractCd(String contractCd) {
		this.contractCd = contractCd;
	}
	public String getClientNm() {
		return clientNm;
	}
	public void setClientNm(String clientNm) {
		this.clientNm = clientNm;
	}
	@Override
	public String toString() {
		return "FeedingMonthlyAndClientAndContract [contractCd=" + contractCd + ", clientNm=" + clientNm + "]";
	}
	
	

}
