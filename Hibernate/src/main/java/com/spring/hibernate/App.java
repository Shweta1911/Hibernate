package com.spring.hibernate;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory  factory=cfg.buildSessionFactory();
		
		Student st = new Student();
		st.setId(1);
		st.setName("nisha");
		st.setCity("kolhapur");
		System.out.println(st);
		
		Session session = factory.openSession();
		org.hibernate.Transaction tx = session.beginTransaction();	
		session.save(st);
		tx.commit();
		session.close();
		
		System.out.println("done...");
    }
}
