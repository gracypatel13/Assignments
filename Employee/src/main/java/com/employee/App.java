package com.employee;

import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//       Configuration cfg=new Configuration();
//       cfg.configure("hibernate.cfg.xml");
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
       
       
       SessionFactory factory = cfg.buildSessionFactory();
       
       Employee st=new Employee();
       st.setId(101);
       st.setName("jitendra");
         Session session = factory.openSession();
         Transaction tx = session.beginTransaction();
        
         session.save(st);
         tx.commit();
         session.close();
    }
}
