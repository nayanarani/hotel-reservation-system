<%-- 
    Document   : reg
    Author     : Tang Wan Jian(HTML) Wang Qi Chen(JSP)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
        <script language="JavaScript">
        function checkinformation(){
         if(document.reg.username.value==""){
             alert("plase input your username!");
             reg.username.focus();
             return false;
             }
         if(document.reg.password.value==""){
             alert("please input your password!");
             return false;
         }
         if(document.reg.realname.value==""){
             alert("please input your real name!");
             return false;
         }
         if(document.reg.email.value==""){
             alert("please input your email address!");
             return false;
         }
         if(document.reg.telephone.value==""){
             alert("please input yoru telephone number");
             return false;
         }
         document.reg.submit();
     }
        </script>
    </head>
    <body>
        <div>
          <table width="200" border="1">
              <form name="reg" action="regserv" method="post">
            <tr>
              <td>Username: </td>
              <td><label>
                <input type="text" name="username" id="username">
              </label></td>
            </tr>
            <tr>
              <td>Password:</td>
              <td><label>
                <input type="text" name="password" id="password">
              </label></td>
            </tr>
            <tr>
              <td>Real name:</td>
              <td><label>
                <input type="text" name="realname" id="realname">
              </label></td>
            </tr>
            <tr>
              <td>Gender:</td>
              <td><label>
                <select name="gender" id="gender">
                  <option value="male">male</option>
                  <option value="female">female</option>
                </select>
              </label></td>
            </tr>
            <tr>
              <td>E-mail:</td>
              <td><label>
                <input type="text" name="email" id="email">
              </label></td>
            </tr>
            <tr>
              <td>Telephone:</td>
              <td><label>
                <input type="text" name="telephone" id="telephone">
              </label></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td><label>
                <input type="hidden" name="action" value="reg">
                <input type="submit" name="submit" id="submit" value="submit" onclick="checkinformation()">
              </label></td>
            </tr>
            </form>
          </table>
        </div>
        <h1>&nbsp;</h1>
    </body>
</html>
