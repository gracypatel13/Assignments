<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="JSP_Pages.EmpDao" %>
    <%@ page import="JSP_Pages.Emp" %>
    

<%
int id=Integer.parseInt(request.getParameter("id"));
String name=request.getParameter("name");

String email=request.getParameter("email");
String password=request.getParameter("password");
String city=request.getParameter("city");


Emp e=new Emp();
e.setId(id);
e.setName(name);
e.setEmail(email);
e.setPassword(password);
e.setCity(city);

int status=EmpDao.updateEmpById(e);
if(status>0){
	out.print("<h3>Successfully Updated</h3>");
	
}
else{
	out.print("error");
}


%>