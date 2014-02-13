package org.hibernate.tutorial.domain;

/* With XML*/
public class Person3 {
	
	  	private Long personId;
	    private String firstname;
	    private String lastname;
	    
	    public Person3(){}
	    
	    public Person3(String firstname, String lastname) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
		}
	    
	    public Person3(Long personId, String firstname, String lastname) {
			super();
			this.personId = personId;
			this.firstname = firstname;
			this.lastname = lastname;
		}
		public Long getPersonId() {
			return personId;
		}
		public void setPersonId(Long personId) {
			this.personId = personId;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
	    
}
/* 
with Annotations

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
 
 
@Entity
@Table(name = "PERSON3")
@Inheritance(strategy=InheritanceType.JOINED)
public class Person3 {
 
    @Id
    @GeneratedValue
    @Column(name = "PERSON_ID")
    private Long personId;
     
    @Column(name = "FIRSTNAME")
    private String firstname;
     
    @Column(name = "LASTNAME")
    private String lastname;
     
    public Person3() {
     
    }
    public Person3(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
 
    // Getter and Setter methods,
}

@Inheritance – 
Defines the inheritance strategy to be used for an entity class hierarchy. 
It is specified on the entity class that is the root of the entity class hierarchy.

@InheritanceType – 
Defines inheritance strategy options. JOINED is a strategy in which fields that are specific to a subclass 
are mapped to a separate table than the fields that are common to the parent class, 
and a join is performed to instantiate the subclass. 
Thus fields of Employee (joining_date, department) and Owner (stocks etc) are mapped to their respective tables.

 */

