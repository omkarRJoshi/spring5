<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Name view</title>
</head>
<body>
	Todays date and time : ${todaysDate} </br>
	Hello from modelAndView ${name} </br>
	Team members : 
	<c:forEach var="member" items="${team}">
		</br> ${member}
	</c:forEach>
</body>
</html>