package org.hibernate.tutorial.examples;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.tutorial.domain.Employee1;
import org.hibernate.tutorial.domain.Owner1;
import org.hibernate.tutorial.domain.Person1;
import org.hibernate.tutorial.util.HibernateUtil;

public class TablePerConcreteClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionfactory().getCurrentSession();
        session.beginTransaction();
 
         
        Person1 person = new Person1("Steve", "Balmer");
        person.setPersonId(1L);
        session.save(person);
 
        Employee1 employee = new Employee1("James", "Gosling", "Marketing", new Date());
        employee.setPersonId(2L);
        session.save(employee);
 
        Owner1 owner = new Owner1("Bill", "Gates", 300L, 20L);
        owner.setPersonId(3L);
        session.save(owner);
 
         
        session.getTransaction().commit();
      
 

	}

}
