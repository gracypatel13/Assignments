package com.employee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Services")
public class ServicesServlet extends HttpServlet{

	private empDao empdao;
	
	public void init() {
		empdao=new empDao();
	}
	

	

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String a=req.getParameter("action");
		System.out.println(a);
		
		
		
		switch(a) {
		case "save":
			String name=req.getParameter("name");
			String email=req.getParameter("email");
			String password=req.getParameter("password");
			String city=req.getParameter("city");


			Emp e=new Emp();
			e.setName(name);
			e.setEmail(email);
			e.setPassword(password);
			e.setCity(city);
			empDao.empSave(e);
		
			
			resp.sendRedirect("user-form.jsp");
			break;
		case "delete":
			int id=Integer.parseInt(req.getParameter("id"));
			Emp emp=new Emp();
			emp=empDao.viewEmpById(id);
			empDao.empDelete(emp);
			out.print("Successfully Deleted");
			
			break;
		case "viewEmp":
			int id_v=Integer.parseInt(req.getParameter("id"));
			Emp emp_v=new Emp();
			emp_v=empDao.viewEmpById(id_v);
			out.print("<table border=1><tr><td>Name</td><td>Email</td><td>Password</td><td>city</td></tr>");
			out.print("<tr><td>"+emp_v.getName()+"</td><td>"+emp_v.getEmail()+"</td><td>"+emp_v.getPassword()+"</td><td>"+emp_v.getCity()+"</td></tr></table>");
			break;
			
		case "updateEmp":
			System.out.println("in update");
			id=Integer.parseInt(req.getParameter("id"));
			 name=req.getParameter("name1");
			 email=req.getParameter("email1");
			 password=req.getParameter("password1");
			 city=req.getParameter("city1");


		    e=new Emp();
		    e.setId(id);
			e.setName(name);
			e.setEmail(email);
			e.setPassword(password);
			e.setCity(city);
			System.out.println(e.getName());
			empDao.updateEmp(e);
			break;
		case "viewAll":
			
			
		}
		System.out.println(a);
		
	}
	

	}
