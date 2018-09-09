<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="contato" class="model.Contato" scope="session"/>
<jsp:include page = "header.jsp"/>

<div class="container">
    Dados do contato</br>
    Nome: <%= contato.getNome()%>
    Email: <%= contato.getEmail()%>
</div>

<jsp:include page = "footer.jsp"/>
