<%-- 
    Document   : index
    Created on : 02/04/2013, 22:30:59
    Author     : Saulo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Projeto Web Service XML - BUSCADOR DE PASSAGENS - BETA</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
    </head>
    <body>

        <div class="container">
            <div class="hero-unit">

                <h1>Buscar Férias</h1>
            </div>

            <div class="btn-group">
                <button class="btn btn-large btn-primary">Cliente</button>
                <button class="btn btn-large btn-primary">Passagem</button>
                <button class="btn btn-large btn-primary">Hotel</button>
            </div>

            <h4>'Férias vêem ne mim'</h1>

            <form class="form-inline" action="LoginServlet">
                <input type="text" class="input-small" placeholder="Email">
                <input type="password" class="input-small" placeholder="Password">
                <label class="checkbox">
                    <input type="checkbox"> Remember me
                </label>
                <button type="submit" class="btn">Sign in</button>
            </form>
        </div>
    </body>
    <script src="/js/bootstrap.js"></script>
    <script src="/js/jquery-1.9.1.js"></script>
    <script src="/js/modernizr.js"></script>
</html>
