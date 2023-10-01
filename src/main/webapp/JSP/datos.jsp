<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="com.pablo.model.Persona"%>
<!DOCTYPE html>
<html>
<head>
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Datos del usuario</title>
</head>
<body>
	
	<% Persona persona = (Persona) request.getAttribute("persona"); %>

	<div class="container">
		<h1>Datos del usuario:</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Nombre y apellidos:</th>
					<th>Correo:</th>
					<th>Genero:</th>
					<th>Conocimientos:</th>
					<th>Idioma:</th>
					<th>Comentario adicional</th>
				</tr>
				<tr>
					<td><%= persona.getNombre() + " " + persona.getApellidos() %></td>
					<td><%= persona.getCorreo() %></td>
					<td><%= persona.getGenero() %></td>
					<td>
					<c:forEach var="conocimiento" items="${persona.getConocimientos()}">
    						${conocimiento}
						</c:forEach>
					</td>
					<td>
						<c:forEach var="idioma" items="${persona.getIdiomas()}">
    						${idioma}
						</c:forEach>
					</td>
					<td><%= persona.getComentario() %></td>
				</tr>
			</thead>
		</table>
	</div>
</body>
</html>