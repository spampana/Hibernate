package org.hibernate.tutorial.util;

import java.text.Annotation;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory= buildSessionFactory();
	//private static final SessionFactory sessionFactory1= buildSessionFactory1();


	/*public static SessionFactory getSessionfactory1() {
		return sessionFactory1;
	}*/

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}

	public static SessionFactory buildSessionFactory() {
		try {
			// Create the SessionFactory from hibernate.cfg.xml
			return new AnnotationConfiguration().configure().buildSessionFactory();
			}
			catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.out.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
			}
	}
	
	/*private static SessionFactory buildSessionFactory1() {
		try {
			// Create the SessionFactory from hibernate.cfg.xml
			return new AnnotationConfiguration().configure().buildSessionFactory();
			}
			catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.out.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
			}*/
	//}
	
	
}

/*
 *This class not only produces the global org.hibernate.SessionFactory reference in its static
initializer; it also hides the fact that it uses a static singleton. We might just as well have looked up
the org.hibernate.SessionFactory reference from JNDI in an application server or any other
location for that matter.

If you give the org.hibernate.SessionFactory a name in your configuration, Hibernate will try
to bind it to JNDI under that name after it has been built


You now need to configure a logging system. Hibernate uses commons logging and provides two
choices: Log4j and JDK 1.4 logging. Most developers prefer Log4j: copy log4j.properties from
the Hibernate distribution in the etc/ directory to your src directory, next to hibernate.cfg.xml.
 */
