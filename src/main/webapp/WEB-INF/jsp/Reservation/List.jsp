<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Reservas</title>
</head>
<body>
	<div class="container mt-3">
	  <h3>Reservas: ${listagem.size()}</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Data de entrada</th>
	        <th>>Data de sa�da</th>
	        <th>Confirma��o da reserva</th>
	        <th>H�spede</th>
	        <th>Servi�os</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="p" items="${listagem}">
		      <tr>
				<td>${p.id}</td>
		        <td>${p.checkIn}</td>
		        <td>${p.checkOut}</td>
		        <td>${p.confirmation}</td>
		        <td>${p.guest.name}</td>
		        <td>${p.services.size()}</td>
		        <td><a href="/reservation/${p.id}/Remove">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>