<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<div class="form-group">
	<label>CEP:</label>
	<input type="text" class="form-control" placeholder="Entre com o seu CEP" value="${address.cep}" name="endereco.cep">
</div>
<div class="form-group">
	<label>Logradouro:</label>
	<input type="text" class="form-control" placeholder="Entre com o seu logradouro" value="${address.logradouro}" name="address.logradouro">
</div>
<div class="form-group">
	<label>Complemento:</label>
	<input type="text" class="form-control" placeholder="Entre com o seu complemento" value="${address.complemento}" name="address.complemento">
</div>
<div class="form-group">
	<label>Bairro:</label>
	<input type="text" class="form-control" placeholder="Entre com o seu bairro" value="${address.bairro}" name="address.bairro">
</div>
<div class="form-group">
	<label>Localidade:</label>
	<input type="text" class="form-control" placeholder="Entre com o sua localidade" value="${address.localidade}" name="address.localidade">
</div>
<div class="form-group">
	<label>UF:</label>
	<input type="text" class="form-control" placeholder="Entre com o sua uf" value="${address.uf}" name="address">
</div>