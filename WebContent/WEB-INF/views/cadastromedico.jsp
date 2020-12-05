<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="link" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Cadastro de Médicos</title>
<link rel="stylesheet" href="./css/style.css" type="text/css">
</head>

<body>

	<header class="topo_pagina">
		<nav>
			<ul>
				<li><a href="">Início</a></li>
				<li><a href="">Cadastrar Médico</a></li>
				<li><a href="">Listar Médicos</a></li>
				<li><a href="">Cadastrar Paciente</a></li>
				<li><a href="">Listar Pacientes</a></li>
				<li><a href="">Cadastrar Convênios</a></li>
				<li><a href="">Listar Convênios</a></li>
			</ul>
		</nav>
		<div class="centralizador_topo">
			<h1>Sistema - MEDICAL LIFE</h1>
			<p>Sistema de Gestão Médica</p>
		</div>
	</header>

	<main>
		<section class="sec">
			<div class="cabecalho_login">
				<h2>Cadastro de Médico</h2>
			</div>
			<div class="corpo_login">
				<form method="post" action="${link }">
					<fieldset>
						<legend>Dados do Médico</legend>
						<label for="nomeMedico">Nome do Médico: </label>
						<input type="text" name="nome" id="nomeMedico">
						<label for="crmMedico">CRM: </label>
						<input type="text" name="crm" id="crmMedico">
						<label for="situacaoMedico">Situação: </label>
						<input type="text" name="situacao" id="situacaoMedico">
						<input type="hidden" name="acao" value="CadastrarMedico">
						<input type="submit" value="enviar">
					</fieldset>
				</form>
			</div>
		</section>
	</main>

	<footer>Copyright</footer>

</body>

</html>