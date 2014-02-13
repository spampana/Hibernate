package org.hibernate.tutorial.domain;

/*With XML*/
public class Owner1 extends Person1{


	private Long stocks;
    private Long partnershipStake;
    
	public Owner1(){}
    
    public Owner1(String firstname, String lastname, Long stocks, Long partnershipStake) {
        
        super(firstname, lastname);
         
        this.stocks = stocks;
        this.partnershipStake = partnershipStake;
    }
	public Long getStocks() {
		return stocks;
	}
	public void setStocks(Long stocks) {
		this.stocks = stocks;
	}
	public Long getPartnershipStake() {
		return partnershipStake;
	}
	public void setPartnershipStake(Long partnershipStake) {
		this.partnershipStake = partnershipStake;
	}
    
}

/*
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
 
@Entity
@Table(name="OWNER1")
@AttributeOverrides({
    @AttributeOverride(name="firstname", column=@Column(name="FIRSTNAME")),
    @AttributeOverride(name="lastname", column=@Column(name="LASTNAME"))
})
public class Owner1 extends Person1 {
 
    @Column(name="stocks")
    private Long stocks;
     
    @Column(name="partnership_stake")
    private Long partnershipStake;
 
    public Owner() {
    }
     
    public Owner(String firstname, String lastname, Long stocks, Long partnershipStake) {
         
        super(firstname, lastname);
         
        this.stocks = stocks;
        this.partnershipStake = partnershipStake;
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