package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link type=\"text/css\" href=\"CSS/main.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <div class=\"head\">\n");
      out.write("            <h2>Identity Based Encryption using KU-CSP</h2>\n");
      out.write("        </div>\n");
      out.write("        <table class=\"tbl\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"index.html\">HOME</a>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                     <a href=\"pkglogin.jsp\">PKG</a>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                     <a href=\"csplogin.jsp\">KU-CSP</a>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"userlogin.jsp\"> USER</a>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"userregister.jsp\"> REGISTRATION</a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <hr>\n");
      out.write("        \n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
