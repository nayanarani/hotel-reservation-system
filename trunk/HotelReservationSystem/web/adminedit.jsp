<%-- 
    Document   : adminedit
    Author     : Tang Wanjian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <div>
      <table width="362" border="1">
        <tr>
          <td width="176">admin old password:</td>
          <td width="170"><label>
            <input type="text" name="adminoldpassword" id="adminoldpassword">
          </label></td>
        </tr>
        <tr>
          <td>admin new password:</td>
          <td><label>
            <input type="text" name="adminnewpassword" id="adminnewpassword">
          </label></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><label>
            <input type="submit" name="submit" id="submit" value="submit">
          </label></td>
        </tr>
      </table>
    </div>

    </body>
</html>
