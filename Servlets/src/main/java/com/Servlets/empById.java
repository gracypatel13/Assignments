package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/empById")
public class empById extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.print("<form><input type=text name=id><button>Search User</button></form>");
		String id=req.getParameter("id");
		int id2=Integer.parseInt(id);
		System.out.println(id2);
		Emp emp =new Emp();
		emp=EmpDao.getEmpById(id2);
		
		out.print("<table border=1><tr><td>Name</td><td>Email</td><td>Password</td></tr>");
		out.print("<tr><td>"+emp.getName()+"</td><td>"+emp.getEmail()+"</td><td>"+emp.getPassword()+"</td></tr></table>");
		//String id=req.getParameter();
	}
	
	

}
