<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<html>
    <style>
            .head{
                border: 2px solid green;
                border-radius:20px;
                width:80%;
                text-align:center;
                background-color:green; 
            }
            .abs{
                border: 2px solid green;
                border-radius: 30px;
            }
            .tbl td
            {
                padding: 20px;
            }
            .footer
            {
                width:100%;
                height:30px;
                border:1px solid white;
                background-color:green;
                margin-top:20px;
                
                
            }
            .welcome
            {
                width:80%;
                height:300px;
            }
            .tbltr
            {
                color: green;
                width:100%;
                text-align: center;
            }
            .tblrow
            {
                width: 150px;
            }
            .innerdiv
            {
                border: 1px solid black;
                border-radius: 50px;
            }
        </style>
    <body>
    <center>
        <div class="head">
            <h2>Identity-Based Encryption with Outsourced Revocation in Cloud Computing</h2>
        </div>
        <table class="tbl">
            <tr>
                <td>
                    <a href="pkg_home.jsp">PKG HOME</a>
                </td>
                <td>
                    <a href="outsource_key.jsp">OUTSOURCE KEY</a>
                </td>
                <td>
                    <a href="private_key.jsp">PRIVATE KEY</a>
                </td>
                <td>
                    <a href="logout.jsp"> LOGOUT</a>
                </td>
            </tr>
        </table>
        <hr>
        <div class="abs">
            <div class="welcome"><h2 style="color:red;">SEND OUTSOUREKEY</h2>
            
                <div class="innerdiv">
                    <table>
                        <tr class="tbltr">
                            <td class="tblrow">
                                File Name
                            </td>
                            <td class="tblrow">
                                Owner
                            </td>
                            <td class="tblrow">
                                File Size
                            </td>
                            <td class="tblrow">
                                Uploaded On
                            </td>
                          <!--  <td class="tblrow">
                                Request key
                            </td>  -->
                        </tr>
                        <%
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ibeorcc","root","password");
                        String query="select * from userfile";
                        Statement st=con.createStatement();
                        ResultSet rs=st.executeQuery(query);
                        while(rs.next())
                        {
                        out.println("<tr style='text-align:center;'><td>"+rs.getString("file_name")+"</td><td>"+rs.getString("email")+"</td><td>"+
                        rs.getString("size")+"</td><td>"+rs.getString("upload_date")+"</td></tr>");
                        
                        }
                        
                        
                        
                        
                        
                        %>
                        
                    </table>
                        <form method="POST" action="OutSourceToCloud">
                            <table>
                                <tr>
                                    <td>File Name: </td><td><input type='text' name='file_name'></td>
                                </tr>
                                <tr>
                                    <td>Owner Email: </td><td><input type='text' name='owner_email'></td>
                                </tr>
                                <tr>
                                    <td></td><td><input type='submit' value='Out Source Key To Cloud'></td>
                                </tr>
                            </table>
                        </form>
                </div>
            
            </div>
        </div>
        <hr>
        <div class="footer">
            
        </div>
    </center>
    </body>
</html>