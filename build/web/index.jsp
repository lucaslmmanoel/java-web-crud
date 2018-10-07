<jsp:include page="./struct/header.jsp"/>

<%-- Formulario de acesso da aplicação --%>

<div class="container">
    <form action="ControllerServlet" method="post">  

        Nome:<input type="text" name="name"><br>  

        Senha:<input type="password" name="password"><br>  
        <input type="submit" value="login">  
    </form>  
</div>

<jsp:include page="./struct/footer.jsp"/>