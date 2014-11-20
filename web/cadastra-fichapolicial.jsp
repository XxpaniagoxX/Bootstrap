<%-- 
    Document   : cadastra-fichapolicial
    Created on : 11/11/2014, 08:21:09
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
        <h1>Cadastro</h1>
        <form action="mvc?logica=AdicionaMelianteLogic" method="post">
            Nome: <input type="text" name="Nome" /><br />
            CPF: <input type="text" name="CPF" /><br />
            Endereco: <input type="text" name="Endereco" /><br />
            Delito: <input type="text" name="Delito" /><br /> 
            Data: <input type="text" name="Data" placeholder="dd/mm/aaaa"/><br /> 
            Hora: <input type="text" name="Hora" /><br />
            Local: <input type="text" name="Local" /><br />
            Estado: <input type="text" name="Estado" /><br />
            Link Da Foto: <input type="text" name="Foto" /><br />
            <input type="submit" value="Gravar" /> 
        </form>
    </body>
</html>
