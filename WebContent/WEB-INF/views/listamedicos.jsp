<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="./layout/header.jsp"%>

	<div class="conteudo">
		<main>
			<section class="sec">
				<div class="cabecalho_login">
					<h2>Nota de Atualização</h2>
				</div>
				<div class="corpo_login">
					<p>Médicos</p>
					<ul>
						<c:forEach items="${list}" var="l">
							<li>${l.nome }</li>
						</c:forEach>
					</ul>
				</div>
			</section>
		</main>
		<%@ include file="./layout/footer.jsp"%>
	</div>


</body>

</html>