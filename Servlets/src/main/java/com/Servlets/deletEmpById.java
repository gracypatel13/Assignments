package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/deletEmpById")
public class deletEmpById extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");  
	       PrintWriter out=resp.getWriter();
	       out.print("<form><input type=text name=id><button>Delete User</button></form>");
	       int id=Integer.parseInt(req.getParameter("id"));
	       int status=EmpDao.deleteEmpById(id);
	       if(status>0) {
	    	   out.print("<h5>Deleted Successfully</h5>");
	       }
	       else {
	    	   out.print("<h5>Error</h5>");
	       }
	}
	
	

}
