<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="link" />
<!DOCTYPE html>
<html lang="pt_BR">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Pagina Inicial</title>
<link rel="stylesheet" href="./css/style2.css" type="text/css">
</head>

<body>
	<c:import url="WEB-INF/views/layout/header.jsp"></c:import>

	<div class="conteudo">
		<main>
			<section class="sec">
				<div class="cabecalho_login">
					<h2>Nota de Atualização</h2>
				</div>
				<div class="corpo_login">
					<p>Olá, Fulano.</p>
					<p>Devido ao COVID-19 nosso horário de funcionamento mudou,
						agora estamos atendendo das 10hrs até às 18:00hrs, para maior
						comodidade agende uma consulta em nosso sistema com um de nossos
						médicos. Estamos atendendo mediante alguns cuidados</p>
				</div>
			</section>
			<section class="sec">
				<a href="${link }?acao=CadastroMedico">
					<div class="card card1">
						<img src="img/card_01.jpg">
						<p>Cadastrar Médico</p>
					</div>
				</a> <a href="${link }?acao=CadastroPaciente">
					<div class="card card2">
						<img src="img/card_02.jpg">
						<p>Cadastrar Paciente</p>
					</div>
				</a>
				<div class="card">
					<img src="img/card-3.jpg">
					<p>Agendar Consulta</p>
				</div>
			</section>
		</main>
		<%@ include file="WEB-INF/views/layout/footer.jsp"%>
	</div>


</body>

</html>