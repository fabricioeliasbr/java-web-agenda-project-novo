<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="icon" type="image/png" href="assets/iconeproject.png" />
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
<title>Lista de contatos</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" target="_blank" href="index.html">Home</a>
  <a class="navbar-brand" target="_blank" href="busca-contatos">Listar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" target="_blank" href="adiciona-contato.jsp">Cadastrar<span class="sr-only">(current)</span></a>
      </li>
    </ul>
  </div>
</nav>
<div class="text-center">
<h1 class="display-2">Lista de contatos</h1><br><br><br>
</div>
<div id="container">
<table class="table" id="Tabela">
	<tr>
		<th>ID</th>
		<th>Nome</th>
		<th>E-mail</th>
		<th>Endereço</th>
		<th>Telefone</th>
		<th></th>
		<th></th>
	</tr>
	<c:forEach var="pessoa" items="${contatos}">
	<tr>
		<td>${pessoa.id}</td>
		<td>${pessoa.nome}</td>
		<td>${pessoa.email}</td>
		<td>${pessoa.endereco}</td>
		<td>${pessoa.telefone}</td>
		<td><a href="adiciona-contato.jsp?id=${pessoa.id}&nome=${pessoa.nome}
		&email=${pessoa.email}&endereco=${pessoa.endereco}
		&telefone=${pessoa.telefone}" class="btn btn-primary">Editar</a></td>
		<td><a href="remover-contato?id=${pessoa.id}" class="btn btn-primary">Remover</a></td>
	</tr>
	</c:forEach>
</table>
</div>
</body>
</html>