<%-- 
    Document   : index
    Author     : Liu Chun(HTML) Wang Qi Chen(JSP)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
    <div>
      <table width="1024" border="1">
        <tr>
          <td colspan="2"><h1>Hotel Reservation System</h1></td>
        </tr>
        <tr>
          <td colspan="2">navigator</td>
        </tr>
        <tr>
          <td width="200">left side frame</td>
          <td width="808">
              	<table border="0" width="80%">
	 <%Vector<String[]> v = serv.database.getGroup();
	   for(String []s:v){%>
	 <tr><td colspan="2" align="center"><%=s[0]%></td></tr>
	 <tr>
	   <td>
	     <a href=listserv?action=list&&groupid=<%=s[3]%>>
	      <img src=<%=s[1]%> width="250" height="100" border="0"/></a>
	   </td>
	   <td align="left">
	      <%=s[2]%><br/>	     
	       <a href=listserv?action=list&&groupid=<%=s[3]%>><%="Book"+s[0]%>>></a>
	   </td>
	  </tr>
	  <%}%>
	</table>
          </td>
        </tr>
      </table>
    </div>
    </body>
</html>
