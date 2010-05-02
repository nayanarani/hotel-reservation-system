<%-- 
    Document   : roomsearch
    Created on : 2010-5-2, 17:02:53
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

 <html>
  <head>
   <title>search</title>
   <script language="javascript">
   function check()
    {
       if(document.searchRes.roomname.value=="")
       {
         alert("please input id to serach");
         searchRes.roomname.focus();
         return false;
       }
       document.searchRes.submit();
    }
   </script>
  </head>
 <body>
<table><form name="searchRes" action="listserv" method="post">
   <tr>
      <td align="center">
        <a target="balnk" href="adminaddroom.jsp">add room</a>
      </td>

      <td align="right">id:
	    <input type="text" name="roomname">
	    <input type="button" value="check" onclick="check()">
	    <input type="hidden" name="action" value="queryRes">
	  </td>
   </tr>

    </form>
   </table><br><br><br>
   <table>
    <th>Group</th>
    <tr>
     <td align="center">
      <a href=listserv?action=adminList&&groupid=0>All group</a>
     </td>
    </tr>
    <%
      Vector<String[]> vgroup = serv.database.getGroup();
      for(String[] s:vgroup){%>
    <tr><td align="center">
      <a href=listserv?action=adminList&&groupid=<%=s[0]%>><%= s[1] %></a>
    </td></tr>
     <%}%>
</table>
    <%
      Vector<String[]> res =
      	 (Vector<String[]>)request.getAttribute("list");
     if(res==null||res.size()==0)
     {
       out.println("<center>");
	   out.println("<font color=red size=5>no room here</font>");
	   out.println("<br><br><a href="
	     +"listserv?action=adminList&&groupid=room>return</a></center>");
     }
     else
     {
    %>
    <table align="center" width="80%" cellspacing="1" bgcolor="black">
     <tr width="60%" height="30" bgcolor="white">
		<th>ID</th>
		<th>Group</th>
		<th>style</th>
		<th>cost</th>
		<th>details</th>
		<th>status</th>
		<th>edit/del</th>
	 </tr>
	 <%
	 	for(String []s:res)
	    {
	  %>
	  <tr>
	   <td><%= s[0] %></td>
	   <td><%= s[7] %></td>
	   <td><%= s[1] %></td>
	   <td><%= s[2] %>￥</td>
	   <td><%= s[3] %></td>
	   <td><%= s[4] %></td>
	   <td><a href=listserv?action=editRes&&roomid=<%= s[6] %>>edit/del</a></td>
	  </tr>
	  <%
	     }
	  }
	   %></table>
 </body>
</html>
