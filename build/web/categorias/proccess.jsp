<%@page import="br.iesb.poo2.mvc.CategoriaController"%>
<%@page import="br.iesb.poo2.bean.CategoriaBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    CategoriaController controller = new CategoriaController();
    CategoriaBean categoria = new CategoriaBean();
    String msg = null;
    boolean req1 = true;

    if (request.getParameter("acao").equals("inserir")) {
        categoria.setNome(request.getParameter("nome"));
        req1 = controller.inserir(categoria);
        msg = "A categoria foi cadastrada";
        response.sendRedirect("index.jsp");
    } else {
        out.println("Não funcionou");
    }


  if (request.getParameter("acao").equals("alterar")) {
            
      
            categoria.setId(Integer.parseInt(request.getParameter("id")));
            
            categoria.setNome(request.getParameter("nome"));

            boolean retorno1 = controller.alterar(categoria);
            msg = "Categoria alterada com sucesso !";
            response.sendRedirect("index.jsp");
    } else {
    }



%>


<script>
    alert('<%=msg%>');
</script>
