<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="JSP_Pages.EmpDao" %>
    <%@ page import="JSP_Pages.Emp" %>
    <%
int i=Integer.parseInt(request.getParameter("id"));
int status=EmpDao.deleteEmpById(i);
if(status>0){
request.getRequestDispatcher("Index.jsp").include(request, response);
}
else{
	out.print("Error");
}
%>