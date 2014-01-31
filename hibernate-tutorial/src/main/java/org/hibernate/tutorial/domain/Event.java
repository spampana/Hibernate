package org.hibernate.tutorial.domain;

import java.util.Date;


public class Event {
	
public Event() {}
private Long id;
private String title;
private Date date;





public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}


}
/*
 *The no-argument constructor is a requirement for all persistent classes; Hibernate has to create
objects for you, using Java Reflection. The constructor can be private, however package or public
visibility is required for runtime proxy generation and efficient data retrieval without bytecode
instrumentation.
 */
