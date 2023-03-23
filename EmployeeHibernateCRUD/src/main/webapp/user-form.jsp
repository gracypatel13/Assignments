<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="com.employee.Emp" %>
    <%@ page import="com.employee.empDao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
  body{background-color:#FFEBEE}.card{width:400px;background-color:#fff;border:none;border-radius: 12px}label.radio{cursor: pointer;width: 100%}label.radio input{position: absolute;top: 0;left: 0;visibility: hidden;pointer-events: none}label.radio span{padding: 7px 14px;border: 2px solid #eee;display: inline-block;color: #039be5;border-radius: 10px;width: 100%;height: 48px;line-height: 27px}label.radio input:checked+span{border-color: #039BE5;background-color: #81D4FA;color: #fff;border-radius: 9px;height: 48px;line-height: 27px}.form-control{margin-top: 10px;height: 48px;border: 2px solid #eee;border-radius: 10px}.form-control:focus{box-shadow: none;border: 2px solid #039BE5}.agree-text{font-size: 12px}.terms{font-size: 12px;text-decoration: none;color: #039BE5}.confirm-button{height: 50px;border-radius: 10px}
    body {
        max-width: 300px;
        margin: 0 auto;
    }
   
    
</style>
<title>User-Form</title>
</head>
<body>
<body>
<br>
 <div class="card px-1 py-4">
<a class="btn btn-primary" href="saveEmp.jsp" role="button" >Add Employee   </a>
<br><br>
<a class="btn btn-primary" href="deleteEmp.jsp" role="button">Delete Employee </a>
<br><br>
<a class="btn btn-primary" href="viewEmpById.jsp" role="button">View an Employee</a>
<br><br>
<a class="btn btn-primary" href="viewAllEmp.jsp" role="button">View All Employee</a>
<br><br>
<a class="btn btn-primary" href="updateEmpById.jsp" role="button">Update an Employee</a>
<br><br>
</div>


<% List<Emp> empList=new ArrayList<>(); 
empList=empDao.viewAllEmp();


%>
<table class="table"> <thead class="thead-dark">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">City</th>
      <th scope="col">Delete</th>
      <th scope="col">Edit</th>
      
    </tr>
  </thead>
  
  <% 
  for(Emp e :empList){
	out.print("<tbody><tr><th scope=row><a href=Services?action=viewEmp&id="+e.getId()+">"+e.getId()+"</th><td><a href=Services?action=viewEmp&id="+e.getId()+">"+e.getName()+"</td><td>"+e.getEmail()+"</td><td>"+e.getCity()+"</td><td>"+"<button ><a href=Services?action=delete&id="+e.getId()+">Delete</button>"+"</td><td>"+"<button ><a href=updateEmpById.jsp?id="+e.getId()+">Edit</button></td><td></tr>");
}
 

%>
  


</body>
</html>