<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Alimentações</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">

	<h2>Alimentações</h2>
	  <form action="/guest/Create" method="post">
	    <div class="form-group">
	      <label>Nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com o nome da alimento" name="name">
	    </div>
	    <div class="form-group">
	      <label>Valor:</label>
	      <input type="number" class="form-control" placeholder="Entre com o valor do alimento" name="amount">
	    </div>
	    <div class="form-group">
	      <label>Tipo de lazer</label>
	      <input type="datetime-local" class="form-control" placeholder="Entre com o horário da alimentação" name="time">
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
  
	</div>
</body>
</html>