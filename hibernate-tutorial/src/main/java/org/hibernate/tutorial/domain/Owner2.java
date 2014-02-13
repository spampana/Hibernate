package org.hibernate.tutorial.domain;

/*With XML*/
public class Owner2 extends Person2{


	private Long stocks;
    private Long partnershipStake;
    
	public Owner2(){}
    
    public Owner2(String firstname, String lastname, Long stocks, Long partnershipStake) {
        
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
 With Annotations
 
 import java.util.Date;
 
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
 
@Entity
@Table(name="PERSON2")
@DiscriminatorValue("O")
public class Owner2 extends Person2 {
 
    @Column(name="joining_date")
    private Date joiningDate;
     
    @Column(name="department_name")
    private String departmentName;
 
    // Constructors and Getter/Setter methods,
}
 */

 