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
        CardapioController cardapioController = new CardapioController();
        Integer carId = Integer.parseInt(request.getParameter("id")); 
        cardapio.setId(carId);
        cardapio = cardapioController.Buscar(cardapio);
        
    %>
    <body>

      
        <form action="proccess.jsp?proccess.jsp?id=<%=cardapio.getId()%>" method="POST">

            <input type="hidden" id="acao" name="acao" value="alterar" />
            <input type="hidden" name="id" value="<%=cardapio.getId()%>"/>

            <label>Código</label>
            <input type="text" name="codigo" value="<%=cardapio.getCodigo()%>"/>
            
            <label>Nome</label>
            <input type="text" name="nome" value="<%=cardapio.getNome()%>"/>
            
            <label>Descricao</label>
            <input type="text" name="descricao" value="<%=cardapio.getDescricao()%>"/>
            
            <label>Quantidade</label>
            <input type="number" name="qtd" value="<%=cardapio.getQuantidade()%>"/>
            
            <label>Valor de venda</label>
            <input type="number" name="valor_venda" value="<%=cardapio.getValor_venda()%>"/>
            
            <label>Valor de Compra</label>
            <input type="number" name="valor_compra" value="<%=cardapio.getValor_compra()%>"/>
            
            
            <input type="hidden" name="categorias_id" value="<%=cardapio.getCategorias_id()%>">
            <input type="submit" value="enviar" />

        </form>

            
            

    </body>
</html>
