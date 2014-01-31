package org.hibernate.tutorial.domain;

import java.util.Set;

//According to the relationship many Employees can have the same address.
public class Student {

	private int id;
	   private String firstName; 
	   private String lastName;   
	   private int salary;
	   private Set certificates;

	   public Student() {}
	   
	   public Student(String fname, String lname, int salary) {
	      this.firstName = fname;
	      this.lastName = lname;
	      this.salary = salary;
	   }
	   public int getId() {
	      return id;
	   }
	   public void setId( int id ) {
	      this.id = id;
	   }
	   public String getFirstName() {
	      return firstName;
	   }
	   public void setFirstName( String first_name ) {
	      this.firstName = first_name;
	   }
	   public String getLastName() {
	      return lastName;
	   }
	   public void setLastName( String last_name ) {
	      this.lastName = last_name;
	   }
	   public int getSalary() {
	      return salary;
	   }
	   public void setSalary( int salary ) {
	      this.salary = salary;
	   }

	   public Set getCertificates() {
	      return certificates;
	   }
	   public void setCertificates( Set certificates ) {
	      this.certificates = certificates;
	   }	

	  

}
