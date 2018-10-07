package org.apache.jsp.cardapio;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.iesb.poo2.mvc.CardapioController;
import br.iesb.poo2.bean.CardapioBean;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    ");

    CardapioBean cardapio = new CardapioBean();
    CardapioController controllerCategoria = new CardapioController();
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <form action=\"proccess.jsp\" method=\"POST\">\n");
      out.write("\n");
      out.write("            <input type=\"hidden\" id=\"acao\" name=\"acao\" value=\"inserir\" />\n");
      out.write("            <input type=\"hidden\" name=\"id\"/>\n");
      out.write("\n");
      out.write("            <label>Código</label>\n");
      out.write("            <input type=\"text\" name=\"codigo\"/>\n");
      out.write("            \n");
      out.write("            <label>Nome</label>\n");
      out.write("            <input type=\"text\" name=\"nome\"/>\n");
      out.write("            \n");
      out.write("            <label>Descricao</label>\n");
      out.write("            <input type=\"text\" name=\"descricao\"/>\n");
      out.write("            \n");
      out.write("            <label>Quantidade</label>\n");
      out.write("            <input type=\"number\" name=\"qtd\"/>\n");
      out.write("            \n");
      out.write("            <label>Valor de venda</label>\n");
      out.write("            <input type=\"number\" name=\"valor_venda\"/>\n");
      out.write("            \n");
      out.write("            <label>Valor de Compra</label>\n");
      out.write("            <input type=\"number\" name=\"valor_compra\"/>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <input type=\"hidden\" name=\"categorias_id\">\n");
      out.write("            <input type=\"submit\" value=\"enviar\" />\n");
      out.write("\n");
      out.write("        </form>\n");
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
