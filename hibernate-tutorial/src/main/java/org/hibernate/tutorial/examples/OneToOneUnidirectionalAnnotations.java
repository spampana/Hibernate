package org.hibernate.tutorial.examples;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.tutorial.domain.Customer1;
import org.hibernate.tutorial.domain.Transaction1;
import org.hibernate.tutorial.util.HibernateUtil;

public class OneToOneUnidirectionalAnnotations {
	
	public static void main(String[] args) {
	Transaction1 txn = buildDemoTransaction();
    
    SessionFactory sessionFactory = null;
    Session session = null;
    org.hibernate.Transaction tx = null;
    try{
    //Get Session
    sessionFactory = HibernateUtil.buildSessionFactory();
    session = sessionFactory.getCurrentSession();
    System.out.println("Session created using annotations configuration");
    //start transaction
    tx = session.beginTransaction();
    //Save the Model object
    session.save(txn);
    //Commit transaction
    tx.commit();
    System.out.println("Annotation Example. Transaction ID="+txn.getTransactionId());
     
    //Get Saved Trasaction Data
    printTransactionData(txn.getTransactionId(), sessionFactory);
    }catch(Exception e){
        System.out.println("Exception occured. "+e.getMessage());
        e.printStackTrace();
    }finally{
       
    }
}

private static void printTransactionData(int id, SessionFactory sessionFactory) {
    Session session = null;
    org.hibernate.Transaction tx = null;
    try{
        //Get Session
        sessionFactory = HibernateUtil.buildSessionFactory();
        session = sessionFactory.getCurrentSession();
        //start transaction
        tx = session.beginTransaction();
        //Save the Model object
        Transaction1 txn = (Transaction1) session.get(Transaction1.class, id);
        //Commit transaction
        tx.commit();
        System.out.println("Annotation Example. Transaction1 Details=\n"+txn);
         
        }catch(Exception e){
            System.out.println("Exception occured. "+e.getMessage());
            e.printStackTrace();
        }
}

private static Transaction1 buildDemoTransaction() {
    Transaction1 txn = new Transaction1();
    txn.setTransactionDate(new Date());
    txn.setTransactionAmount(100);
     
    Customer1 cust = new Customer1();
    cust.setCustomerAddress("San Jose, USA");
    cust.setCustomerEmail("pankaj@yahoo.com");
    cust.setCustomerName("Pankaj Kr");
     
    txn.setCustomer(cust);
     
    cust.setTxn(txn);
    return txn;
}
}
