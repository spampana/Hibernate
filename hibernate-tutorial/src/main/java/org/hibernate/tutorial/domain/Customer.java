package org.hibernate.tutorial.domain;

public class Customer {
	
private int transactionId;
private String customerName;
private String customerEmail;
private String customerAddress;
private Transaction transaction;


public Customer() {
	super();
}
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
public Transaction getTransaction() {
	return transaction;
}
public void setTransaction(Transaction transaction) {
	this.transaction = transaction;
}
public String toString(){
	return "trasactionId: "+transactionId+" ,customerName: "+customerName +" ,customerEmail: "+customerEmail ;
	
}


}
