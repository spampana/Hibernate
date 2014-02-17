package org.hibernate.tutorial.examples;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.tutorial.domain.Employee3;
import org.hibernate.tutorial.domain.Owner3;
import org.hibernate.tutorial.domain.Person3;
import org.hibernate.tutorial.util.HibernateUtil;

public class TablePerSubClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSessionfactory().getCurrentSession();
        session.beginTransaction();
 
         
        Person3 person = new Person3("Steve", "Balmer");
        person.setPersonId(1L);
        session.save(person);
 
        Employee3 employee = new Employee3("James", "Gosling", "Marketing", new Date());
        employee.setPersonId(2L);
        session.save(employee);
 
        Owner3 owner = new Owner3("Bill", "Gates", 300L, 20L);
        owner.setPersonId(3L);
        session.save(owner);
       
 
         
        session.getTransaction().commit();
      

	}

}
