<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.error404 {
	text-align: center;
	font-size: 50px;
	text-transform: uppercase;
	font-family: sans-serif;
	color: red;
	margin-top: 0px;
	padding-top: 80px;
	margin-bottom: 10px;
}

main img {
		position: absolute;
		left: 0;
		right: 0;
		top: 0;
		bottom: 0;
		margin: auto;
		height: 50%
	}
	
#erro {
	position: relative;
	width: 100%;
	heigth: 100%;
}
}
</style>
</head>
<body>
	<c:import url="WEB-INF/views/layout/header.jsp"></c:import>
	<div class="conteudo">
		<main>
			<p class="error404">Pagina não encontrada<br>Erro 404</p>
			<div id="erro">
			<img src="img/error.png">
			</div>
		</main>
		<c:import url="WEB-INF/views/layout/footer.jsp"></c:import>
	</div>
</body>
</html>