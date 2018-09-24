<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Usuario</title>
</head>
<body>

	<spring:url value="usuario/add" var="addURL" />
	<a href="${addURL }">Nuevo Usuario</a>
	
	<table width="100" border="1">
		<tr>
			<td>Id</td>
			<td>Nombre</td>
			<td>Apellido Paterno</td>
			<td>Apellido Materno</td>
			<td colspan="2">Accion</td>
		</tr>
		<c:forEach items="list" var="usuario">
			<tr>
				<td>${usuario.id }</td>
				<td>${usuario.Nombre }</td>
				<td>${usuario.Ape_Paterno }</td>
				<td>${usuario.Ape_Materno }</td>
				<td><spring:url value="/usuario/update/${usuario.id }"
						var="updateURL" /> <a href="${updateURL }">Editar</a></td>
				<td><spring:url value="/usuario/update/${usuario.id }"
						var="deleteURL" /> <a href="${deleteURL }">Eliminar</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>