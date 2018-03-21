package com.cafe24.hanboa.totalResource;

public class TotalResource {
	String totalResourceCd;
	String resourceGroupNm;
	String resourceNm;
	
	public String getTotalResourceCd() {
		return totalResourceCd;
	}
	public void setTotalResourceCd(String totalResourceCd) {
		this.totalResourceCd = totalResourceCd;
	}
	public String getResourceGroupNm() {
		return resourceGroupNm;
	}
	public void setResourceGroupNm(String resourceGroupNm) {
		this.resourceGroupNm = resourceGroupNm;
	}
	public String getResourceNm() {
		return resourceNm;
	}
	public void setResourceNm(String resourceNm) {
		this.resourceNm = resourceNm;
	}
	
	@Override
	public String toString() {
		return "TotalResource [totalResourceCd=" + totalResourceCd + ", resourceGroupNm=" + resourceGroupNm
				+ ", resourceNm=" + resourceNm + "]";
	}
}
