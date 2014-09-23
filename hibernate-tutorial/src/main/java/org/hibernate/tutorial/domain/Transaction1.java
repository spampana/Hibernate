package org.hibernate.tutorial.domain;

import java.util.Date;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.tutorial.domain.Customer1;


@Entity
@Table(name="Transaction")
public class Transaction1 {
	
	public Transaction1() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="txn_id")
	private int transactionId;
	
	@Column(name="txn_date")
	private Date transactionDate;
	
	@Column(name="txn_total")
	private double transactionAmount;
	
	@OneToOne(mappedBy="txn",cascade=CascadeType.ALL)
	private Customer1 customer;
	
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public Customer1 getCustomer() {
		return customer;
	}
	public void setCustomer(Customer1 customer) {
		this.customer = customer;
	}
	
	
}
