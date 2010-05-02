<%-- 
    Document   : adminroomgroup
    Created on : 2010-4-30, 15:26:11
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
   <title>managegroup</title>
   <script language="JavaScript" type="text/javascript">
    function check()
    {
      if(document.addGroup.groupname.value=="")
      {
         alert("group name is null!");
         addGroup.groupname.focus();
         return false;
      }
      if(document.addGroup.groupimage.value=="")
      {
         alert("URL is NULL");
         addGroup.groupimage.focus();
         return false;
      }
      if(document.addGroup.groupdetails.value=="")
      {
         alert("details is NULL");
         addGroup.groupdetails.focus();
         return false;
      }
      if(document.addGroup.grouprules.value=="")
      {
         alert("rules is NULL!");
         addGroup.grouprules.focus();
         return false;
      }
      document.addGroup.submit();
    }
   </script>
  </head>
 <body>
    <%
      Vector<String> groupinfo =
      	 (Vector<String>)request.getAttribute("groupinfo");
 	%>
   <center>
    input correct information
   </center>
   <table align="center" border="0" width="60%">
    <form name="addGroup" action="listserv" method="post">
     <tr bgcolor="ffeeee">
      <td align="right" width="20%">group name:</td>
      <td><input type="text" name="groupname"></td>
     </tr>

     <tr>
      <td align="right">IMGURL:</td>
      <td><input type="text" name="groupimage"></td>
     </tr>

     <tr>
      <td align="right">detail:</td>
      <td>
        <textarea rows=6 cols=50 name="groupdetails"></textarea>
      </td>
     </tr>
     <tr>
      <td>rule:</td>
      <td>
        <textarea rows=6 cols=50 name="grouprules"></textarea>
      </td>
     </tr>
     <tr bgcolor="ffeeee"><td></td>
      <td align="left">
       <input type="hidden" name="action" value="addGroup">
       <input type="submit" value="add" onclick="check()">
       <input type="reset" value="reset">
      </td>
     </tr>
    </form>
   </table><br>
 </body>
</html>
