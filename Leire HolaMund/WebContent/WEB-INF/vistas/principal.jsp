<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" --%>
<%--     pageEncoding="UTF-8"%> --%>
<!-- <!DOCTYPE html> -->
<!-- <html> -->
<!-- <head> -->
<!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> -->
<!-- <title>Principal</title> -->
<!-- </head> -->
<!-- <body> -->
<!-- 	<h1>Principal</h1> -->
<%-- 	<jsp:useBean id="usuario" scope="session" class="com.ipartek.ejemplos.leire.tipos.Usuario" /> --%>
<%-- 	<h2>Bienvenido ${usuario.nombre}</h2> --%>
<!-- </body> -->
<!-- </html> -->
<%@ include file="includes/cabecera.jsp" %>

	<h1>Principal</h1>
	<jsp:useBean id="usuario" scope="session" 
		class="com.ipartek.ejemplos.leire.tipos.Usuario" />
	<h2>Bienvenido ${usuario.nombre} <a href="login?opcion=logout">Logout</a></h2>
	<h3><%= new java.util.Date() %></h3>

<%@ include file="includes/pie.jsp" %>