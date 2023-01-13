<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>User Form</title>
</head>
<body>
	<form:form action="displayUserInfo" modelAttribute="user">
		Name : <form:input path="name" />
		<p />
		Gender : <form:radiobuttons path="gender" items="${genderMap}" />
		<p />
		Country : <form:select path="country" items="${countryMap }">
					
				  </form:select>
		<p />
		Introduction : <form:textarea path="intro" />
		<p/>
		Visited Countries : <form:checkboxes items="${visitedCountriesMap }" path="visitedCountries" />
		<p/>
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>

