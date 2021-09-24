<%@page import="Controlador.ConexionBD"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form User</title>


<!-- Llamado a la hoja de stilos - CSS -->
<link href="css/styleFormUser.css" type="text/css" rel="stylesheet" />

<!-- Fuentes -tipo de letra CARATTERE -->
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Carattere&display=swap"
	rel="stylesheet" />
<!-- Fuentes -tipo de letra gemunu libre -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Gemunu+Libre:wght@300&display=swap" rel="stylesheet">
<!-- Llamado a iconos -->
<script src="https://kit.fontawesome.com/ea8e6c92c7.js"
	crossorigin="anonymous">
	
</script>

</head>


<body>
	<div class="body__titlePage">
		<p>Joyería Isis</p>
	</div>

	<div class="body__titlePage">
		<p>Modulo gestión de usuarios</p>
	</div>

	<!-- <img class="header__logoMarca" src="css/img/logo__.jpg" /> -->
	<div class="contenedor__formularioCompleto">
		<div class="tituloDelFormulario">
			<i class="fas fa-address-card"></i> 
			<span>Datos del Usuario</span>
		</div>
		<form action="servletUser" method="POST">

			<input type="text" name="cedulaUser" placeholder="Cédula">
			<input type="text" name="nameUser" placeholder="Nombre">
			<input type="email" name="email_usuario" placeholder="E-mail">
			<input type="text" name="user" placeholder="Usuario"> <input
				type="password" name="passwordUser" placeholder="Password">
		</form>

		<div class="form__botones">
			<input type="submit" name="buttonInsert" value="Crear Usuario">
			<input type="submit" name="buttonConsult" value="Consultar">
			<input type="submit" name="buttonUpdate" value="Actualizar">
			<input type="submit" name="buttonDelete" value="Eliminar"> <a
				class="" href="menuPrincipal.jsp">Cancelar</a>
		</div>

	</div>
	<%
	ConexionBD co = new ConexionBD();
	co.conexionbd();
	%>
</body>
</html>