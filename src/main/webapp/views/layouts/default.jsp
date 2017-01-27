<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="resources/styles/main.css" />"
	rel="stylesheet" type="text/css">
<link
	href="<c:url value="https://fonts.googleapis.com/css?family=Raleway:100,600"/>"
	rel="stylesheet" type="text/css">
<title>Game World - <sitemesh:write property='title' /></title>
</head>
<body>
<!-- 	HEADER CON MENU (VARIA SEGUN SESION) -->
	<header> 
		<span id="logo" class="left">Game World</span> 
		<nav id="mainMenu">
			<ul>
				<li><a href="home">INICIO</a></li>
				<li><a href="register">REGISTRARSE</a></li>
				<li><a href="products">PRODUCTOS</a></li>
				<li><a href="who">QUIÉNES SOMOS</a></li>
				<li><a href="how">CÓMO LLEGAR</a></li>
				<li><a href="contact">CONTACTO</a></li>
			</ul>
		</nav> 
	</header>
	<div id="container">
		<div id="content">
			<div id="subtitle">
				<h1><sitemesh:write property='title' /></h1>
				<hr>
			</div>
			<sitemesh:write property='body' />
		</div>
	</div>
<!-- 	FOOTER -->
	<footer>
		<sitemesh:write property='footer' />
		5
	</footer>
</body>
</html>