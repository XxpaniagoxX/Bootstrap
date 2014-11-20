<%-- 
    Document   : index
    Created on : 11/11/2014, 08:00:29
    Author     : alunos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bem vindo a delegacia</h1>
        <a href="cadastra-fichapolicial.jsp">Cadastro do Meliante</a><br><br>
        <a href="mvc?logica=ListaMeliantesByDelitoLogic">Lista de Meliantes</a><br><br>
        <a href="mvc?logica=ListaMeliantesByNomeLogic">Remove Meliante</a><br><br>
        <a href="mvc?logica=ListaMeliantesByForagidosLogic">Lista de Procurados</a> 
    </body>
</html>
