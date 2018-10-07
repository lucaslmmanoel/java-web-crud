<%@page import="br.iesb.poo2.bean.LoginBean"%>  
  
<p>Você teve sucesso no login!</p>  
<%  
LoginBean bean=(LoginBean)request.getAttribute("bean");  
out.print("Bem vindo, "+bean.getName());  
%>  

