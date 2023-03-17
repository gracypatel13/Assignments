<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="JSP_Pages.EmpDao" %>
    <%@ page import="JSP_Pages.Emp" %>

<%
String name=request.getParameter("name");
String email=request.getParameter("email");
String password=request.getParameter("password");
String city=request.getParameter("city");


Emp e=new Emp();
e.setName(name);
e.setEmail(email);
e.setPassword(password);
e.setCity(city);
if(!(e == null)){
int status=0;
status=EmpDao.saveEmp(e);
if(status>0){
	out.print("Successfull");
	
	request.getRequestDispatcher("Index.jsp").forward(request, response);
}
else{
	out.print("Error");
}


}



%>


