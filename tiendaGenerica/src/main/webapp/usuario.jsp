<%@page import="tiendaGenerica.ConexionBD"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/styles.css" type="text/css" rel="stylesheet"/>
<title>Login page</title>
<script
      src="https://kit.fontawesome.com/ea8e6c92c7.js"
      crossorigin="anonymous"
    ></script>
</head>
<body>
	<main>
      <div class="div_imgStore">
		<div class="yourWelcome">
        <span>Bienvenidos a Isis</span>
		</div>
        <img class="div_imgStore_img" src="css/img/bigIcon_tienda.png" alt="icon"  />
      </div>
      <hr />
      <div class="icon__div2__main">
        <i class="far fa-user"></i>
      </div>

      <form class="loginAdmin__form" method="get" action="./tiendaServlet2">
        <input id="usuario" type="text" name="usuario" placeholder="Usuario" />
        <input
          id="contrasena"
          type="password"
          name="contrasena"
          placeholder="Contrasena"
        />

        <button id="login" type="submit" name="Aceptar">Login</button>
      </form>
    </main>

    <footer>
      <p>* 2021 * Alexa FoMo All Right Reserved</p>
      <div class="footer__itemFlex">
        <a href="salidas.html"><i class="fab fa-facebook-f"></i></a>
        <a href="salidas.html"><i class="fab fa-twitter"></i></a>
        <a href="salidas.html"><i class="fas fa-globe"></i></a>
        <a href="salidas.html"><i class="fab fa-google-plus-g"></i></a>
        <a href="salidas.html"><i class="fab fa-youtube"></i></a>
      </div>
    </footer>
	
<%
ConexionBD co=new ConexionBD();
co.conexionbd();
%>

</body>
</html>