<%@page import="br.iesb.poo2.bean.CardapioBean"%>
<%@page import="br.iesb.poo2.mvc.CardapioController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String msg3 = null;
    if (request.getParameter("id") == null) {
        msg3 = "Algum erro foi encontrado";
    } else {
        CardapioBean cardapio = new CardapioBean();
        CardapioController controller = new CardapioController();
        cardapio.setId(Integer.parseInt(request.getParameter("id")));
        boolean retorno = controller.excluir(cardapio);
        if (retorno == false) {
            msg3 = "Excluido com sucesso";
            response.sendRedirect("index.jsp");
        } else {
            msg3 = "Erro ao excluir";
            response.sendRedirect("index.jsp");
        }
    }

%>
<script>
    alert('<%=msg3%>');
</script>



