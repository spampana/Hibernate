package org.hibernate.tutorial.domain;

import java.util.Date;

/* With XML*/
public class Employee1 extends Person1{
	
	private Date joiningDate;
    private String departmentName;
    
	public Employee1(){}
	
	public Employee1(String firstname, String lastname, String departmentName, Date joiningDate) {
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
 
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
 
@Entity
@Table(name="EMPLOYEE1")
@AttributeOverrides({
    @AttributeOverride(name="firstname", column=@Column(name="FIRSTNAME")),
    @AttributeOverride(name="lastname", column=@Column(name="LASTNAME"))
})
public class Employee1 extends Person1 {
 
    @Column(name="joining_date")
    private Date joiningDate;
     
    @Column(name="department_name")
    private String departmentName;
 
    public Employee1() {
    }
     
    public Employee1(String firstname, String lastname, String departmentName, Date joiningDate) {
         
        super(firstname, lastname);
         
        this.departmentName = departmentName;
        this.joiningDate = joiningDate;
    }
     
    // Getter and Setter methods,
}

 */

/*
Both Employee and Owner classes are child of Person class. 
Thus while specifying the mappings, we used @AttributeOverrides to map them.

@AttributeOverrides – This annotation is used to override mappings of multiple properties or fields.

@AttributeOverride – The AttributeOverride annotation is used to override the mapping of a Basic (whether explicit or default) property or field or Id property or field.

The AttributeOverride annotation may be applied to an entity that extends a mapped superclass or
 to an embedded field or property to override a basic mapping defined by the mapped superclass or 
 embeddable class. If the AttributeOverride annotation is not specified, 
 the column is mapped the same as in the original mapping.

Thus in over case, firstname and lastname are defined in parent class Person and mapped in child class 
Employee and Owner using @AttributeOverrides annotation.

This strategy supports one-to-many associations provided that they are bidirectional. 
This strategy does not support the IDENTITY generator strategy: the id has to be shared across several tables. 
Consequently, when using this strategy, you should not use AUTO nor IDENTITY. 

 */

