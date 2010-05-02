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
        <script language="javascript" type="text/javascript">
            function checkadmininformation() {
     if(document.adminedit.adminusername.value=="")
      {
         alert("please input admin username");
         adminedit.adminusername.focus();
         return false;
      }
     if(document.adminedit.adminoldpassword.value=="")
      {
         alert("please input admin old password");
         adminedit.adminoldpassword.focus();
         return false;
      }
     if(document.adminedit.adminnewpassword.value=="")
      {
         alert("please input admin new password");
         adminedit.adminoldpassword.focus();
         return false;
      }
         document.adminedit.submit();
            }
        </script>
    </head>
    <body>
    <div>
      <table>
          <form name="adminedit" action="admineditserv" method="post">
        <tr>
          <td>admin username:</td>
          <td><label>
            <input type="text" name="adminusername" id="adminusername">
          </label></td>
        </tr>
        <tr>
          <td>admin old password:</td>
          <td><label>
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
          <td></td>
          <td><label>
                  <input type="hidden" name="action" value="adminedit">
                  <input type="submit" name="submit" id="submit" value="submit" onclick="checkadmininformation()">
          </label></td>
        </tr></form>
      </table>
    </div>

    </body>
</html>
