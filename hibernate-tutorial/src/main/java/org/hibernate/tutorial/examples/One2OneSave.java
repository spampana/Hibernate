package org.hibernate.tutorial.examples;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.tutorial.domain.Stock;
import org.hibernate.tutorial.domain.StockDetail;
import org.hibernate.tutorial.util.HibernateUtil;

public class One2OneSave {
	public static void main(String[] args) {
		System.out.println("Hibernate one to one (XML mapping)");
		Session session = HibernateUtil.getSessionfactory().getCurrentSession();
 
		session.beginTransaction();
 
		Stock stock = new Stock();
 
		stock.setStockCode("471617");
		stock.setStockName("GENME27");
 
		StockDetail stockDetail = new StockDetail();
		stockDetail.setCompName("GENTING Malaysia");
		stockDetail.setCompDesc("Best resort in the world");
		stockDetail.setRemark("Nothing Special");
		stockDetail.setListedDate(new Date());
 
		//stock.setStockDetail(stockDetail);
		stockDetail.setStock(stock);
 		session.save(stock);
 		session.save(stockDetail);
		session.getTransaction().commit();
 
		System.out.println("Done");
	}
}
