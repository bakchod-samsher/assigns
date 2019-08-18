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

<form:form class="form" action="showStudentInfo">

		<label>Student Id</label>
		<form:input path="studentId" disabled="true"/>

		<form:errors path="studentId" />

		<label>Student Name</label>
		<form:input path="studentName" disabled="true"/>

		<label>Student Father's Name</label>
		<form:input path="fatherName" disabled="true"/>


		<label>Section</label>

		<form:select path="section" items="${sectionList}" disabled="true"/>

		<label>City name</label>
		<form:input path="address.cityName" disabled="true"/>

		<label>Street name</label>
		<form:input path="address.StreetName" disabled="true"/>

		<label>Pin code</label>
		<form:input path="address.pinCode" disabled="true"/>


	</form:form>
	
	<a href="Home"><button>HOME</button></a>
</body>
</html>