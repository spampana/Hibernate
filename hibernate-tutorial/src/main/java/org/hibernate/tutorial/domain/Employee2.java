package org.hibernate.tutorial.domain;

import java.util.Date;

/* With XML*/
public class Employee2 extends Person2{
	
	private Date joiningDate;
    private String departmentName;
    
	public Employee2(){}
	
	public Employee2(String firstname, String lastname, String departmentName, Date joiningDate) {
        super(firstname, lastname);
        this.departmentName = departmentName;
        this.joiningDate = joiningDate;
    }
	
	
	
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
    
}

/* 
with Annotations

import java.util.Date;
 
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
 
@Entity
@Table(name="PERSON2")
@DiscriminatorValue("E")
public class Employee2 extends Person2 {
 
    @Column(name="joining_date")
    private Date joiningDate;
     
    @Column(name="department_name")
    private String departmentName;
 
    // Constructors and Getter/Setter methods,
}
 */

