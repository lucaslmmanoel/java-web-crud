<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! String user, pass; %>
<!DOCTYPE html>
<%
if(request.getParameter("bootsubmit") != null && request.getParameter("bootsubmit").equals("TRUE")){
    user = request.getParameter("user");
    pass = request.getParameter("pass");
    if(user.equals("teste") && pass.equals("teste"))
        response.sendRedirect("welcome.jsp");
    }
    else{
    response.sendRedirect("falha.jsp");
    }

%>

<html xmlns:h="http://xmlns.jcp.org/jsf/html" xmlns:f="http://xmlns.jcp.org/jsf/core">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="login.jsp" method="POST">
            
            <label>Login:</label>
            <input type="text" name=""/>
            
            <label>Password:</label>
            <input type="password" name=""/>
            <button type="submit" name="bootsubmit" value="TRUE">OK</button>
        </form>
    </body>
</html>
