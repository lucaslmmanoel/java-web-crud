
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <form action="executa_inserir.jsp" method="POST">
      <!--      <label>Código:</label>
            <input type="text" name="codigo"></input>
          -->  
            <label>Descrição:</label>
            <input type="text" name="descricao"></input>
            
            <label>Preço:</label>
            <input type="text" name="preco"></input>
            <button type="submit">OK</button>
        </form>
    </body>
</html>
