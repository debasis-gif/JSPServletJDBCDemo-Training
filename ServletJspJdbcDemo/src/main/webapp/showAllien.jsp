<%@page import="com.pcsglobal.web.model.Allien"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show the records</title>
</head>
<body bgcolor=cyan>
	
	<%
		// Allien a1 = (Allien)request.getAttribute("alien");  // using request object of RequestDispatcher 
	
		Allien a1 = (Allien)session.getAttribute("alien");   // using session object of sendRedirect
		
		out.println(a1);
	%>
</body>
</html>