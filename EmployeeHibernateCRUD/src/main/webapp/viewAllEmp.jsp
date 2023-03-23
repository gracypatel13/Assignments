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
    
     table {
    border-collapse: separate;
    
  }
  body {
  padding-top: 2rem;
  padding-bottom: 2rem;
}

h3 {
  margin-top: 2rem;
}

.row {
  margin-bottom: 1rem;
}
.row .row {
  margin-top: 1rem;
  margin-bottom: 0;
}
[class*="col-"] {
  padding-top: 1rem;
  padding-bottom: 1rem;
  background-color: rgba(86, 61, 124, .15);
  border: 1px solid rgba(86, 61, 124, .2);
}

hr {
  margin-top: 2rem;
  margin-bottom: 2rem;
}
  
    
</style>
<title>View all employee</title>
</head>
<body>
<% List<Emp> empList=new ArrayList<>(); 
empList=empDao.viewAllEmp();


%>


<div class="container">

      
      <h3>View All Employees</h3>
   
      <div class="row">
        <div class="col-md-3"><b>ID</b></div>
        <div class="col-md-3"><b>Name</b></div>
        <div class="col-md-3"><b>Email</b></div>
        <div class="col-md-3"><b>City </b></div>
      </div>
 <% 
 
 out.print("<div class=row>");
  for(Emp e :empList){
	out.print("<div class=col-md-3>"+e.getId()+"</div><div class=col-md-3>"+e.getName()+"</div><div class=col-md-3>"+e.getEmail()+"</div><div class=col-md-3>"+e.getCity()+"</div>");
}
 

%>
      
    </div> <!-- /container -->
</body>
</html>