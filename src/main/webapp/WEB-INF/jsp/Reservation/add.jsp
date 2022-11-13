<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Reservas</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container mt-3">
		<h2>Reserva</h2>
		<form action="/reservation/Create" method="post">
			<div class="form-group">
				<label>CheckIn:</label>
				<input type=datetime-local class="form-control" name="checkIn">
			</div>
			<div class="form-group">
				<label>CheckOut:</label>
				<input type="datetime-local" class="form-control" name="checkOut">
			</div>
			<div class="form-group">
		      <label>Confirmação:</label>
				<div class="form-check">
				  <input type="radio" class="form-check-input" name="web" value="true"> Sim
				  <label class="form-check-label"></label>
				</div>
				<div class="form-check">
				  <input type="radio" class="form-check-input" name="web" value="false"> Mão
				  <label class="form-check-label"></label>
				</div>
	   		 </div>
			<div class="form-group">
				<label>Hóspedes:</label>
				<select name="aluno.id" class="form-select">
					<c:forEach var="a" items="${Guest }">
						<option value="${a.getId()}">${a.getName()}</option>
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
				<label>Serviços:</label>
				<c:forEach var="c" items="${Service}">
					<div class="form-check">
						<input class="form-check-input" type="checkbox" name="conteudos"
							value="${c.getId()}">
					<label class="form-check-label">${c.getName()}</label>
					</div>
				</c:forEach>
			</div>
			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>
</body>
</html>