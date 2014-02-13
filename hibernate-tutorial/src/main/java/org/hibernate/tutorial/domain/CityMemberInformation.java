package org.hibernate.tutorial.domain;

import java.io.Serializable;

public class CityMemberInformation implements Serializable {
	
	private CityMemberInformationId cityMemberInformationId;
    private String memberId;
    private String code;
    private Integer noOfActiveYears;
	public CityMemberInformationId getCityMemberInformationId() {
		return cityMemberInformationId;
	}
	public void setCityMemberInformationId(
			CityMemberInformationId cityMemberInformationId) {
		this.cityMemberInformationId = cityMemberInformationId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getNoOfActiveYears() {
		return noOfActiveYears;
	}
	public void setNoOfActiveYears(Integer noOfActiveYears) {
		this.noOfActiveYears = noOfActiveYears;
	}
    
    
}
