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

            <h3>Cadastro Pessoal</h3>
            <form class="form-horizontal" action="LoginServlet" method="post">
                <div class="control-group">
                    <label class="control-label">Nome</label>
                    <div class="controls">
                        <input type="text" id="inputNome" name="Nome" placeholder="Nome">
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label">Endereço</label>
                    <div class="controls">
                        <input type="text" id="inputEndereco" placeholder="Endereco">
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls">
                        <label class="checkbox"><input type="checkbox"> Aceito os Termos</label>
                        <button type="submit" class="btn">Cadastrar</button>
                    </div>
                </div>
            </form>
            <h3>Procurar Hotel</h3>
            <form class="form-horizontal">
                <div class="control-group">
                    <label class="control-label">Hotel</label>
                    <div class="controls">
                        <select>
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                        </select>
                    </div>
                </div>
            </form>
            <h3>Procurar Passagem</h3>
            <form class="form-horizontal">
                <div class="control-group">
                    <label class="control-label">Passagem</label>
                    <div class="controls">
                        <select>
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                        </select>
                    </div>
                </div>
            </form>
        </div>
    </body>
    <script src="/js/bootstrap.js"></script>
    <script src="/js/jquery-1.9.1.js"></script>
    <script src="/js/modernizr.js"></script>
</html>
