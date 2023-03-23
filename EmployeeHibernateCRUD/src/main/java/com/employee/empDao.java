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
	
	public static  int empSave(Emp emp) {
	int status=0;
	
		Session session = empDao.sf().openSession();
		Transaction tx = session.beginTransaction();
		
		status=(int) session.save(emp);
		tx.commit();
		session.close();
		return status;
	}
	
	public static void empDelete(Emp emp) {
		Session session = empDao.sf().openSession();
		Transaction tx = session.beginTransaction();
		try {
		 session.delete(emp);
		 tx.commit();
		}
		catch(Exception e) {
			if(tx != null) {
				tx.rollback();
			}
		}
		finally {
			 session.close();
		}		 session.close();
	}
	
	public static Emp viewEmpById(int id) {
		Emp emp;
		Session session = empDao.sf().openSession();
		Transaction tx = session.beginTransaction();
		try {
		
		emp=session.get(Emp.class,id);
		tx.commit();
		return emp;

		}
		catch(Exception e) {
			if(tx != null) {
				tx.rollback();
			}
			return null;
		}	
		
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
	public static boolean loginEmp(int id,String password) {
		Emp e=new Emp();
		e=empDao.viewEmpById(id);
		int r_id=e.getId();
		String r_password=e.getPassword();
		if(id==r_id && password.equals(r_password)) {
			return true;
		}
		
		else {
		return false;
		}
	}
	

}
