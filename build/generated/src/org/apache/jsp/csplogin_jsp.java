package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class csplogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("    <style>\r\n");
      out.write("            .head{\r\n");
      out.write("                border: 2px solid green;\r\n");
      out.write("                border-radius:20px;\r\n");
      out.write("                width:80%;\r\n");
      out.write("                text-align:center;\r\n");
      out.write("                background-color:green; \r\n");
      out.write("            }\r\n");
      out.write("            .abs{\r\n");
      out.write("                border: 2px solid green;\r\n");
      out.write("                border-radius: 30px;\r\n");
      out.write("            }\r\n");
      out.write("            .tbl td\r\n");
      out.write("            {\r\n");
      out.write("                padding: 20px;\r\n");
      out.write("            }\r\n");
      out.write("            .footer\r\n");
      out.write("            {\r\n");
      out.write("                width:100%;\r\n");
      out.write("                height:30px;\r\n");
      out.write("                border:1px solid white;\r\n");
      out.write("                background-color:green;\r\n");
      out.write("                margin-top:80px;\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("            .form\r\n");
      out.write("            {\r\n");
      out.write("                display: inline-table;\r\n");
      out.write("                height:300px;\r\n");
      out.write("                border:1px solid white;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    <body>\r\n");
      out.write("    <center>\r\n");
      out.write("        <div class=\"head\">\r\n");
      out.write("            <h2>Identity Based Encryption using KU-CSP</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("        <table class=\"tbl\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <a href=\"index.jsp\">HOME</a>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td>\r\n");
      out.write("                     <a href=\"pkglogin.jsp\">PKG</a>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td>\r\n");
      out.write("                     <a href=\"csplogin.jsp\">KU-CSP</a>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <a href=\"userlogin.jsp\"> USER</a>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <a href=\"userregister.jsp\"> REGISTRATION</a>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        <hr>\r\n");
      out.write("        <div class=\"form\" style=\"width:90%;\">\r\n");
      out.write("            <div class=\"form\" style=\"width:30%; background-color:green;background-image: url('Images/user_2.png'); background-repeat: no-repeat; background-size:400px 300px;\">.</div>\r\n");
      out.write("            <div class=\"form\" style=\"width:30%;margin-top: 20px;\">\r\n");
      out.write("                <br><br><br><br>    \r\n");
      out.write("                <h3>KU-CSP Login</h3>\r\n");
      out.write("                <hr style=\"width:200px;\">\r\n");
      out.write("                <table>\r\n");
      out.write("                    \r\n");
      out.write("                    <form method=\"POST\" action=\"CSPLogin\">\r\n");
      out.write("                        \r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>USER NAME</td><td><input type=\"text\" name=\"user_name\"></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>PASSWORD</td><td><input type=\"password\" name=\"password\" ></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td></td><td><input type=\"submit\" value=\"LOGIN\"></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form\" style=\"width:30%; background-color:green;background-image: url('Images/user_2.png'); background-repeat: no-repeat; background-size:400px 300px;\">.</div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <hr>\r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("    </center>\r\n");
      out.write("    </body>\r\n");
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
