<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    form {
        max-width: 300px;
        margin: 0 auto;
    }
    
</style>
<title>Delete Employee</title>
</head>
<body>
<form action="Services?action=delete" method="post">
<div class="form-group" >
    <label for="exampleInputEmail1">Id</label>
    <input type="text" class="form-control" name="id" placeholder="Enter Id">
    
  </div>
   <button type="submit" class="btn btn-primary">Delete Employee</button>
</form>

</body>
</html>