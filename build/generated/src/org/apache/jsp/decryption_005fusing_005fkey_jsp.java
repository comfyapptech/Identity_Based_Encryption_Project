package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class decryption_005fusing_005fkey_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                margin-top:200px;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .welcome\n");
      out.write("            {\n");
      out.write("                width:80%;\n");
      out.write("                height:300px;\n");
      out.write("            }\n");
      out.write("            .innerdiv\n");
      out.write("            {\n");
      out.write("                border: 1px solid black;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                width:1200px;\n");
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
      out.write("                    <a href=\"user_profile.jsp\">USER HOME</a>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                     <a href=\"upload.jsp\">UPLOAD </a>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                     <a href=\"user_fileview.jsp\">FILE VIEW</a>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"logout.jsp\"> LOGOUT</a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        ");

        Class.forName("com.mysql.jdbc.Driver");
       HttpSession se=request.getSession();
       String Email=(String)se.getAttribute("u_email");
       String fname=(String)se.getAttribute("file_name");
       se.setAttribute("u_email",Email);
       se.setAttribute("file_name",fname);        
       out.println("<hr>Email: "+Email+"<hr>Key Sent For File Name: "+fname);
       
      out.write("\n");
      out.write("       \n");
      out.write("        <hr>\n");
      out.write("        <div style=\"border:2px solid green; height:400px;border-radius:30px; background-image:url('Images/encrypt.jpg');background-size: 1350px 400px;background-repeat: no-repeat; \">\n");
      out.write("            <div class=\"innerdiv\" style=\"display:table;\">\n");
      out.write("                 <h2 style=\"color:white;\">Enter Key </h2>\n");
      out.write("            </td>\n");
      out.write("              <td>    \n");
      out.write("                   \n");
      out.write("                <table style=\"background-color:white;color:red;opacity: 0.6; \">\n");
      out.write("                    <form method=\"POST\" action=\"DecryptData\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Enter Private Key Sent to your Mail:</td> <td><input style=\"background-color:white;\" type=\"text\" name=\"private_key\"></td>\n");
      out.write("                             </tr>\n");
      out.write("                              \n");
      out.write("                              <tr>\n");
      out.write("                                  <td></td> <td><input type=\"submit\" value=\"Submit Key!!\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                            \n");
      out.write("                        \n");
      out.write("                    </form>\n");
      out.write("                </table>  \n");
      out.write("              </td>\n");
      out.write("                     </tr>\n");
      out.write("                 \n");
      out.write("               </div>\n");
      out.write("            .\n");
      out.write("        </div>\n");
      out.write("        \n");
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
