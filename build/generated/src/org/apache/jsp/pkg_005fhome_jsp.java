package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pkg_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <style>\n");
      out.write("            .head{\n");
      out.write("                border: 2px solid green;\n");
      out.write("                border-radius:20px;\n");
      out.write("                width:80%;\n");
      out.write("                text-align:center;\n");
      out.write("                background-color:green; \n");
      out.write("            }\n");
      out.write("            .abs{\n");
      out.write("                border: 2px solid green;\n");
      out.write("                border-radius: 30px;\n");
      out.write("            }\n");
      out.write("            .tbl td\n");
      out.write("            {\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("            .footer\n");
      out.write("            {\n");
      out.write("                width:100%;\n");
      out.write("                height:30px;\n");
      out.write("                border:1px solid white;\n");
      out.write("                background-color:green;\n");
      out.write("                margin-top:20px;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .welcome\n");
      out.write("            {\n");
      out.write("                width:80%;\n");
      out.write("                height:300px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <div class=\"head\">\n");
      out.write("            <h2>Identity-Based Encryption with Outsourced Revocation in Cloud Computing</h2>\n");
      out.write("        </div>\n");
      out.write("        <table class=\"tbl\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"#\">PKG HOME</a>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                     <a href=\"#\">OUTSOURCE KEY</a>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                     <a href=\"#\">PRIVATE KEY</a>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"#\"> LOGOUT</a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <hr>\n");
      out.write("        <div class=\"abs\">\n");
      out.write("            <div class=\"welcome\">WELCOME TO PKG HOME<br><br><br><br>ATTACH IMAGE</div>\n");
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
