<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
	String username = (String)session.getAttribute("username");
%>

<h2>Welcome <%= username %></h2>

<a href="Home.jsp">Home</a> &nbsp;&nbsp;
<a href="About.jsp">About</a>&nbsp;&nbsp;
<a href="Logout">Logout</a>
</body>
</html>