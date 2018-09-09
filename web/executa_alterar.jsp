<%@page import="javax.management.RuntimeErrorException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Produto" %> %>
<%@page import="dao.ProdutoDAO" %> %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>my app</title>
    </head>
    <body>
        <%  
            try {
                  Produto pro = new Produto();
                  ProdutoDAO  prod = new ProdutoDAO();
                  if(request.getParameter("descricao").equals("")  || request.getParameter("preco").equals("")){
                      response.sendRedirect("index.jsp");
                  }
                  else{
                      pro.setDescr_produto(request.getParameter("descricao"));
                      pro.setPreco_produto(Double.parseDouble(request.getParameter("preco")));
                      pro.setPreco_produto(Integer.parseInt(request.getParameter("codigo")));
                      prod.alterar(pro);
                      response.sendRedirect("index.jsp");
                  }
            } catch (Exception e) {
                    throw  new RuntimeException("Erro 8", e);
                }
        %>
    </body>
</html>
