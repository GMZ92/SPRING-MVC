<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Usuario Pagina</title>
</head>
<body>

	<h1>Users List</h1>
	<table width="100%" border="1">
	 <tr>
	  <th>ID</th>
	  <th>Nombre</th>
	  <th>Apellido Paterno</th>
	  <th>Apellido Materno</th>
	  <th colspan="2">Action</th>
	 </tr>
	 <c:forEach items="${listUsuario }" var="usuario" >
	  <tr>
	   <td>${user.id }</td>
	   <td>${user.Nombre }</td>
	   <td>${user.Ape_Paterno }</td>
	   <td>${user.Ape_Materno }</td>
	   <td>
	    <spring:url value="/usuario/update/${usuario.id }" var="updateURL" />
	    <a href="${updateURL }">Update</a>
	   </td>
	   <td>
	    <spring:url value="/usuario/delete/${usuario.id }" var="deleteURL" />
	    <a href="${deleteURL }">Delete</a>
	   </td>
	  </tr>    
	 </c:forEach>
	</table>
	
</body>
</html>