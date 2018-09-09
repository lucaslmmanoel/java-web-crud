package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Produto;
import dao.ProdutoDAO;
import java.util.ArrayList;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"index.jsp\" method=\"POST\">\n");
      out.write("            <label>Descricação: </label>\n");
      out.write("            <input type=\"text\" name=\"descricao\" ></input>\n");
      out.write("            <button type=\"submit\">\n");
      out.write("                OK\n");
      out.write("            </button>\n");
      out.write("        </form>\n");
      out.write("        ");

            try {
                out.print("<table>");
                out.print("<tr>");
                out.print("<th>Código</th> <th>Descrição</th> <th>Preço</th>");
                ProdutoDAO prod = new ProdutoDAO();
                if (request.getParameter("descricao") == "" || request.getParameter("") == "") {
                    ArrayList<Produto> lista = prod.listarTodos();
                    for (int num = 0; num < lista.size(); num++) {
                        out.print("<tr>");
                        out.print("<td>" + lista.get(num).getCdg_produto() + "</td>");
                        out.print("<td>" + lista.get(num).getDescr_produto() + "</td>");
                        out.print("<td>" + lista.get(num).getPreco_produto() + "</td>");
                        out.print("<td><a href='alterar.jsp?codigo="+lista.get(num).getCdg_produto()+"&descricao="+
                                lista.get(num).getDescr_produto()+"&preco="+lista.get(num).getPreco_produto()+
                                ">Alterar</a></td>");
out.print("<td><a href='excluir.jsp?codigo="+lista.get(num).getCdg_produto()+"&descricao="+
                                lista.get(num).getDescr_produto()+
                                ">Excluir</a></td>");
                        out.print("</tr>");
                    }
                }else{
                    ArrayList<Produto> lista = prod.listarTodosDescricao(request.getParameter("descricao"));
                    for (int num = 0; num < lista.size(); num++) {
                        out.print("<tr>");
                        out.print("<td>" + lista.get(num).getCdg_produto() + "</td>");
                        out.print("<td>" + lista.get(num).getDescr_produto() + "</td>");
                        out.print("<td>" + lista.get(num).getPreco_produto() + "</td>");
                        out.print("<td><a href='alterar.jsp?codigo="+lista.get(num).getCdg_produto()+"&descricao="+
                                lista.get(num).getDescr_produto()+"&preco="+lista.get(num).getPreco_produto()+
                                ">Alterar</a></td>");
out.print("<td><a href='excluir.jsp?codigo="+lista.get(num).getCdg_produto()+"&descricao="+
                                lista.get(num).getDescr_produto()+
                                ">Excluir</a></td>");
                        out.print("</tr>");
                    }
                }
                out.print("</tr>");

                out.print("</table>");

            } catch (Exception e) {
                throw new RuntimeException("Erro 10", e);
            }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
