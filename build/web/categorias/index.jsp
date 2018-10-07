<%@page import="java.util.List"%>
<%@page import="br.iesb.poo2.mvc.CategoriaController"%>
<%@page import="br.iesb.poo2.bean.CategoriaBean"%>

<jsp:include page="../struct/header.jsp"/>


<%
    CategoriaController categoria = new CategoriaController();
    List<CategoriaBean> Lista;
    Lista = categoria.Listar();
%>

<h1>Categorias</h1>
<a href="form.jsp">Novo Registro</a>


<table border="1">
    <thead>
        <tr>
            <th>Nome</th>
            <th>Açoes</th>
        </tr>
    </thead>
    <tbody>
        <%
            for (CategoriaBean registros : Lista) {
        %>
        <tr>
            <td> <%= registros.getNome()%> </td>
            <td><a href="form_update.jsp?id=<%=registros.getId()%>">Alterar</a>|<a href="delete.jsp?id=<%=registros.getId()%>">Excluir</a></td>
        </tr>
        <%
            }
        %>
    </tbody>
</table>



<jsp:include page="../struct/footer.jsp"/>