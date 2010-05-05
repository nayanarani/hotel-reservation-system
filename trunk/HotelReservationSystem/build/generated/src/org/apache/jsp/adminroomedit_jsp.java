package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class adminroomedit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write(" <html>\r\n");
      out.write("  <head>\r\n");
      out.write("   <title>edit room</title>\r\n");
      out.write("   <link href=\"CSS/styleHRS.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("   <script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write("    function check2()\r\n");
      out.write("    {\r\n");
      out.write("       if(document.resInfo.newroomname.value==\"\")\r\n");
      out.write("       {\r\n");
      out.write("         alert(\"ID is null!\");\r\n");
      out.write("         resInfo.newroomname.focus();\r\n");
      out.write("         return false;\r\n");
      out.write("       }\r\n");
      out.write("       if(document.resInfo.style.value==\"\")\r\n");
      out.write("       {\r\n");
      out.write("         alert(\"style is null!\");\r\n");
      out.write("         resInfo.style.focus();\r\n");
      out.write("         return false;\r\n");
      out.write("       }\r\n");
      out.write("       if(document.resInfo.cost.value==\"\")\r\n");
      out.write("       {\r\n");
      out.write("         alert(\"cost is null!\");\r\n");
      out.write("         resInfo.cost.focus();\r\n");
      out.write("         return false;\r\n");
      out.write("       }\r\n");
      out.write("       if(document.resInfo.details.value==\"\")\r\n");
      out.write("       {\r\n");
      out.write("         alert(\"detail is null!\");\r\n");
      out.write("         resInfo.details.focus();\r\n");
      out.write("         return false;\r\n");
      out.write("       }\r\n");
      out.write("       document.resInfo.action.value=\"changeRes\";\r\n");
      out.write("       document.resInfo.submit();\r\n");
      out.write("    }\r\n");
      out.write("        function check()\r\n");
      out.write("    {\r\n");
      out.write("       if(document.searchRes.roomname.value==\"\")\r\n");
      out.write("       {\r\n");
      out.write("         alert(\"please input ID\");\r\n");
      out.write("         searchRes.roomname.focus();\r\n");
      out.write("         return false;\r\n");
      out.write("       }\r\n");
      out.write("       document.searchRes.submit();\r\n");
      out.write("    }\r\n");
      out.write("   </script>\r\n");
      out.write("  </head>\r\n");
      out.write(" <body><div align=\"center\"><fieldset><legend>Edit Room informaion</legend>\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("<tr>\r\n");
      out.write("  <td rowspan=\"2\"><table>\r\n");
      out.write("  <th id=\"navigator\">group</th>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><a href=listserv?action=adminList&&groupid=0>all group</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");

      Vector<String[]> vgroup = serv.database.getGroup();
      for(String[] s:vgroup){
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><a href=listserv?action=adminList&&groupid=");
      out.print(s[0]);
      out.write('>');
      out.print( s[1] );
      out.write("</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
}
      out.write("\r\n");
      out.write("  </table></td>\r\n");
      out.write("  <td><table>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td><a target=\"balnk\" href=\"adminroommanage.jsp\">create new room</a></td>\r\n");
      out.write("      <td>Room:\r\n");
      out.write("        <form name=\"searchRes\" action=\"listserv\" method=\"post\">\r\n");
      out.write("          <input type=\"text\" name=\"roomname\">\r\n");
      out.write("          <input type=\"button\" value=\"check\" onclick=\"check()\">\r\n");
      out.write("          <input type=\"hidden\" name=\"action2\" value=\"queryRes\">\r\n");
      out.write("        </form></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table></td></tr>\r\n");
      out.write("<tr><td>");

      Vector<String[]> roominfo =
      	 (Vector<String[]>)request.getAttribute("roominfo");
 	  String []s = roominfo.get(0);
 	
      out.write("\r\n");
      out.write("   <table>\r\n");
      out.write("    <form name=\"resInfo\" action=\"listserv\" method=\"post\">\r\n");
      out.write("     <tr>\r\n");
      out.write("      <td id=\"label\">ID:</td>\r\n");
      out.write("      <td><input type=\"text\" name=\"newroomname\" value=");
      out.print( s[0] );
      out.write("></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("      <td id=\"label\">group:</td>\r\n");
      out.write("      <td>\r\n");
      out.write("       <select name=\"roomgroup\">\r\n");
      out.write("        ");

         for(String ss[]:vgroup)
         {
           if(ss[0].equals(s[7]))
           {
         
      out.write("\r\n");
      out.write("             <option selected value=");
      out.print( ss[0] );
      out.write('>');
      out.print( ss[1] );
      out.write("</option>\r\n");
      out.write("         ");

           }
           else
           {
           
      out.write("\r\n");
      out.write("             <option value=");
      out.print( ss[0] );
      out.write('>');
      out.print( ss[1] );
      out.write("</option>\r\n");
      out.write("           ");

           }
          }
          
      out.write("\r\n");
      out.write("       </select>\r\n");
      out.write("      </td>\r\n");
      out.write("     </tr>\r\n");
      out.write("\r\n");
      out.write("     <tr>\r\n");
      out.write("      <td id=\"label\">style:</td>\r\n");
      out.write("      <td><input type=\"text\" name=\"style\" value=");
      out.print( s[1] );
      out.write("></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("      <td id=\"label\">cost:</td>\r\n");
      out.write("      <td><input type=\"text\" name=\"cost\" value=");
      out.print( s[2] );
      out.write("></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("       <td id=\"label\">detail:</td>\r\n");
      out.write("       <td>\r\n");
      out.write("         <textarea rows=4 cols=40 name=\"details\">");
      out.print( s[3] );
      out.write("</textarea>\r\n");
      out.write("       </td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("      <td id=\"label\">status:</td>\r\n");
      out.write("      <td>\r\n");
      out.write("       <select name=\"status\">\r\n");
      out.write("        <option>empty</option>\r\n");
      out.write("        ");

        if(s[4].equals("used"))
        {
        
      out.write("\r\n");
      out.write("        <option selected>used</option>\r\n");
      out.write("        ");

        }
        else
        {
        
      out.write("\r\n");
      out.write("        <option>used</option>\r\n");
      out.write("        ");

        }
         
      out.write("\r\n");
      out.write("       </select>\r\n");
      out.write("      </td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr><td></td>\r\n");
      out.write("      <td align=\"left\">\r\n");
      out.write("       <input type=\"hidden\" name=\"action\" value=\"deleteRes\">\r\n");
      out.write("       <input type=\"hidden\" name=\"roomid\" value=");
      out.print( s[6] );
      out.write(">\r\n");
      out.write("       <input type=\"hidden\" name=\"oldroomname\" value=");
      out.print( s[0] );
      out.write(">\r\n");
      out.write("       <input type=\"button\" value=\"save\" onclick=\"check2()\">\r\n");
      out.write("       <input type=\"submit\" value=\"delete\">\r\n");
      out.write("       <input type=\"button\" name=\"back\" id=\"back\" value=\"back\" onclick=\"window.location.href='adminroom.jsp'\"></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("    </form>\r\n");
      out.write("   </table></td></tr>\r\n");
      out.write("</table></fieldset>\r\n");
      out.write("<br></div>\r\n");
      out.write(" </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
