package org.hibernate.tutorial.domain;

import java.util.Date;

public class Transaction {
	
private int transactionId;
private Date transactionDate;
private double transactionAmount;
private Customer customer;

public Transaction() {
}

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
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
@Override
public String toString(){
    return transactionId+", "+transactionAmount+", "+customer.getCustomerName()+", "+customer.getCustomerEmail()+", "+customer.getCustomerAddress();
}


}
