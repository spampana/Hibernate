package org.hibernate.tutorial.domain;

/* With XML*/
public class Person2 {
	
	
	
	  	private Long personId;
	    private String firstname;
	    private String lastname;
	    
	    public Person2(){}
	    
	    public Person2(String firstname, String lastname) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
		}
	    
	    public Person2(Long personId, String firstname, String lastname) {
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
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
 
 
@Entity
@Table(name = "PERSON2")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
    name="discriminator",
    discriminatorType=DiscriminatorType.STRING
)
@DiscriminatorValue(value="P")
public class Person2 {
 
    @Id
    @GeneratedValue
    @Column(name = "PERSON_ID")
    private Long personId;
     
    @Column(name = "FIRSTNAME")
    private String firstname;
     
    @Column(name = "LASTNAME")
    private String lastname;
     
    // Constructors and Getter/Setter methods,
}
 */

/*
The Person class is the root of hierarchy. Hence we have used some annotations to make it as the root.

@Inheritance – 
Defines the inheritance strategy to be used for an entity class hierarchy. 
It is specified on the entity class that is the root of the entity class hierarchy.

@DiscriminatorColumn – 
Is used to define the discriminator column for the SINGLE_TABLE and JOINED inheritance mapping strategies. 
The strategy and the discriminator column are only specified in the root of an entity class hierarchy
or sub hierarchy in which a different inheritance strategy is applied

If the @DiscriminatorColumn annotation is missing, and a discriminator column is required, 
the name of the discriminator column defaults to "DTYPE" and the discriminator type to DiscriminatorType.STRING.

@DiscriminatorValue – 
Is used to specify the value of the discriminator column for entities of the given type. 
The DiscriminatorValue annotation can only be specified on a concrete entity class. 
If the DiscriminatorValue annotation is not specified and a discriminator column is used, a provider-specific 
function will be used to generate a value representing the entity type. If the DiscriminatorType is STRING, 
the discriminator value default is the entity name.

The inheritance strategy and the discriminator column are only specified in the root of an entity class
hierarchy or subhierarchy in which a different inheritance strategy is applied. 
The discriminator value, if not defaulted, should be specified for each entity class in the hierarchy.
 */
