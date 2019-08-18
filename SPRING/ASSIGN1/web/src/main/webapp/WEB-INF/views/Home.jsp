<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" >
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="jumbotron">
	
	<h1>A STUDENTS DETAIL</h1>
</div>

<a href="addStudent"><button>Add Student</button></a>

<form class="form" action="showStudentInfo">
	<input type = "text" name="id" />
	<input type="submit" value="show details"/>
</form>	




<form action="searchStudent">
	<input type = "text" name="id" />
	<input type="submit" value="Search for update"/>
</form>	


<form action="deleteStudent">
	<input type = "text" name="id" />
	<input type="submit" value="del"/>
</form>	


</body>
</html>