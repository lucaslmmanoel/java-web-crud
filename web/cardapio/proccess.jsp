<%@page import="br.iesb.poo2.mvc.CardapioController"%>
<%@page import="br.iesb.poo2.bean.CardapioBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    CardapioController controller = new CardapioController();
    CardapioBean cardapio = new CardapioBean();
    String msg = null;
    boolean req1 = true;

    if (request.getParameter("acao").equals("inserir")) {

        cardapio.setCodigo(Integer.parseInt(request.getParameter("codigo")));
        cardapio.setQuantidade(Integer.parseInt(request.getParameter("qtd")));

        cardapio.setNome(request.getParameter("nome"));
        cardapio.setDescricao(request.getParameter("descricao"));

        cardapio.setValor_compra(Double.parseDouble(request.getParameter("valor_compra")));
        cardapio.setValor_venda(Double.parseDouble(request.getParameter("valor_venda")));

        cardapio.setCategorias_id(Integer.parseInt(request.getParameter("categorias_id")));

        req1 = controller.inserir(cardapio);
        msg = "O cardapio foi cadastrada";
        response.sendRedirect("index.jsp");

    } else {
        out.println("Não funcionou");
    }

    if (request.getParameter("acao").equals("alterar")) {

        cardapio.setId(Integer.parseInt(request.getParameter("id")));

        cardapio.setCodigo(Integer.parseInt(request.getParameter("codigo")));
        cardapio.setQuantidade(Integer.parseInt(request.getParameter("qtd")));

        cardapio.setNome(request.getParameter("nome"));
        cardapio.setDescricao(request.getParameter("descricao"));

        cardapio.setValor_compra(Double.parseDouble(request.getParameter("valor_compra")));
        cardapio.setValor_venda(Double.parseDouble(request.getParameter("valor_venda")));

        cardapio.setCategorias_id(Integer.parseInt(request.getParameter("categorias_id")));

        boolean retorno1 = controller.alterar(cardapio);
        msg = "Categoria alterada com sucesso !";
        response.sendRedirect("index.jsp");
    } else {
    }
%>


<script>
    alert('<%=msg%>');
</script>
