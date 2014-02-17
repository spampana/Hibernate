package org.hibernate.tutorial.examples;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.tutorial.util.HibernateUtil;
import org.hibernate.tutorial.domain.Student3;

public class NamedQueryExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.getSessionfactory().getCurrentSession();
		//Session s1 = HibernateUtil.getSessionfactory1().getCurrentSession();
		try {
			Transaction tx= s.beginTransaction();
			
			
			
			
			//Calling HQL Query from Pojo Class
			Query q4 = s.getNamedQuery("findStudentByID2");
			q4.setInteger("studentId", 1); // set parameters like usual
			printOwners(q4);
			//Calling SQL from Pojo Class
			Query q5 = s.getNamedQuery("findStudentByID3");
			q5.setInteger("studentId", 1); // set parameters like usual
			printOwners(q5);
	
			//Calling HQL Query from hbm file
			Query q2 = s.getNamedQuery("findStudentByID1");
			q2.setInteger("studentId", 1); // set parameters like usual
			printOwners(q2);
			//Calling SQL from hbm file
			Query q3 = s.getNamedQuery("findStudentByID");
			q3.setInteger("studentId", 1); // set parameters like usual
			printOwners(q3);
			
			tx.commit();
			
			

		
			
				
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
