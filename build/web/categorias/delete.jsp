<%@page import="br.iesb.poo2.bean.CategoriaBean"%>
<%@page import="br.iesb.poo2.mvc.CategoriaController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String msg3 = null;
    if (request.getParameter("id") == null) {
        msg3 = "Algum erro foi encontrado";
    } else {
        CategoriaBean categoria = new CategoriaBean();
        CategoriaController controller = new CategoriaController();
        categoria.setId(Integer.parseInt(request.getParameter("id")));
        boolean retorno = controller.excluir(categoria);
        if (retorno == false) {
            msg3 = "Excluido com sucesso";
            response.sendRedirect("index.jsp");
        } else {
            msg3 = "Erro ao excluir";
        }
    }

%>
<script>
    alert('<%=msg3%>');
</script>



