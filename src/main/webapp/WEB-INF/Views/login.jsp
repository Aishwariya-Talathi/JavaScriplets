
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MyPage From JSP</title>
</head>
<body>
<%
Date date = new Date();
%>

<div>Current Date is <%=date%></div>
<div>My Name is ${name}</div>
<div>I successfully graduated from ${University} and earned my masters in the field of ${Major}<div>
</body>
</html>

<%//Code to depict use of scriplets%>
<%//Pass Input as http://localhost:8080/?name=Aishwariya&University=CSULB&Major=ComputerScience %>
<%//Output on browser is:%>
<%//Current Date is Wed Jun 27 23:36:44 PDT 2018%>
<%//I successfully graduated from CSULB and earned my masters in the field of ComputerScience%> 