<%-- 
    Document   : adminadd
    Author     : Liu Chun Wang Qichen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>add admin</title>
        <script language="javascript" type="text/javascript">
        function checkadminreg(){
            if(document.adminadd.adminusername.value=="")
      {
         alert("please input the admin username.");
         adminadd.adusername.focus();
         return false;
      }

      if(document.adminadd.adminusername.value=="")
      {
         alert("please input the admin password.");
         adminadd.adminpassword.focus();
         return false;
      }
      document.adminadd.submit();
        }
</script>
    </head>
    <body>
    <div>
      <table><form name="adminadd" action="adminaddserv" method="post">
        <tr>
          <td>admin username:</td>
          <td><label>
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
            <input type="hidden" name="action" value="adminadd">
            <input type="submit" name="submit" id="submit" value="submit" onclick="checkadminreg()">
          </label></td>
        </tr></form>
      </table>
    </div>

    </body>
</html>
