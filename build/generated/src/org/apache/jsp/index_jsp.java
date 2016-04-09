package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <style>\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write(" ");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title> Project</title>\n");
      out.write("        <link rel=\"icon\" href=\"../Images/srm_logo.png\" type=\"image/icon\">\n");
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
      out.write("        <div class=\"abs\">\n");
      out.write("            <h2 style=\"text-align:left;\">Abstract:</h2>\n");
      out.write("           <p style=\"font-size: 18px;\">\n");
      out.write("                Identity-Based Encryption (IBE) is an alternative to public key encryption which simplifies the public key at \n");
      out.write("                Public Key Infrastructure (PKI). However, the only drawback of IBE is the overhead computation at Private Key \n");
      out.write("                Generator (PKG) during revocation of user. In traditional PKI setting efficient revocation has been well studied,\n");
      out.write("                but the cumbersome management of private keys is precisely the burden that IBE strives to alleviate. In this paper\n");
      out.write("                objective to tackle the critical issue of identity revocation, we introduce outsourcing computation into IBE for \n");
      out.write("                the propose to reduce the overburden at PKG. Our scheme offloads most of the key generation related operations \n");
      out.write("                during key-issuing and key-update processes to a Key Update Cloud Service Provider, leaving only a constant number \n");
      out.write("                of simple operations for PKG and users to perform locally. This goal is achieved by using KU-CSP: we employ \n");
      out.write("                a hybrid private key which is a combination of identity component and time component for each user.\n");
      out.write("            </p>\n");
      out.write("            \n");
      out.write("            <hr>\n");
      out.write("            <table><tr><td>\n");
      out.write("            <div class=\"guide\">\n");
      out.write("               \n");
      out.write("            </div></td>\n");
      out.write("            <td>\n");
      out.write("                <b>\n");
      out.write("                 Name:M. Rajshekharan<br>       \n");
      out.write("                Designation:Assistant Professor<br> \n");
      out.write("                Area: Computer Science and Engineering<br>\n");
      out.write("                </b>\n");
      out.write("                    </td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("            <hr>\n");
      out.write("            <table><tr><td>\n");
      out.write("            <div class=\"jangu\">\n");
      out.write("                \n");
      out.write("            </div></td><td><b>Name:Ashish Jangu<br>ID No: 1031210332<br>Dept:CSE</b></td>\n");
      out.write("                <td>\n");
      out.write("            <div class=\"pny\">\n");
      out.write("                \n");
      out.write("            </div></td><td><b>Name:Prabhunath Yadav<br>ID No: 1031210334<br>Dept:CSE</b></td>\n");
      out.write("                </tr>\n");
      out.write("                </table>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <b> Final Year Project ,B.Tech CSE, YEAR:2012-2016</b>\n");
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
