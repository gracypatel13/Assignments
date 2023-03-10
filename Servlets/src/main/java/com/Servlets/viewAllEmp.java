package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/viewAllEmp")
public class viewAllEmp extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		List<Emp> empList=new ArrayList<>();
		empList=EmpDao.viewAllEmp();
		
		out.print("<h1><b>Employee List</b></h1>");
		
		
		
		out.print("<table border=1><tr><td>Id</td><td>Name</td><td>Email</td><td>Password</td></tr>");
		for(Emp e:empList) {
			out.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getEmail()+"</td><td>"+e.getPassword()+"</td></tr>");
			
		}
	}
	
	

}
