<%@page import="java.util.List"%>
<%@page import="br.iesb.poo2.mvc.CardapioController"%>
<%@page import="br.iesb.poo2.bean.CardapioBean"%>

<jsp:include page="../struct/header.jsp"/>


<%
    CardapioController cardapio = new CardapioController();
    List<CardapioBean> Lista;
    Lista = cardapio.Listar();
%>

<h1>Cardapios</h1>
<a href="form.jsp">Novo Registro</a>


<table border="1">
    <thead>
        <tr>
            <th>Código</th>
            <th>Nome</th>
            <th>Descrição</th>
            <th>Açoes</th>
        </tr>
    </thead>
    
    <tbody>
        <%
            for (CardapioBean registros : Lista) {
        %>
        <tr>
            <td> <%= registros.getCodigo()%> </td>
            <td> <%= registros.getNome()%> </td>
            <td> <%= registros.getDescricao()%> </td>
            <td><a href="form_update.jsp?id=<%=registros.getId()%>">Alterar</a>  |  <a href="delete.jsp?id=<%=registros.getId()%>">Excluir</a></td>
        </tr>
        <%
            }
        %>
    </tbody>

</table>



<jsp:include page="../struct/footer.jsp"/>