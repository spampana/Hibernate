package org.hibernate.tutorial.domain;

/*With XML*/
public class Owner3 extends Person3{


	private Long stocks;
    private Long partnershipStake;
    
	public Owner3(){}
    
    public Owner3(String firstname, String lastname, Long stocks, Long partnershipStake) {
        
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

 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
 
@Entity
@Table(name="OWNER3")
@PrimaryKeyJoinColumn(name="PERSON_ID")
public class Owner3 extends Person3 {
 
    @Column(name="stocks")
    private Long stocks;
     
    @Column(name="partnership_stake")
    private Long partnershipStake;
 
    public Owner3() {
    }
     
    public Owner3(String firstname, String lastname, Long stocks, Long partnershipStake) {
         
        super(firstname, lastname);
         
        this.stocks = stocks;
        this.partnershipStake = partnershipStake;
    }
 
    // Getter and Setter methods,
}

*/

/*
Both Employee and Owner classes are child of Person class. Thus while specifying the mappings, 
we used @PrimaryKeyJoinColumn to map it to parent table.

@PrimaryKeyJoinColumn – This annotation specifies a primary key column that is used as a foreign key to join to another table.

It is used to join the primary table of an entity subclass in the JOINED mapping strategy to the primary table of its superclass; it is used within a SecondaryTable annotation to join a secondary table to a primary table; and it may be used in a OneToOne mapping in which the primary key of the referencing entity is used as a foreign key to the referenced entity.

If no PrimaryKeyJoinColumn annotation is specified for a subclass in the JOINED mapping strategy, the foreign key columns are assumed to have the same names as the primary key columns of the primary table of the superclass

 */