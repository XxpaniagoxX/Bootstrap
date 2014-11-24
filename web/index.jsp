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
                            <li class="active"><a href="./">Home</a></li>
                            <li><a href="cadastra-fichapolicial.jsp">Cadastro do Meliante</a></li>
                            <li><a href="mvc?logica=ListaMeliantesByDelitoLogic">Lista de Meliantes</a></li>
                            <li><a href="mvc?logica=ListaMeliantesByNomeLogic">Remove Meliante</a></li>
                            <li><a href="mvc?logica=ListaMeliantesByForagidosLogic">Lista de Procurados</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
            <div class="jumbotron">
                <h1>Bem vindo à <small>Delegacia</small></h1>
                <p>
                    Por: Pedro Papa Paniago
                </p>
            </div>
        </div>
    </body>
</html>
