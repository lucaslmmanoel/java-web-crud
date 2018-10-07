<%@page import="br.iesb.poo2.mvc.CardapioController"%>
<%@page import="br.iesb.poo2.bean.CardapioBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
    CardapioBean cardapio = new CardapioBean();
    CardapioController controllerCategoria = new CardapioController();
    %>
    <body>

        <form action="proccess.jsp" method="POST">

            <input type="hidden" id="acao" name="acao" value="inserir" />
            <input type="hidden" name="id"/>

            <label>Código</label>
            <input type="text" name="codigo"/>
            
            <label>Nome</label>
            <input type="text" name="nome"/>
            
            <label>Descricao</label>
            <input type="text" name="descricao"/>
            
            <label>Quantidade</label>
            <input type="number" name="qtd"/>
            
            <label>Valor de venda</label>
            <input type="number" name="valor_venda"/>
            
            <label>Valor de Compra</label>
            <input type="number" name="valor_compra"/>
            
            
            <input type="hidden" name="categorias_id">
            <input type="submit" value="enviar" />

        </form>
