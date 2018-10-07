package org.apache.jsp.cardapio;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import br.iesb.poo2.mvc.CardapioController;
import br.iesb.poo2.bean.CardapioBean;

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
      response.setContentType("text/html");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../struct/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");

    CardapioController cardapio = new CardapioController();
    List<CardapioBean> Lista;
    Lista = cardapio.Listar();

      out.write("\n");
      out.write("\n");
      out.write("<h1>Cardapios</h1>\n");
      out.write("<a href=\"form.jsp\">Novo Registro</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("<table border=\"1\">\n");
      out.write("    <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>Código</th>\n");
      out.write("            <th>Nome</th>\n");
      out.write("            <th>Descrição</th>\n");
      out.write("            <th>Açoes</th>\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    \n");
      out.write("    <tbody>\n");
      out.write("        ");

            for (CardapioBean registros : Lista) {
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td> ");
      out.print( registros.getCodigo());
      out.write(" </td>\n");
      out.write("            <td> ");
      out.print( registros.getNome());
      out.write(" </td>\n");
      out.write("            <td> ");
      out.print( registros.getDescricao());
      out.write(" </td>\n");
      out.write("            <td><a href=\"form_update.jsp?id=");
      out.print(registros.getCodigo());
      out.write("\">Alterar</a>|<a href=\"delete.jsp?id=");
      out.print(registros.getCodigo());
      out.write("\">Excluir</a></td>\n");
      out.write("        </tr>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../struct/footer.jsp", out, false);
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
