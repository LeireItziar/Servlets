<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" --%>
<%-- 	pageEncoding="UTF-8"%> --%>
<!-- <!DOCTYPE html> -->
<!-- <html> -->
<!-- <head> -->
<!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> -->
<!-- <link rel="stylesheet" href="css/estilos.css"/> -->
<!-- <title>Login</title> -->
<!-- <!-- </head> --> -->
<!-- <!-- <body> --> -->

<%-- <%@ include file="includes/cabecera.jsp" %> --%>

<%-- 	<jsp:useBean id="usuario" scope="request" --%>
<%-- 		class="com.ipartek.ejemplos.leire.tipos.Usuario" /> --%>

<!-- 	<form action="login" method="post"> -->
<!-- 		<fieldset> -->
<!-- 			<label for="nombre">Nombre</label> <input id="nombre" name="nombre" -->
<%-- 			  required="required" minlength="4" value="${usuario.nombre}" /> --%>
<!-- 		</fieldset> -->
<!-- 		<fieldset> -->
<!-- 			<label for="pass">Contraseña</label> <input type="password" id="pass" -->
<!-- 				name="pass" /> -->
<!-- 		</fieldset> -->
<!-- 		<fieldset> -->
<!-- 			<input type="submit" value="Login" /> -->
<%-- 			<p class="errores">${usuario.errores}</p> --%>
<!-- 		</fieldset> -->
<!-- 	</form> -->
<%-- <%@ include file="includes/pie.jsp" %> --%>
<%@ include file="includes/cabecera.jsp" %>

	<h2>Login</h2>
	
	<jsp:useBean id="usuario" scope="request"
		class="com.ipartek.ejemplos.javierlete.tipos.Usuario" />

	<form action="login" method="post">
		<fieldset>
			<label for="nombre">Nombre</label> <input id="nombre" name="nombre"
			  required="required" minlength="4" value="${usuario.nombre}" />
		</fieldset>
		<fieldset>
			<label for="pass">Contraseña</label> <input type="password" id="pass"
				name="pass" />
		</fieldset>
		<fieldset>
			<input type="submit" value="Login" />
			<p class="errores">${usuario.errores}</p>
		</fieldset>
	</form>
<%@ include file="includes/pie.jsp" %>