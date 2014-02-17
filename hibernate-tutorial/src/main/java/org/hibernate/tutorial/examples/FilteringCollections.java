package org.hibernate.tutorial.examples;

import java.util.List;

import org.hibernate.Filter;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.tutorial.domain.Student3;
import org.hibernate.tutorial.util.HibernateUtil;

public class FilteringCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.getSessionfactory().getCurrentSession();
		//Session s1 = HibernateUtil.getSessionfactory1().getCurrentSession();
		try {
			Transaction tx= s.beginTransaction();
			
			//Enable filter
			Filter filter = s.enableFilter("studentFilter");
			filter.setParameter("studentFilterID", 1);

			
			//Calling HQL Query from Pojo Class
			Query q4 = s.getNamedQuery("findStudentByID0");
			printOwners(q4);
			tx.commit();
			
			
			//To disable filter
			//session.disableFilter("studentFilter");

					}
		finally {
		
		}
	}
	private static void printOwners(Query q) {
		List<Student3> l = q.list();
		for(Student3 emp : l) {
			System.out.println("Employee: " + emp.getStudentName());
			
		}
	
	}

}
