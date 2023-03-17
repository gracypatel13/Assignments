<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="JSP_Pages.EmpDao" %>
    <%@ page import="JSP_Pages.Emp" %>
    <%@ page import="java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
    body {
        max-width: 300px;
        margin: 0 auto;
    }
    
</style>
<title>Index</title>
</head>
<body>



<br>

<h1>Employee List</h1>
<table class="table"> <thead class="thead-dark">
<tr><td><b>Id</b></td><td><b>Name</b></td><td><b>Email</b></td><td><b>City</b></td><td><b>Edit</b></td><td><b>Delete</b></td></tr>
<%
List<Emp> empList=new ArrayList<>();
empList=EmpDao.viewAllEmp();
for(Emp e:empList) {
	out.print("<tr><td><a href=viewEmp.jsp?id="+e.getId()+">"+e.getId()+"</td><td><a href=viewEmp.jsp?id="+e.getId()+">"+e.getName()+"</td><td>"+e.getEmail()+"</td><td>"+e.getCity()+"</td><td>"+"<button ><a href=EditEmp.jsp?id="+e.getId()+">Edit</button>"+"</td><td>"+"<button ><a href=DeleteEmp.jsp?id="+e.getId()+">Delete</button>"+"</td></tr>");	
} 
%>


</table>
<form action="SaveEmp.html"><button type="submit">Add Employee</button></form>
</body>
</html>