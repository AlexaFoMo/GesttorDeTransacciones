<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Login</title>

<!--Llamado a la hoja de stilos - CSS-->
<link href="css/stylePageLogin.css" type="text/css" rel="stylesheet" />

<!-- Fuentes -tipo de letras -->
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Grey+Qo&display=swap"
	rel="stylesheet" />
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Carattere&display=swap"
	rel="stylesheet" />

<!-- Llamado a iconos-->
<script src="https://kit.fontawesome.com/ea8e6c92c7.js"
	crossorigin="anonymous"></script>
</head>

<!-- Inicio page Login -->
<body>

	<div class="Contenedor__tituloJoyeria">
		<p class="tituloJoyeria">Joyeria Isis</p>
	</div>


	<!-- Contenedor de todo el Login -->
	<main class="mainContenedor">

		<!-- Formulario contenedor de los "botones" -->
		<form class="mainContenedor____formularioLogin" method="post"
			action="servletPageLogin">

			<!-- Los 3 "botones" del login, 2 de escribir y 1 botón de Login -->
			<input id="usuario" type="text" name="usuario" placeholder="Usuario" />
			<input id="contrasena" type="password" name="contrasena"
				placeholder="Contrasena" />

			<button id="login" type="submit" name="Aceptar">Login</button>
		</form>

		<!-- Cierre del main contenedor -->
	</main>

	<!-- Pie de page -->
	<footer>
		<p>* 2021 * Joyeria Isis * All Right Reserved</p>

		<div class="footer__redesSociales">
			<a href="salidas.html"><i class="fab fa-facebook-f"></i></a> <a
				href="salidas.html"><i class="fab fa-twitter"></i></a> <a
				href="salidas.html"><i class="fas fa-globe"></i></a> <a
				href="salidas.html"><i class="fab fa-google-plus-g"></i></a> <a
				href="salidas.html"><i class="fab fa-youtube"></i></a>
		</div>
	</footer>
	<!-- Cierre page Login -->
</body>
</html>