<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="link" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Cadastro de Paciente</title>
<link rel="stylesheet" href="./css/style.css" type="text/css">
</head>

<body>

	<%@ include file="./layout/header.jsp" %>

	<main>
		<section class="sec">
			<div class="cabecalho_login">
				<h2>Cadastro de Paciente</h2>
			</div>
			<div class="corpo_login">
				<form method="post" action="${link }">
					<fieldset>
						<legend>Dados do Paciente</legend>
						<label for="nomePaciente">Nome do Paciente: </label>
						<input type="text" name="nome" id="nomePaciente">
						<label for="convenioPaciente">Convênio: </label>
						<input type="text" name="convenio" id="convenioPaciente">
						<label for="cpfPaciente">CPF: </label>
						<input type="text" name="cpf" id="cpfPaciente">
						<input type="hidden" name="acao" value="CadastrarPaciente">
						<input type="submit" value="enviar">
					</fieldset>
				</form>
			</div>
		</section>
	</main>

	<%@ include file="./layout/footer.jsp" %>

</body>

</html>