package org.hibernate.tutorial.domain;

//According to the relationship many Employees can have the same address.
public class Employee {

	private long empid;
	  private String empname;
	  private Address empaddress;

	  public Employee() {
	  }

	  public Employee(String empname, Address empaddress) {
	    this.empname = empname;
	    this.empaddress = empaddress;
	  }

	  public long getEmpid() {
	    return empid;
	  }

	  public void setEmpid(long empid) {
	    this.empid = empid;
	  }

	  public String getEmpname() {
	    return empname;
	  }

	  public void setEmpname(String empname) {
	    this.empname = empname;
	  }

	  public Address getEmpaddress() {
	    return empaddress;
	  }

	  public void setEmpaddress(Address empaddress) {
	    this.empaddress = empaddress;
	  }

}
