<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Apartamentos</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">

	<h2>Apartamento</h2>
	  <form action="/guest/Create" method="post">
	    <div class="form-group">
	      <label>Número do apartamento:</label>
	      <input type="number" class="form-control" placeholder="Entre com o número do apartamento" name="number">
	    </div>
	    <div class="form-group">
			<label>Itens no apartamento:</label>
			<select name="aluno.id" class="form-select">
				<c:forEach var="a" items="${apartment }">
					<option value="${a.getId()}">${a.getItens()}</option>
				</c:forEach>
			</select>
		</div>
	   	<div class="form-group">
	      <label>Tipo de apartamento</label>
	      <input type="text" class="form-control" placeholder="Entre com o tipo do apartamento" name="type">
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
  
	</div>
</body>
</html>