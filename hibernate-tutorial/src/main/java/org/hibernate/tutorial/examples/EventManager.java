package org.hibernate.tutorial.examples;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.tutorial.domain.Event;
import org.hibernate.tutorial.util.HibernateUtil;

public class EventManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionfactory().getCurrentSession();
		Transaction tx = null;
		try {

			// to save Object into database
			tx = session.beginTransaction();
			Event event = new Event();
			//event.setId(new Long(3));
			event.setTitle("Dance4 Program");
			event.setDate(new Date());
			session.save(event);

			// to retrive data from database

			List lt = session.createQuery("from Event").list();
			/*
			 * Here, we are using a Hibernate Query Language (HQL) query to load
			 * all existing Event objects from the database. Hibernate will
			 * generate the appropriate SQL, send it to the database and
			 * populate Event objects with the data.
			 */
			tx.commit();
			Iterator<Event> it = lt.iterator();
			while (it.hasNext()) {
				Event evn = (Event) it.next();
				System.out.println(evn.getId() + "--" + evn.getTitle() + "--"
						+ evn.getDate());

			}

		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();

		}

	}

}

/*
 * A org.hibernate.Session begins when the first call to getCurrentSession() is
 * made for the current thread. It is then bound by Hibernate to the current
 * thread. When the transaction ends, either through commit or rollback,
 * Hibernate automatically unbinds the org.hibernate.Session from the thread and
 * closes it for you. If you call getCurrentSession() again, you get a new
 * org.hibernate.Session and can start a new unit of work.
 * 
 * Hibernate offers three methods of current session tracking. The "thread"
 * based method is not intended for production use; it is merely useful for
 * prototyping and tutorials such as this one
 */