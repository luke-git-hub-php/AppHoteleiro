<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">AppPedido</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
	  <c:if test="${not empty user}">
	      <li class="nav-item">
	        <a class="nav-link" href="/user/list">Usuário</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/reservation/list">Pedido</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/guest/list">Solicitante</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/service/list">Produto</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/leisure/list">Bebida</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/food/list">Comida</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/apartment/list">Sobremesa</a>
	      </li>
      </c:if>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <c:if test="${empty user}">
	      <li><a href="/user/add"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>      
	      <li><a href="/user/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </c:if>
      
      <c:if test="${not empty user}">
      	  <li><a href="user/logout"><span class="glyphicon glyphicon-log-out"></span> Logout ${user.nome}</a></li>
      </c:if>
    </ul>
  </div>
</nav>