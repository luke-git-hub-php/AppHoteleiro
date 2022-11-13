<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Lazeres</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">

	<h2>Lazeres</h2>
	  <form action="/guest/Create" method="post">
	    <div class="form-group">
	      <label>Nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com o nome do lazer" name="name">
	    </div>
	    <div class="form-group">
	      <label>Lugar:</label>
	      <input type="text" class="form-control" placeholder="Entre com o nome do lugar" name="value">
	    </div>
	    <div class="form-group">
	      <label>Tipo de lazer</label>
	      <input type="text" class="form-control" placeholder="Entre com o tipo do lazer" name="type">
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
  
	</div>
</body>
</html>