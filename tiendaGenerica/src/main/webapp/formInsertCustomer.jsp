<%@page import="Controlador.ConexionBD"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Insert Customer</title>


<!-- Llamado a la hoja de stilos - CSS -->
<link href="css/styleFormInsertCustomer.css" type="text/css" rel="stylesheet" />

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
		<p>Joyer�a Isis</p>
	</div>

	<div class="body__subtitlePage">
		<p>Modulo gesti�n Clientes</p>
	</div>

<header>
		<nav id="menu">
      <ul class="#menugeneral">
        <li>
          <a class="header__menu" href="#">Usuarios</a>
          <ul>
            <li><a class="header__submenu"  href="formInsertUsuario.jsp">Registrar</a></li>
            <li><a class="header__submenu" href="formConsultarUsuario.jsp">Consultar</a></li>
            <li><a class="header__submenu" href="formActualizarUsuario.jsp">Actualizar</a></li>
            <li><a class="header__submenu" href="formEliminarUsuario">Eliminar</a></li>
          </ul>
        </li>
        <li>
          <a class="header__menu" href="#">Clientes</a>
          <ul>
            <li><a class="header__submenu" href="formInsertCustomer.jsp">Registrar</a></li>
            <li><a class="header__submenu" href="formConsultarCustomer.jsp">Consultar</a></li>
            <li><a class="header__submenu" href="formActualizarCustomer.jsp">Actualizar</a></li>
            <li><a class="header__submenu" href="formEliminarCustomer">Eliminar</a></li>
          </ul>
        </li>
        <li><a class="header__menu" href="#">Proveedores</a></li>
        <li><a class="header__menu" href="#">Productos</a></li>
        <li><a class="header__menu" href="#">Ventas</a></li>
        <li><a class="header__menu" href="#">Reportes</a></li>
        <li><a class="header__menu" href="PageLogin.jsp">Salir</a></li>
      </ul>
    </nav>
	</header>

	<!-- <img class="header__logoMarca" src="css/img/logo__.jpg" /> -->
	<div class="contenedor__formularioCompleto">
		<div class="tituloDelFormulario">
			<i class="fas fa-address-card"></i> 
			<span>Datos del Cliente</span>
		</div>
		
		

<form action="servletCustomer" method="POST">
		<input class="form__input" type="text" name="cedulaCustomer" placeholder="Cedula">
		<input class="form__input" type="text" name="directionCustomer" placeholder="Direccion">
		<input class="form__input" type="email" name="email_customer" placeholder="E-mail">
		<input class="form__input" type="text" name="nameCustomer" placeholder="Nombre">
		<input class="form__input" type="text" name="phoneNumberCustomer" placeholder="Telefono">
			
		

		<div class="form__contenedorBotones">
			<input class="form__Botones" type="submit" name="buttonInsert" value="Registrar"> 
			<a class="form__BotonCancelar" href="menuPrincipal.jsp">Cancelar</a>
		</div>
		</form>
	</div>

	
<%
ConexionBD co=new ConexionBD();
co.conexionbd();
%>	

</body>
</html>