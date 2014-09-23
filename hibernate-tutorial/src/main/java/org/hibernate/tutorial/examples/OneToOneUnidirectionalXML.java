package org.hibernate.tutorial.examples;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.tutorial.domain.Customer;
import org.hibernate.tutorial.domain.Transaction;
import org.hibernate.tutorial.util.HibernateUtil;

public class OneToOneUnidirectionalXML {

	public static void main(String[] args) {
		Transaction txn = buildDemoTransaction();
        
        SessionFactory sessionFactory = null;
        Session session = null;
        org.hibernate.Transaction tx = null;
        try{
        //Get Session
        sessionFactory = HibernateUtil.buildSessionFactory();
        session = sessionFactory.getCurrentSession();
        System.out.println("Session created");
        //start transaction
        tx = (org.hibernate.Transaction) session.beginTransaction();
        //Save the Model object
        session.save(txn);
        //Commit transaction
        tx.commit();
        System.out.println("Transaction ID="+txn.getTransactionId());
         
        //Get Saved Trasaction Data
        printTransactionData(txn.getTransactionId(), sessionFactory);
         
        }catch(Exception e){
        	tx.rollback();
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
            Transaction txn = (Transaction) session.get(Transaction.class, id);
            //Commit transaction
            tx.commit();
            System.out.println("Transaction Details=\n"+txn);
             
            }catch(Exception e){
                System.out.println("Exception occured. "+e.getMessage());
                e.printStackTrace();
            }
    }
 
    private static Transaction buildDemoTransaction() {
    	Transaction txn = new Transaction();
        txn.setTransactionDate(new Date());
        txn.setTransactionAmount(100);
         
        Customer cust = new Customer();
        cust.setCustomerAddress("Bangalore, India");
        cust.setCustomerEmail("pankaj@gmail.com");
        cust.setCustomerName("Pankaj Kumar");
         
        txn.setCustomer(cust);
        cust.setTransaction(txn);
        return txn;
    }

	}


