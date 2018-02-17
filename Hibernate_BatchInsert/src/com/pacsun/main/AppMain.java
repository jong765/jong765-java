package com.pacsun.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pacsun.model.TestObject;
import com.pacsun.util.HibernateUtil;

public class AppMain {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		   
		for ( int i=0; i<100005; i++ ) {
		    TestObject testObject = new TestObject();
		    testObject.setOrderNumber("ORD" + i);
		    testObject.setCustomerNumber("92828222");
		    testObject.setReference("REF001");
		    testObject.setAmount(35.25);
		    testObject.setStatusCode("A");
		    testObject.setOrderDate(new Date());
		    session.save(testObject);
		    if ( i % 20 == 0 ) { //20, same as the JDBC batch size
		        //flush a batch of inserts and release memory:
		        session.flush();
		        session.clear();
		    }
		}
		   
		tx.commit();
	}
}
