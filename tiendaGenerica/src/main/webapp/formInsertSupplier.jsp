<%@page import="tiendaGenerica.ConexionBD"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Insert Supplier</title>
</head>
<body>

	<form action="servletInsertUser" method="POST">
		<input type="text" name="nitSupplier" placeholder="NIT proveedor">
		<input type="text" name="citySupplier" placeholder="Ciudad proveedor">
		<input type="text" name="directionSupplier" placeholder="Direccion proveedor">
		<input type="text" name="nameSupplier" placeholder="Nombre proveedor">
		<input type="text" name="phoneNumberSupplier" placeholder="Telefono provedor">
		<input type="submit" name="buttonInsert">
	
	</form>
	
<%
ConexionBD co=new ConexionBD();
co.conexionbd();
%>
	
</body>
</html>