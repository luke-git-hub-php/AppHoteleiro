<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Hóspedes</title>
</head>
<body>
	<div class="container mt-3">
	  <h3>Hóspedes: ${listagem.size()}</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Nome</th>
	        <th>>CPF</th>
	        <th>Telefone</th>
	        <th>Email</th>
	        <th>Núemro de Reservas</th>
	        <th>Serviços solicitados na reserva</th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="p" items="${listagem}">
		      <tr>
				<td>${p.id}</td>
		        <td>${p.name}</td>
		        <td>${p.cpf}</td>
		        <td>${p.cellphone}</td>
		        <td>${p.email}</td>
		        <td>${p.numberReversation}</td>
		        <td>${p.services.size()}</td>
		        <td><a href="/Guest/${p.id}/Remove">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>