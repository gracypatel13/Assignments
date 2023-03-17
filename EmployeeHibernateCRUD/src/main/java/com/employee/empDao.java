package com.employee;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class empDao {

	public static SessionFactory sf() {
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
				SessionFactory factory = cfg.buildSessionFactory();
		
		return factory;
	}

	
	
	
	

	public static  void empSave(Emp emp) {
	
		Session session = empDao.sf().openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(emp);
		tx.commit();
		session.close();
		

		
	}
	
	public static void empDelete(Emp emp) {
		Session session = empDao.sf().openSession();
		Transaction tx = session.beginTransaction();
		 session.delete(emp);
		 tx.commit();
		 session.close();
	}
	
	public static Emp viewEmpById(int id) {
		Emp emp;
		Session session = empDao.sf().openSession();
		Transaction tx = session.beginTransaction();
		emp=session.get(Emp.class,id);
		tx.commit();
		 session.close();
		 
		 
		 System.out.println("Gracy");
		return emp;
		
		
		
		
		
	}
	public static void updateEmp(Emp emp) {
		
		Session session =null;
		Transaction tx = null;
		try {
		session =empDao.sf().openSession();
		 tx = session.beginTransaction();
		 session.update(emp);
			tx.commit();
		
		}
		catch(Exception e) {
			if(tx != null) {
				tx.rollback();
			}
		}
		finally {
			 session.close();
		}

	}
	
	public static List<Emp> viewAllEmp() {
		Session session =null;
		Transaction tx = null;
		List<Emp> emp=new ArrayList<>();
		try {
		session =empDao.sf().openSession();
		 tx = session.beginTransaction();
		 emp=session.createQuery("from Emp").getResultList();
			tx.commit();
		
		}
		catch(Exception e) {
			if(tx != null) {
				tx.rollback();
			}
		}
		finally {
			 session.close();
		}
		return emp;
	}
	

}
