package com.pacsun.main;

import org.hibernate.Session;

import com.pacsun.domain.Stock;
import com.pacsun.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + DB2SQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        Stock stock = new Stock();
        
        stock.setStockCode("4715");
        stock.setStockName("GENM");
        
        session.save(stock);
        
        session.getTransaction().commit();
        
        
    }
}
