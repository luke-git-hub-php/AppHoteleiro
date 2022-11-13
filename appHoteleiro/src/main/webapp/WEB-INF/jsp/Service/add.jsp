<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Serviços</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">

	<h2>Serviços</h2>
	  <form action="/guest/Create" method="post">
	    <div class="form-group">
	      <label>Nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com o nome do serviço" name="name">
	    </div>
	    <div class="form-group">
	      <label>Valor do serviço:</label>
	      <input type="number" class="form-control" placeholder="Entre com o valor do serviço" name="value">
	    </div>
	    <div class="form-group">
	      <label>Tipo do serviço</label>
	      <input type="text" class="form-control" placeholder="Entre com o tipo do serviço" name="type">
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
  
	</div>
</body>
</html>