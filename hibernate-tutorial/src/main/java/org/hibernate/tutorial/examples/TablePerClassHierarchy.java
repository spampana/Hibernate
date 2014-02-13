package org.hibernate.tutorial.examples;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.tutorial.domain.Employee2;
import org.hibernate.tutorial.domain.Owner2;
import org.hibernate.tutorial.domain.Person2;
import org.hibernate.tutorial.util.HibernateUtil;

public class TablePerClassHierarchy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSessionfactory().getCurrentSession();
        session.beginTransaction();
 
         
        Person2 person = new Person2("Steve", "Balmer");
        person.setPersonId(1L);
        session.save(person);
 
        Employee2 employee = new Employee2("James", "Gosling", "Marketing", new Date());
        employee.setPersonId(2L);
        session.save(employee);
 
        Owner2 owner = new Owner2("Bill", "Gates", 300L, 20L);
        owner.setPersonId(3L);
        session.save(owner);
 
         
        session.getTransaction().commit();

	}

}
