package org.hibernate.tutorial.domain;

import java.io.Serializable;

public class CityMemberInformationId implements Serializable {
	//Implementing serializable is a must here
    private Integer cityId;
    private Integer personId;
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
    
}
