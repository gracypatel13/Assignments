<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="com.employee.Emp" %>
    <%@ page import="com.employee.empDao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="ISO-8859-1">
<meta charset="utf-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
    body {
        max-width: 300px;
        margin: 0 auto;
    }
     table {
    border-collapse: separate;
    
  }
    
</style>
<title>View all employee</title>
</head>
<body>
<% List<Emp> empList=new ArrayList<>(); 
empList=empDao.viewAllEmp();


%>
<table class=" btn-primary" border=1>
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">City</th>
    </tr>
  </thead>
  
  <% 
  for(Emp e :empList){
	out.print("<tbody><tr><th scope=row>"+e.getId()+"</th><td>"+e.getName()+"</td><td>"+e.getEmail()+"</td><td>"+e.getCity()+"</td></tr>");
}
 

%>
  
    
  </tbody>
</table>
</body>
</html>