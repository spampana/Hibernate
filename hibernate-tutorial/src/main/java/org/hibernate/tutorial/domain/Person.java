package org.hibernate.tutorial.domain;

import java.util.HashSet;
import java.util.Set;

public class Person {

	public Person(){}
	
	//Create an association between these two entities. Persons can participate in events, and events have participants
	private Set events= new HashSet();
	
	private Long id;
	private int age;
	private String firstname;
	private String lastname;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public Set getEvents() {
		return events;
	}
	public void setEvents(Set events) {
		this.events = events;
	}
	
	
	
}
/*
By adding a collection of events to the Person class, you can easily navigate to the events for a
particular person, without executing an explicit query - by calling Person#getEvents. Multi-valued
associations are represented in Hibernate by one of the Java Collection Framework contracts;
here we choose a java.util.Set because the collection will not contain duplicate elements and
the ordering is not relevant to our examples:
*/