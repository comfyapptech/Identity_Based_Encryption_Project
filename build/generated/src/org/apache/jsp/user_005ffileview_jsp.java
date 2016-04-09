package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class user_005ffileview_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
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
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ibeorcc","root","password");
       String email=(String)se.getAttribute("User_Email");
       out.println("<h3>Welcome @"+email+"</h3>");
       String password=(String)se.getAttribute("User_Password");
       String query="select email,file_name,size,upload_date from userfile";
       Statement pst=con.createStatement();
       ResultSet rs=pst.executeQuery(query);
       
      out.write("\n");
      out.write("       \n");
      out.write("        <hr>\n");
      out.write("        <div style=\"border:2px solid green; height:400px;border-radius:30px; background-image:url('Images/encrypt.jpg');background-size: 1350px 400px;background-repeat: no-repeat; \">\n");
      out.write("            \n");
      out.write("            <div class=\"innerdiv\" style=\"display:table;\">\n");
      out.write("                 <h2 style=\"color:white;\">Uploaded Files</h2>\n");
      out.write("                 \n");
      out.write("                 <table>\n");
      out.write("                     <tr><td>\n");
      out.write("                <table style=\"text-align:center;color:white;width:800px;border:2px solid white; border-radius:12px; \">\n");
      out.write("                    <tr><td>User Email</td><td>File Name</td><td>Size </td><td>Uploaded on Date </td></tr>\n");
      out.write("                    ");

                    while(rs.next())
                    {
                        out.println("<tr style='background-color:grey;color:greenyellow; '><td>"+rs.getString(1)+"</td><td> "+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");
                    }
       
      out.write("\n");
      out.write("                </table>\n");
      out.write("            \n");
      out.write("            </td>\n");
      out.write("              <td>    \n");
      out.write("                   \n");
      out.write("                <table style=\"background-color:white;color:red;opacity: 0.6; \">\n");
      out.write("                    <form method=\"POST\" action=\"SendKeyToMail\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>File Name</td> <td><input style=\"background-color:white;\" type=\"text\" name=\"file_name\"></td>\n");
      out.write("                             </tr>\n");
      out.write("                              <tr>\n");
      out.write("                            <td>User Email</td> <td><input type=\"text\" name=\"user_mail\"></td>\n");
      out.write("                             </tr>\n");
      out.write("                              <tr>\n");
      out.write("                            <td></td> <td><input type=\"submit\" value=\"Request Key!!\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                    </form>\n");
      out.write("                </table>  \n");
      out.write("              </td>\n");
      out.write("                     </tr>\n");
      out.write("                 </table>\n");
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
