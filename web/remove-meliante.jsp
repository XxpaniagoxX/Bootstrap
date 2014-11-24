<%-- 
    Document   : remove-meliante
    Created on : 13/11/2014, 08:06:23
    Author     : alunos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="./css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <nav class="navbar navbar-default">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbarSite">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span> 
                        </button>
                        <a class="navbar-brand" href="#">Delegacia</a>
                    </div>
                    <div class="collapse navbar-collapse" id="navbarSite">
                        <ul class="nav navbar-nav">
                            <li><a href="./">Home</a></li>
                            <li><a href="cadastra-fichapolicial.jsp">Cadastro do Meliante</a></li>
                            <li><a href="mvc?logica=ListaMeliantesByDelitoLogic">Lista de Meliantes</a></li>
                            <li class="active"><a href="mvc?logica=ListaMeliantesByNomeLogic">Remove Meliante</a></li>
                            <li><a href="mvc?logica=ListaMeliantesByForagidosLogic">Lista de Procurados</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
            <div class="jumbotron">
                <h1>Remova os meliantes</h1>
                <p>
                    Por: Pedro Papa Paniago
                </p>
            </div>
            <table class="table table-striped table-bordered table-hover table-condensed">
                <tr>
                    <td>Nome</td>
                    <td>CPF</td>
                    <td>Endereco</td>
                    <td>Delito</td>
                    <td>Data</td>
                    <td>Hora</td>
                    <td>Local</td>
                    <td>Estado</td>
                    <td>Foto</td>

                </tr>
                <c:forEach var="meliante" items="${meliantes}">
                    <tr>
                        <td>${meliante.nome}</td>
                        <td>${meliante.cpf}</td>
                        <td>${meliante.endereco}</td>
                        <td>${meliante.delito}</td>
                        <td><fmt:formatDate value="${meliante.data.time}" pattern="dd/MM/yyyy" /></td>
                        <td>${meliante.hora}</td>
                        <td>${meliante.local}</td>
                        <td>${meliante.estado}</td>
                        <td><img height=100 width=100 src=${meliante.foto}></td>
                        <td><a href="mvc?logica=RemoveMelianteLogic&id=${meliante.id}">Remover</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
