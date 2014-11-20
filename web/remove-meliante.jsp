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
    </head>
    <body>
        <h1>Remova os meliantes</h1>
        <table border="1">
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
    </body>
</html>
