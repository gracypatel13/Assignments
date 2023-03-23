<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    body {
        max-width: 300px;
        margin: 0 auto;
    }
    
</style>
<title>Update Employee</title>
</head>
<body>
<%Emp emp=new Emp();
int id=Integer.parseInt(request.getParameter("id"));
emp=empDao.viewEmpById(id);
int i=emp.getId();
String name=emp.getName();
String email=emp.getEmail();
String password=emp.getPassword();
String city=emp.getCity();


%>

<h3>Enter Data you want to update</h3>
<form action="Services?action=updateEmp" method="post">
<div class="form-group" >
    <label >Id</label>
    <input type="text" class="form-control" name="id" value="<%=i %>" readonly >
    
  </div>
<div class="form-group" >
    <label for="exampleInputEmail1">Name</label>
    <input type="text" class="form-control" name="name1" value="<%=name%>">
    
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" name="email1" aria-describedby="emailHelp" value="<%=email%>">
    
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" name="password1" value="<%=password%>">
  </div>
  <div class="form-group">
  <label for="exampleInputPassword1">City</label><br>
    <select  name="city1" style="width:300px">
    <option>Valsad</option>
<option>Vapi</option>
<option>Daman</option>
<option>Surat</option>

</select>
</div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>

</body>
</html>