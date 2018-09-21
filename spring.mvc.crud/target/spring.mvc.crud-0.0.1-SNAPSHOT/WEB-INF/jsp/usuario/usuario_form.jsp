<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Usuario Formulario</title>
</head>
<body>

	<spring:url value="/usuario/save" var="saveURL" />
	
	<form:form modelAttribute="usuarioForm" method="post" action="${saveURL }" >
	 <form:hidden path="id"/>
	 <table>
	  <tr>
	   <td>Nombre: </td>
	   <td>
	    <form:input path="Nombre"/>
	   </td>
	  </tr>
	  <tr>
	   <td>Apellido Paterno: </td>
	   <td>
	    <form:input path="Ape_Paterno"/>
	   </td>
	  </tr>
	  <tr>
	   <td>Apellido Materno: </td>
	   <td>
	    <form:input path="Ape_Materno"/>
	   </td>
	  </tr>
	  <tr>
	   <td></td>
	   <td>
	    <button type="submit">Guardar</button>
	   </td>
	  </tr>
	 </table>
	 
	</form:form>
	

</body>
</html>