<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>page menu principal</title>

<!-- Llamado a la hoja de stilos - CSS -->
    <link href="css/styleMenuPrincipal.css" type="text/css" rel="stylesheet" />

    <!-- Fuentes -tipo de letras -->
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Grey+Qo&display=swap"
      rel="stylesheet"
    />
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Carattere&display=swap"
      rel="stylesheet"
    />

    <!-- Llamado a iconos -->
    <script
      src="https://kit.fontawesome.com/ea8e6c92c7.js"
      crossorigin="anonymous">
    </script>

</head>
<body>
		<div class="body__titlePage">
            <p>Joyería Isis</p>
        </div>
<header>
        <img class="header__logoMarca" src="css/img/logo__.jpg" />
  
        <input type="checkbox" id="header__forResponsive">
        <label for="header__forResponsive"><img src="img/menu.png" alt=""></label>
        <div class="headerMenuNOResponsive">
          <a class="header__menu headerMenuNoResponsive" href="formUsuario.jsp" >Usuarios</a>
          <a class="header__menu headerMenuNoResponsive" href="formInsertCustomer.jsp" target="blank">Clientes</a>
          <a class="header__menu headerMenuNoResponsive" href="formInsertSupplier.jsp" target="blank">Proveedores</a>
          <a class="header__menu headerMenuNoResponsive" href="products.jsp" target="blank">Productos</a>
          <a class="header__menu headerMenuNoResponsive" href="sale.jsp" target="blank">Ventas</a>
          <a class="header__menu headerMenuNoResponsive" href="reports.jsp" target="blank">Reportes</a>
          <a class="header__menu__Buscar headerMenuNoResponsive" href="others.jsp" target="blank"><i class="fas fa-search"></i></a>
        </div>
          <ul class="header__ul__mobile">
            <li class="menu__li__mobile"><a href="formInsertUser.jsp">Usuarios</a></li>
            <li class="menu__li__mobile"><a href="formInsertCustomer.jsp">Clientes</a></li>
            <li class="menu__li__mobile"><a href="formInsertSupplier.jsp">Proveedores</a></li>
            <li class="menu__li__mobile"><a href="products.jsp" >Productos</a></li>
            <li class="menu__li__mobile"><a href="sale.jsp" >Ventas</a></li>
            <li class="menu__li__mobile"><a href="reports.jsp">Reportes</a></li>
          </ul>
      </header>

</body>
</html>