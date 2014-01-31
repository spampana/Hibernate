package org.hibernate.tutorial.examples;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.tutorial.domain.Address;
import org.hibernate.tutorial.domain.Employee;
import org.hibernate.tutorial.util.HibernateUtil;
// Many to one Example Save Example
public class Many2OneSave {
	public static void main(String[] args) {
	    Session session = HibernateUtil.getSessionfactory().getCurrentSession();
	    Transaction transaction = null;
	    try {
	      transaction = session.beginTransaction();
	      Address address = new Address("Babar Road", "Delhi", "New delhi", "110005");

	      Employee emp1 = new Employee("Shankar", address);
	      Employee emp2 = new Employee("Javed", address);
	      session.save(emp1);
	      session.save(emp2);
	      transaction.commit();
	    } catch (Exception e) {
	      transaction.rollback();
	      e.printStackTrace();
	    } finally {
	      
	    }

	  }

}
