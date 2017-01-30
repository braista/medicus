<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page session="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
<%@ include file="/views/includes/head.jsp" %>
<body>
<!-- 	HEADER CON MENU (VARIA SEGUN SESION) -->
	<%@ include file="/views/includes/header.html" %>
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
	<%@ include file="/views/includes/footer.html" %>
</body>
</html>