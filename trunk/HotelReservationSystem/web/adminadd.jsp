<%-- 
    Document   : adminadd
    Created on : 2010-3-28, 15:01:40
    Author     : Liu Chun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>add admin</title>
    </head>
    <body>
    <div>
      <table width="381" border="1"><form name="adminadd" action="adminaddserv" method="post">
        <tr>
          <td width="115">admin username:</td>
          <td width="250"><label>
            <input type="text" name="adminusername" id="adminusername">
          </label></td>
        </tr>
        <tr>
          <td>admin password:</td>
          <td><label>
            <input type="text" name="adminpassword" id="adminpassword">
          </label></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><label>
            <input type="submit" name="submit" id="submit" value="submit">
          </label></td>
        </tr></form>
      </table>
    </div>

    </body>
</html>
