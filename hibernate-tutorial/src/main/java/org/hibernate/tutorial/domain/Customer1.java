package org.hibernate.tutorial.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "Customer")
public class Customer1 {
	
public Customer1() {
		super();
	}
	@Id
	@Column(name="txn_id",nullable=false ,unique= true)
	@GeneratedValue(generator="gen")
	@GenericGenerator(name ="gen",strategy="foreign",parameters={@Parameter(name="property",value="txn")})
	private int transactionId;
	
	@Column(name="cust_name")
	private String customerName;
	
	@Column(name="cust_email")
	private String customerEmail;
	
	@Column(name="cust_address")
	private String customerAddress;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Transaction1 txn;
	
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public Transaction1 getTxn() {
		return txn;
	}
	public void setTxn(Transaction1 txn) {
		this.txn = txn;
	}

	
	
}
