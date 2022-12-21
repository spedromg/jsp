<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Web JSP with Servlet</title>
</head>
<body>
	<%@ include file="menu-top.html" %>
	
	<h1>Servlets and Annotations</h1>
	<a href="login">login</a>
	<a href="compactar">compactar</a>
	<a href="initdestroy">init-destroy</a>
	<a href="contador">contador de requisições</a>
	<a href="./redireciona.jsp">redireciona.jsp</a>
	
	<% 
		List<String> l = new ArrayList<String>();
		l.add("Simão");
		l.add("Pedro");
		l.add("Mendes");
		l.add("Gabriel");
	%>
	
	<h1>Lista de Nomes</h1>
	<ul>
		<% for (String a : l) { %>
		<li><%=a%></li>
		<%} %>
	</ul>
	
	<h2>Área do Quadrado</h2>
	<%! int i = 10; %>
	<%= i * i %>
</body>
</html>