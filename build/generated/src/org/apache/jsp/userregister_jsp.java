package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userregister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                margin-top:80px;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .form\n");
      out.write("            {\n");
      out.write("                display: inline-table;\n");
      out.write("                height:300px;\n");
      out.write("                border:1px solid white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <div class=\"head\">\n");
      out.write("            <h2>Identity Based Encryption using KU-CSP</h2>\n");
      out.write("        </div>\n");
      out.write("        <table class=\"tbl\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"index.jsp\">HOME</a>\n");
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
      out.write("        <div class=\"form\" style=\"width:90%;\">\n");
      out.write("            <div class=\"form\" style=\"width:30%; background-color:green;background-image: url('Images/register.png'); background-repeat: no-repeat; background-size:400px 300px;\">.</div>\n");
      out.write("            <div class=\"form\" style=\"width:30%;margin-top: 20px;\">\n");
      out.write("                <br>  \n");
      out.write("                <h3>USER REGISTRATION</h3>\n");
      out.write("                <hr style=\"width:200px;\">\n");
      out.write("                <table>\n");
      out.write("                    \n");
      out.write("                    <form method=\"POST\" action=\"UserRegister\">\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td>USER NAME</td><td><input type=\"text\" name=\"user_name\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>EMAIL</td><td><input type=\"text\" name=\"email\" ></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>PASSWORD</td><td><input type=\"password\" name=\"password\" ></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>CONTACT</td><td><input type=\"text\" name=\"contact\" ></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>LOCATION</td><td><input type=\"text\" name=\"location\" ></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"button\" value=\"RESET\"></td><td><input type=\"submit\" value=\"REGISTER\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </form>\n");
      out.write("                </table>\n");
      out.write("                ");

                    String name=request.getParameter("user_name");
                    //out.println("<p style='color:black;'>Hi there!!</p>");
                    if(session.getAttribute("msg") != null)
                    {
                        //out.println("<p style='color:black;'>Hi there!!</p>");
                    HttpSession se=request.getSession();
                    String message = (String)se.getAttribute("msg");
                    out.println("<p style='color:black;'>"+message+"</p>");
                    }
                    
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form\" style=\"width:32.6%; background-color:green;background-image: url('Images/register2.png'); background-repeat: no-repeat; background-size:400px 300px;\">.</div>\n");
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
