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
  <title>Tela de Login</title>
  <link rel="stylesheet" href="css/login.css" type="text/css">
</head>
<body>
  <div class="login">
    <header>
      <img src="img/icon.png">
    </header>
    <form action="${link }" method="post">
      <label id="usr" for="user">Usuário</label>
      <input type="text" id="user" name="usuario"><br>
      <label id="snh" for="password">Senha</label>
      <input type="password" id="password" name="senha">
      <input type="hidden" name="acao" value="Login">
      <input id="botao" type="submit" value="ENTRAR">
    </form>
  </div>
</body>
</html>