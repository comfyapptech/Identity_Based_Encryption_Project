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
            <h2>Identity Based Encryption using KU-CSP</h2>
        </div>
        <table class="tbl">
            <tr>
                <td>
                    <a href="csp_home.jsp">CSP HOME</a>
                </td>
                <td>
                    <a href="user_facility_access.jsp">USER FACILITY</a>
                </td>
                <td>
                     <a href="#">CLOUD DOWNLOADS</a>
                </td>
                <td>
                    <a href="key_request.jsp">KEY REQUEST</a>
                </td>
                <td>
                    <a href="logout.jsp"> LOGOUT</a>
                </td>
            </tr>
        </table>
        <hr>
        <div class="abs">
            <div class="welcome"><h2 style="color:red;">UPDATED KEY DISTRIBUTION</h2>
            
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
                                Size
                            </td>
                            <td class="tblrow">
                                Uploaded On
                            </td>
                            <td class="tblrow">
                                Send key
                            </td>
                        </tr>
                    </table>
                </div>
            
            </div>
        </div>
        <hr>
        <div class="footer">
            
        </div>
    </center>
    </body>
</html>