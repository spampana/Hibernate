package org.hibernate.tutorial.domain;

/* With XML*/
public class Person1 {
	
	
	
	  	private Long personId;
	    private String firstname;
	    private String lastname;
	    
	    public Person1(){}
	    
	    public Person1(String firstname, String lastname) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
		}
	    
	    public Person1(Long personId, String firstname, String lastname) {
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
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
 
 
@Entity
@Table(name = "PERSON1")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person {
 
    @Id
    @Column(name = "PERSON_ID")
    private Long personId;
     
    @Column(name = "FIRSTNAME")
    private String firstname;
     
    @Column(name = "LASTNAME")
    private String lastname;
     
    public Person() {
     
    }
    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    // Getter and Setter methods,
}

@Inheritance – 
Defines the inheritance strategy to be used for an entity class hierarchy. 
It is specified on the entity class that is the root of the entity class hierarchy.

@InheritanceType – 
Defines inheritance strategy options. 
TABLE_PER_CLASS is a strategy to map table per concrete class.

 */

