<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>page menu principal</title>


<!-- Llamado a la hoja de stilos - CSS -->
<link href="css/styleMenuPrincipal.css" type="text/css" rel="stylesheet" />

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
<script src="https://kit.fontawesome.com/ea8e6c92c7.js" crossorigin="anonymous">	
</script>

</head>



<!-- Inicio page menu principal -->
<body>
	<div class="body__titlePage">
		<p>Joyería Isis</p>
	</div>
	<header>
		<nav id="menu">
      <ul class="#menugeneral">
        <li>
          <a class="header__menu" href="#">Usuarios</a>
          <ul>
            <li><a class="header__submenu"  href="formInsertUsuario.jsp">Registrar</a></li>
            <li><a class="header__submenu" href="formEliminarUsuario">Eliminar</a></li>
            <li><a class="header__submenu" href="formActualizarUsuario.jsp">Actualizar</a></li>
            <li><a class="header__submenu" href="formConsultarUsuario.jsp">Consultar</a></li>
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

</body>
</html>