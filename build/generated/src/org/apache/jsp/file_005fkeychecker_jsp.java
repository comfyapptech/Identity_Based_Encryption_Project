package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class file_005fkeychecker_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

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
      out.write("    \n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        ");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link type=\"text/css\" href=\"CSS/main.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <div class=\"head\">\n");
      out.write("            <h2>Identity Based Encryption using KU-CSP</h2>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <hr>\n");
      out.write("        \n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("        <table class=\"tbl\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"#\">USER HOME</a>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                     <a href=\"#\">UPLOAD </a>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                     <a href=\"#\">FILE VIEW</a>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"#\"> LOGOUT</a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <hr>\n");
      out.write("        <div style=\"border:2px solid green; height:400px;border-radius:30px;\">\n");
      out.write("            <div class=\"innerdiv\">\n");
      out.write("                 <h2>Provide your key</h2>\n");
      out.write("                <table>\n");
      out.write("                    <form>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"text\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"submit\" value=\"Submit\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </form>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <br><br><br><br>\n");
      out.write("            ATTACH IMAGE HERE\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            \n");
      out.write("        </div>\n");
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
