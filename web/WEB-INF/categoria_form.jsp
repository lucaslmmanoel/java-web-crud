<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FODEO</title>
    </head>
    <body>
        <div class="container">
            <div class="card">
                <div class="card-content">
                    <span class="card-title activator grey-text text-darken-4"><i class="material-icons right">more_vert</i></span>
                    <form action="session.jsp" method="get">
                        <input type="text" id="nome" name="nome" placeholder="Nome" />
                        <button type="submit" class="btn btn-block blue">Enviar</button>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
