<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/styles.css" type="text/css" rel="stylesheet"/>
<title>Insert title here</title>
</head>
<body>
	<main>
	<img alt="" src="img/">
	<form class="loginAdmin" method="get" action="./tiendaServlet">
		<h1>Bienvenidos a la Tienda Genérica</h1>
		<div class="form__loginAdmin">
		<input id="usuario" type="text" name = "usuario" placeholder="Usuario">
		<input id="contrasena" type="password" name = "contrasena" placeholder="Contraseña">
		</div>
		<div class="form__buttonsAccCan">
		<input type="submit" name="Aceptar" value="Aceptar">
		<input type="button" name="Cancelar" value="Cancelar" onClick="location.href='../usuario.jsp'">
		</div>
	</form>
	</main>
	


</body>
</html>