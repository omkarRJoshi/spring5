<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Display User Info</title>

<link type="text/css" rel="stylesheet" href="files/css/style.css"/>
</head>
<body>
Name : ${userinfo.name} <p/>
Gender : ${userinfo.gender} <p/>
Country : ${userinfo.country} <p/>
Introduction : ${userinfo.intro} <p/>
VisitedCountries : 
<ul>
<c:forEach items = "${user.visitedCountries }" var = "country">
	<li>${country }</li>
</c:forEach>
</ul>
</body>
</html>