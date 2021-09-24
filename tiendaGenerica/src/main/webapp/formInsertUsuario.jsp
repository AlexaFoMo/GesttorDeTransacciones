<%@page import="Controlador.ConexionBD"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Insert User</title>
</head>
<body>



	<form action="servletUser" method="POST">
		<input type="text" name="cedulaUser" placeholder="Cedula de Usuario">
		<input type="text" name="nameUser" placeholder="Nombre de Usuario">
		<input type="email" name="email_usuario" placeholder="E-mail Usuario">
		<input type="password" name="passwordUser" placeholder="Contrasena">
		<input type="text" name="user" placeholder="Usuario">
		<input type="submit" name="buttonInsert" value="Insertar">
		<input type="submit" name="buttonConsult" value="Consultar">
		<input type="submit" name="buttonUpdate" value="Actualizar">
		<input type="submit" name="buttonDelete" value="Eliminar">
	
	</form>
	
<%
ConexionBD co=new ConexionBD();
co.conexionbd();
%>	
</body>
</html>