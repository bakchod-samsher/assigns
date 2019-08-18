<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" >
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>UPDATING STUDENT</h1>


	<form:form class= "form" action="updateStudentData" method="post">

		<label>Student Id</label>
		<form:input path="studentId" disabled="true"/>

		<form:errors path="studentId" />

		<label>Student Name</label>
		<form:input path="studentName" />

		<label>Student Father's Name</label>
		<form:input path="fatherName" />


		<label>Section</label>

		<form:select path="section" items="${sectionList}" />

		<label>City name</label>
		<form:input path="address.cityName" />

		<label>Street name</label>
		<form:input path="address.StreetName" />

		<label>Pin code</label>
		<form:input path="address.pinCode" />


		<input type="submit" value="add">



	</form:form>
	<a href="Home"><button>HOME</button></a>
</body>
</html>