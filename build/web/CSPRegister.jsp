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
                margin-top:80px;
                
                
            }
            .form
            {
                display: inline-table;
                height:300px;
                border:1px solid white;
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
                    <a href="index.html">HOME</a>
                </td>
                <td>
                     <a href="pkglogin.jsp">PKG</a>
                </td>
                <td>
                     <a href="csplogin.jsp">KU-CSP</a>
                </td>
                <td>
                    <a href="userlogin.jsp"> USER</a>
                </td>
                <td>
                    <a href="userregister.jsp"> REGISTRATION</a>
                </td>
            </tr>
        </table>
        <hr>
        <div class="form" style="width:90%;">
            <div class="form" style="width:30%; background-color:green;background-image: url('Images/register.png'); background-repeat: no-repeat; background-size:400px 300px;">.</div>
            <div class="form" style="width:30%;margin-top: 20px;">
                <br>  
                <h3>CSP REGISTRATION</h3>
                <hr style="width:200px;">
                <table>
                    
                    <form method="POST" action="CSPRegistration">
                        
                        <tr>
                            <td>USER NAME</td><td><input type="text" name="user_name"></td>
                        </tr>
                        <tr>
                            <td>PASSWORD</td><td><input type="password" name="password" ></td>
                        </tr>
                        <tr>
                            <td><input type="button" value="RESET"></td><td><input type="submit" value="REGISTER"></td>
                        </tr>
                    </form>
                </table>
                
            </div>
            <div class="form" style="width:32.6%; background-color:green;background-image: url('Images/register2.png'); background-repeat: no-repeat; background-size:400px 300px;">.</div>
        </div>
        <hr>
        <div class="footer">
            
        </div>
    </center>
    </body>
</html>