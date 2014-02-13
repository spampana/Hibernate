package org.hibernate.tutorial.examples;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.tutorial.domain.CityMemberInformation;
import org.hibernate.tutorial.domain.CityMemberInformationId;
import org.hibernate.tutorial.util.HibernateUtil;

public class CompositeIdentifiers {
public static void main(String args[]){
	Session session=HibernateUtil.getSessionfactory().getCurrentSession();

	Transaction transaction = null;
	try {
	transaction = session.beginTransaction();
	 CityMemberInformationId id = new CityMemberInformationId();
    id.setCityId(6);
    id.setPersonId(6);        
    CityMemberInformation cityMemberInformation = new CityMemberInformation();
    cityMemberInformation.setCityMemberInformationId(id);
    cityMemberInformation.setCode("MNOPQRT");
    cityMemberInformation.setMemberId("#43567890");
    cityMemberInformation.setNoOfActiveYears(21);
    session.save(cityMemberInformation);
 
    CityMemberInformationId id1 = new CityMemberInformationId();
    id1.setCityId(1);
    id1.setPersonId(1);
    CityMemberInformation city=(CityMemberInformation) session.load(CityMemberInformation.class, id1);
    System.out.println("city---"+city.getCode());
    transaction.commit();    
    
	}catch(Exception e){
		e.printStackTrace();
	}
	finally{
	
	}
}
}
