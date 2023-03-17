<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="JSP_Pages.EmpDao" %>
    <%@ page import="JSP_Pages.Emp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String id=request.getParameter("id");
int i=Integer.parseInt(id);
out.print(id);
Emp e=new Emp();
e=EmpDao.getEmpById(i);
//out.print(e.getName());
String name=e.getName();
String email=e.getEmail();
String password=e.getPassword();
String city=e.getCity();



%>
<table border=10>
<tr><td><b>Id</b></td><td><b>Name</b></td><td><b>Email</b></td><td><b>City</b></td></tr>
<tr><td><%=i%></td><td><%=name%></td><td><%=email%></td><td><%=city%></td></tr>
</table>

</body>
</html>