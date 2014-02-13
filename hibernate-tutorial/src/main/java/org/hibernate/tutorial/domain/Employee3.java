package org.hibernate.tutorial.domain;

import java.util.Date;

/* With XML*/
public class Employee3 extends Person3{
	
	private Date joiningDate;
    private String departmentName;
    
	public Employee3(){}
	
	public Employee3(String firstname, String lastname, String departmentName, Date joiningDate) {
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
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
 
@Entity
@Table(name="EMPLOYEE3")
@PrimaryKeyJoinColumn(name="PERSON_ID")
public class Employee3 extends Person3{
 
    @Column(name="joining_date")
    private Date joiningDate;
     
    @Column(name="department_name")
    private String departmentName;
 
    public Employee3() {
    }
     
    public Employee3(String firstname, String lastname, String departmentName, Date joiningDate) {
         
        super(firstname, lastname);
         
        this.departmentName = departmentName;
        this.joiningDate = joiningDate;
    }
 
    // Getter and Setter methods,
}
 */


/*
Both Employee and Owner classes are child of Person class. Thus while specifying the mappings, we used @PrimaryKeyJoinColumn to map it to parent table.

@PrimaryKeyJoinColumn – This annotation specifies a primary key column that is used as a foreign key to join to another table.

It is used to join the primary table of an entity subclass in the JOINED mapping strategy to the primary table of its superclass; it is used within a SecondaryTable annotation to join a secondary table to a primary table; and it may be used in a OneToOne mapping in which the primary key of the referencing entity is used as a foreign key to the referenced entity.

If no PrimaryKeyJoinColumn annotation is specified for a subclass in the JOINED mapping strategy, the foreign key columns are assumed to have the same names as the primary key columns of the primary table of the superclass

 */

