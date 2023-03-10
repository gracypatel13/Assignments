package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/saveServlet")
public class saveServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");  
        PrintWriter out=resp.getWriter();  
          
        String name=req.getParameter("name");  
        String password=req.getParameter("password");  
        String email=req.getParameter("email");
        
        Emp e=new Emp();
        e.setName(name);
        e.setEmail(email);
        e.setPassword(password);
        
        int status = EmpDao.saveEmp(e);
        int empId=EmpDao.getEmpId();
        if(status > 0) {
            out.print("<p>Congratulations you have successfully created account .Please Sign in</p>");
            out.print("Your id is "+empId);
           req.getRequestDispatcher("loginpage.html").include(req, resp);
        } else {
            out.print("<p>Sorry we were unable to save your details</p>");
        }
    }
}

