/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Prabhunath
 */
public class SendKeyToMail extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String filename,email;
            email=request.getParameter("user_mail");
            filename=request.getParameter("file_name");
            Class.forName("com.mysql.jdbc.Driver");
           HttpSession se=request.getSession();
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ibeorcc","root","password");
            //out.println("EMAIL:"+email+"<hr>Filename: "+filename);
            out.println("<table><tr>"
                    +"<td>To</td><td><input type='text' name='email' value='"+email+"'></td>"
                    +"<td>Subject</td><td><input type='text' name='subject' value='Your Private Key for File:"+filename+"'></td>"
                    +"<td>Private Key as Message: </td><td><input type='text'></td>"
                    + "</tr></table>");
            
            
            Statement st=con.createStatement();
            String query="select private_key from csp_files_table where filename='"+filename+"' and email='"+email+"'";
            out.println(query);
            ResultSet rs=st.executeQuery(query);
             String subject="Your Private Key for File: "+filename;
            se.setAttribute("email", email);
            se.setAttribute("subject", subject);
           String msg="";
            if(rs.next())
            {
            se.setAttribute("message", rs.getString(1));
            msg=rs.getString(1);
            }
            out.println("<br>"+email+"<br>"+subject+" <br> "+msg);
            response.sendRedirect("MailDispatcherServlet");
        }
        catch(Exception ee)
        {
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
