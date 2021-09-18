<%@page import="tiendaGenerica.ConexionBD"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Insert Customer</title>
</head>
<body>

<form action="servletCustomer" method="POST">
		<input type="text" name="cedulaCustomer" placeholder="Cedula de Cliente">
		<input type="text" name="directionCustomer" placeholder="Direccion Cliente">
		<input type="email" name="email_customer" placeholder="E-mail Cliente">
		<input type="text" name="nameCustomer" placeholder="Nombre de Cliente">
		<input type="text" name="phoneNumberCustomer" placeholder="Telefono Cliente">
		<input type="submit" name="buttonInsert">
	
	</form>
	
<%
ConexionBD co=new ConexionBD();
co.conexionbd();
%>	

</body>
</html>