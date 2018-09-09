
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Produto"%>
<%@page import="dao.ProdutoDAO"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="index.jsp" method="POST">
            <label>Descricação: </label>
            <input type="text" name="descricao" ></input>
            <button type="submit">
                OK
            </button>
        </form>
        <%
            try {
                out.print("<table>");
                out.print("<tr>");
                out.print("<th>Código</th> <th>Descrição</th> <th>Preço</th>");
                ProdutoDAO prod = new ProdutoDAO();
                if (request.getParameter("descricao") == "" || request.getParameter("") == "") {
                    ArrayList<Produto> lista = prod.listarTodos();
                    for (int num = 0; num < lista.size(); num++) {
                        out.print("<tr>");
                        out.print("<td>" + lista.get(num).getCdg_produto() + "</td>");
                        out.print("<td>" + lista.get(num).getDescr_produto() + "</td>");
                        out.print("<td>" + lista.get(num).getPreco_produto() + "</td>");
                        out.print("<td><a href='alterar.jsp?codigo="+lista.get(num).getCdg_produto()+"&descricao="+
                                lista.get(num).getDescr_produto()+"&preco="+lista.get(num).getPreco_produto()+
                                ">Alterar</a></td>");
out.print("<td><a href='excluir.jsp?codigo="+lista.get(num).getCdg_produto()+"&descricao="+
                                lista.get(num).getDescr_produto()+
                                ">Excluir</a></td>");
                        out.print("</tr>");
                    }
                }else{
                    ArrayList<Produto> lista = prod.listarTodosDescricao(request.getParameter("descricao"));
                    for (int num = 0; num < lista.size(); num++) {
                        out.print("<tr>");
                        out.print("<td>" + lista.get(num).getCdg_produto() + "</td>");
                        out.print("<td>" + lista.get(num).getDescr_produto() + "</td>");
                        out.print("<td>" + lista.get(num).getPreco_produto() + "</td>");
                        out.print("<td><a href='alterar.jsp?codigo="+lista.get(num).getCdg_produto()+"&descricao="+
                                lista.get(num).getDescr_produto()+"&preco="+lista.get(num).getPreco_produto()+
                                ">Alterar</a></td>");
out.print("<td><a href='excluir.jsp?codigo="+lista.get(num).getCdg_produto()+"&descricao="+
                                lista.get(num).getDescr_produto()+
                                ">Excluir</a></td>");
                        out.print("</tr>");
                    }
                }
                out.print("</tr>");

                out.print("</table>");

            } catch (Exception e) {
                throw new RuntimeException("Erro 10", e);
            }
        %>
    </body>
</html>
