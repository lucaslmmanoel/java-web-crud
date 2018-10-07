<%@page import="br.iesb.poo2.mvc.CategoriaController"%>
<%@page import="br.iesb.poo2.bean.CategoriaBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <%
        CategoriaBean categoria = new CategoriaBean();
        CategoriaController controllerCategoria = new CategoriaController();
        Integer catId = Integer.parseInt(request.getParameter("id")); 
        categoria.setId(catId);
        categoria = controllerCategoria.Buscar(categoria);
    %>
    <body>

        <form method="post" action="proccess.jsp?id=<%=categoria.getId()%>">
            <input type="hidden" name="id" value="<%=categoria.getId()%>"/>
            <input type="hidden" name="categorias_id" value="<%=categoria.getCategorias_id()%>"/>
            <label name='nome' id="nome">Nome:<input type="text" name="nome" value="<%=categoria.getNome()%>"></label><br>
            <input type="hidden" name="acao" id="acao" value="alterar"></input>

            <button type="submit" value="alterar">Atualizar</button>

        </form>

    </body>
</html>
