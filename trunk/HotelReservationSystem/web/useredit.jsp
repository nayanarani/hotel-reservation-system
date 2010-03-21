<%-- 
    Document   : edituser
    Author     : Tang Wan Jian(HTML) Wang Qi Chen(JSP)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script language="Javascript">
            function checkpassword(){
       if(document.useredit.oldpassword.value=="")
       {
         alert("please input your current password!");
         useredit.oldpassword.focus();
         return false;
       }

       if(document.useredit.newpassword.value=="")
       {
         alert("please input your new password!");
         useredit.oldpassword.focus();
         return false;
       }
            }
         function checkinformation(){
             
         }
        </script>
    </head>
    <body>
        <div>
            <table width="320" border="1">
                <form name="changepassword" action="changepasswordserv" method="post">
                <tr>
                    <td>old password:</td>
                    <td><label>
                            <input type="text" name="oldpassword" id="oldpassword">
                        </label></td>
                </tr>
                <tr>
                    <td>new password:</td>
                    <td><label>
                            <input type="text" name="new password" id="new password">
                        </label></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td><label>
                            <input type="submit" name="submit" id="submit" value="submit" onclick="checkPassword()">
                        </label></td>
                </tr></form>
            </table>
            <hr />



            <table width="200" border="1">
                <tr>
                    <td width="76">real name:</td>
                    <td width="108"><label>
                            <input type="text" name="realname" id="realname">
                        </label></td>
                </tr>
                <tr>
                    <td>gender:</td>
                    <td><label>
                            <select name="gender" id="gender">
                            </select>
                        </label></td>
                </tr>
                <tr>
                    <td>email:</td>
                    <td><label>
                            <input type="text" name="email" id="email">
                        </label></td>
                </tr>
                <tr>
                    <td>telephone:</td>
                    <td><label>
                            <input type="text" name="telephone" id="telephone">
                        </label></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td><input type="submit" name="submit" id="submit" value="submit"></td>
                </tr>
            </table>
        </div>

    </body>
</html>
