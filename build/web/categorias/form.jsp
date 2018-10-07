<jsp:include page="../struct/header.jsp"/>
<%@page import="br.iesb.poo2.mvc.CategoriaController"%>
<%@page import="br.iesb.poo2.bean.CategoriaBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    CategoriaBean categoria = new CategoriaBean();
    CategoriaController controllerCategoria = new CategoriaController();
%>
<div class="container"> 
    <form action="proccess.jsp" method="POST">

        <label>Nome</label>
        <input type="hidden" id="acao" name="acao" value="inserir" />
        <input type="hidden" name="id"/>
        <input type="text" name="nome"/>
        <input type="hidden" name="categorias_id">
        <input type="submit" value="enviar" />

    </form>
</div>
<jsp:include page="../struct/footer.jsp"/>
