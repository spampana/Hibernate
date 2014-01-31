package org.hibernate.tutorial.examples;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.tutorial.domain.Certificate;
import org.hibernate.tutorial.domain.Student;
import org.hibernate.tutorial.util.HibernateUtil;

public class One2ManySave {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionfactory().getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Student stu= new Student();
			stu.setFirstName("Satya");
			stu.setLastName("pampana");
			stu.setSalary(20000);
			
			HashSet set1 = new HashSet();
			set1.add(new Certificate("Tenth"));
			set1.add(new Certificate("Inter"));
			set1.add(new Certificate("B.tech"));
			
			stu.setCertificates(set1);
			
			// to save Object into database
				
			session.save(stu);
			tx.commit();

			
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();

		}

	}

}

	

