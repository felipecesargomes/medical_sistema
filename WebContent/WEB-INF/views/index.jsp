<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="link" />
<!DOCTYPE html>
<html lang="pt_BR">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Pagina Inicial</title>
  <link rel="stylesheet" href="./css/style.css" type="text/css">
</head>

<body>

  <header class="topo_pagina">
    <nav>
      <ul>
        <li><a href="">In�cio</a></li>
        <li><a href="">Cadastrar M�dico</a></li>
        <li><a href="">Listar M�dicos</a></li>
        <li><a href="">Cadastrar Paciente</a></li>
        <li><a href="">Listar Pacientes</a></li>
        <li><a href="">Cadastrar Conv�nios</a></li>
        <li><a href="">Listar Conv�nios</a></li>
      </ul>
    </nav>
    <div class="centralizador_topo">
      <h1>Sistema - MEDICAL LIFE</h1>
      <p>Sistema de Gest�o M�dica</p>
    </div>
  </header>

  <main>
    <section class="sec">
        <div class="cabecalho_login">
          <h2>Nota de Atualiza��o</h2>
        </div>
        <div class="corpo_login">
          <p>Ol�, Fulano.</p>
          <p>Devido ao COVID-19 nosso hor�rio de funcionamento mudou, agora estamos atendendo das 10hrs at� �s 18:00hrs, para maior comodidade agende uma consulta em nosso sistema com um de nossos m�dicos. Estamos atendendo mediante alguns cuidados</p>
        </div>
    </section>
    <section class="sec">
      <a href="${link }?acao=CadastroMedico">
        <div class="card card1">
          <img src="img/card_01.jpg">
          <p>Cadastro de M�dicos</p>
        </div>
      </a>
      <div class="card card2">
        <img src="img/card_02.jpg">
        <p>Cadastro de Pacientes</p>
      </div>
      <div class="card">
        <img src="img/card_03.jpg">
        <p>Cadastro de Conv�nios</p>
      </div>
    </section>
  </main>

  <footer>Copyright - Felipe</footer>

</body>

</html>