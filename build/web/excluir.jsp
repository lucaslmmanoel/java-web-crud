
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <form action="executa_excluir.jsp" method="POST">
            <label>Código:</label>
            <input type="text" name="codigo" value="<%=request.getParameter("codigo")%>"></input>
            
            <label>Descrição:</label>
            <input type="text" name="descricao" value="<%=request.getParameter("descricao")%>"></input>
            
            <button type="submit">OK</button>
        </form>
    </body>
</html>