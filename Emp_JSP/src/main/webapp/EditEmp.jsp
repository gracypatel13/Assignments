<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="JSP_Pages.EmpDao" %>
    <%@ page import="JSP_Pages.Emp" %>
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
<title>Edit1</title>
</head>
<body>
<h3>Update User</h3>
<% 
int i=Integer.parseInt(request.getParameter("id"));
//int i=Integer.parseInt(id);

Emp e=new Emp();
e=EmpDao.getEmpById(i);

String name=e.getName();
String email=e.getEmail();
String password=e.getPassword();
String city=e.getCity();




%>
<form action=EditEmp2.jsp>
<table class="table">
<thead class="thead-dark">
<tr><td><b>Id</b><td><input  name="id" value="<%=i%>" readonly></td></tr>
<tr><td><b>Name</b></td><td><input type="text" name="name" value="<%=name%>"></td></tr>
<tr><td><b>Email</b></td><td><input type="text" name="email" value="<%=email%>"></td></tr>
<tr><td><b>Password</b></td><td><input type="password" name="password" value="<%=password%>"></td></tr>

<tr><td><b>City</b></td><td><input type="text" name="city" value="<%=city%>"></td>
</tr>
</table>
<br>
<button type="submit">Submit</button>
<% //out.print("<button type=submit ><a href=EditEmp2.jsp?id="+i+">Update</a></button>"); %>
</form>

<br>
</form>

</body>
</html>