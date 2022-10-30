v<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Apartamentos</title>
</head>
<body>
	<div class="container mt-3">
	  <h3>Apartamentos: ${listagem.size()}</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>N�mero do Apartamento</th>
	        <th>Intes do Apartamento</th>
	        <th>Tipo do Apartamento</th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="p" items="${listagem}">
		      <tr>
				<td>${p.id}</td>
		        <td>${p.number}</td>
		        <td>${p.itens.size()}</td>
		        <td>${p.type}</td>
		        <td><a href="/Apartment/${p.id}/Remove">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>