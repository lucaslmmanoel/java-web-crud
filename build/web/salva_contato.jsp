<%@page import="com.sun.xml.rpc.processor.modeler.j2ee.xml.javaIdentifierType"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <jsp:useBean id="contato" class="model.Contato" scope="session"/>
        <jsp:setProperty name="contato" property="*" />
        
        <a href="listar_contatos.jsp">Ver Contatos</a>

    </body>
</html>
