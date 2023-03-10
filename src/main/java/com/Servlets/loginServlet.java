package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 resp.setContentType("text/html");  
	       PrintWriter out=resp.getWriter();  
	       int id=Integer.parseInt(req.getParameter("id"));
	       String password=req.getParameter("password");  
	       
	       boolean status=EmpDao.loginEmpById(id, password);
	       
	       if(status==true) {
	    	   req.getRequestDispatcher("homepage.html").include(req, resp);
	       }
	       else {
	    	   out.print("Invalid Credentials");
	       }
	       
	}
	
	
	

}
