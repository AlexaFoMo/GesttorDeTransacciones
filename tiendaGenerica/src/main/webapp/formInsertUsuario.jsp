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
<link href="css/styleFormInsertUser.css" type="text/css" rel="stylesheet" />

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

<!-- <!-- Llamado enlace Jquery -->
<!-- <script type="text/javascript" src="JavaScript/jquery-3.6.0.min.js"></script>
Llamado enlace hoja JavaScrpt
<script type="text/javascript" src="JavaScript/consultar.js"></script> --> -->

</head>


<body>

	<div class="body__titlePage">
		<p>Joyería Isis</p>
	</div>

	<div class="body__subtitlePage">
		<p>Modulo gestión de usuarios</p>
	</div>

<header>
  
        <input type="checkbox" id="header__forResponsive">
        <label for="header__forResponsive">
        <img src="img/menu.png" alt=""></label>
        <div class="headerMenuNOResponsive" >
          <a class="header__menu headerMenuNoResponsive" href="formInsertUsuario.jsp" >Usuarios</a>
          <a class="header__menu headerMenuNoResponsive" href="formInsertCustomer.jsp" target="blank">Clientes</a>
          <a class="header__menu headerMenuNoResponsive" href="formInsertSupplier.jsp" target="blank">Proveedores</a>
          <a class="header__menu headerMenuNoResponsive" href="products.jsp" target="blank">Productos</a>
          <a class="header__menu headerMenuNoResponsive" href="sale.jsp" target="blank">Ventas</a>
          <a class="header__menu headerMenuNoResponsive" href="reports.jsp" target="blank">Reportes</a>>
        </div>
          <ul class="header__ul__mobile">
            <li class="menu__li__mobile"><a href="formInsertUsuario.jsp">Usuarios</a></li>
            <li class="menu__li__mobile"><a href="formInsertCustomer.jsp">Clientes</a></li>
            <li class="menu__li__mobile"><a href="formInsertSupplier.jsp">Proveedores</a></li>
            <li class="menu__li__mobile"><a href="products.jsp" >Productos</a></li>
            <li class="menu__li__mobile"><a href="sale.jsp" >Ventas</a></li>
            <li class="menu__li__mobile"><a href="reports.jsp">Reportes</a></li>
          </ul>
</header>

	<!-- <img class="header__logoMarca" src="css/img/logo__.jpg" /> -->
	<div class="contenedor__formularioCompleto">
		<div class="tituloDelFormulario">
			<i class="fas fa-address-card"></i> 
			<span>Datos del Usuario</span>
		</div>
		
		
		<form class="formularioUsuario" action="servletUser" method="POST">

			<input class="form__input" type="text" name="cedulaUser" placeholder="Cédula">
			<input class="form__input" type="text" name="nameUser" placeholder="Nombre">
			<input class="form__input" type="email" name="email_usuario" placeholder="E-mail">
			<input class="form__input" type="text" name="user" placeholder="Usuario"> 
			<input class="form__input"
				type="password" name="passwordUser" placeholder="Password">
		

		<div class="form__contenedorBotones">
			<input class="form__Botones" type="submit" name="buttonInsert" value="Registrar"> 
			<a class="form__BotonCancelar" href="menuPrincipal.jsp">Cancelar</a>
		</div>
		</form>
	</div>
	<%
	ConexionBD co = new ConexionBD();
	co.conexionbd();
	%>
</body>
</html>