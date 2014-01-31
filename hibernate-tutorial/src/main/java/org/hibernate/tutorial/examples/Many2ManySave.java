package org.hibernate.tutorial.examples;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.tutorial.domain.Course;
import org.hibernate.tutorial.domain.Student1;
import org.hibernate.tutorial.util.HibernateUtil;

public class Many2ManySave {
	
	public static void main(String[] args) {
	Session session=HibernateUtil.getSessionfactory().getCurrentSession();
	Transaction transaction = null;
	try {
		transaction = session.beginTransaction();

		Set<Course> courses = new HashSet<Course>();
		courses.add(new Course("Maths"));
		courses.add(new Course("Computer Science"));

		Student1 student1 = new Student1("Eswar", courses);
		Student1 student2 = new Student1("Joe", courses);
		session.save(student1);
		session.save(student2);
		transaction.commit();
	} catch (HibernateException e) {
		transaction.rollback();
		e.printStackTrace();
	} finally {
		//session.close();
	}
}
}
