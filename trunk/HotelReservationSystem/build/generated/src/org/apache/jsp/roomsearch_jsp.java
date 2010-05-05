package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class roomsearch_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write(" <html>\r\n");
      out.write("  <head>\r\n");
      out.write("   <title>search</title>\r\n");
      out.write("   <link href=\"css/styleHRS.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("   <script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("   function check()\r\n");
      out.write("    {\r\n");
      out.write("       if(document.searchRes.roomname.value==\"\")\r\n");
      out.write("       {\r\n");
      out.write("         alert(\"please input id to serach\");\r\n");
      out.write("         searchRes.roomname.focus();\r\n");
      out.write("         return false;\r\n");
      out.write("       }\r\n");
      out.write("       document.searchRes.submit();\r\n");
      out.write("    }\r\n");
      out.write("   </script>\r\n");
      out.write("  </head>\r\n");
      out.write(" <body><div align=\"center\">\r\n");
      out.write("<table>\r\n");
      out.write("<tr><td rowspan=\"2\"><table>\r\n");
      out.write("    <th id=\"navigator\">Group</th>\r\n");
      out.write("    <tr>\r\n");
      out.write("     <td align=\"center\">\r\n");
      out.write("      <a href=listserv?action=adminList&&groupid=0>All group</a>\r\n");
      out.write("     </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    ");

      Vector<String[]> vgroup = serv.database.getGroup();
      for(String[] s:vgroup){
      out.write("\r\n");
      out.write("    <tr><td align=\"center\">\r\n");
      out.write("      <a href=listserv?action=adminList&&groupid=");
      out.print(s[0]);
      out.write('>');
      out.print( s[1] );
      out.write("</a>\r\n");
      out.write("    </td></tr>\r\n");
      out.write("     ");
}
      out.write("\r\n");
      out.write("</table></td><td><table><form name=\"searchRes\" action=\"listserv\" method=\"post\">\r\n");
      out.write("   <tr>\r\n");
      out.write("      <td align=\"center\">\r\n");
      out.write("        <a target=\"balnk\" href=\"adminaddroom.jsp\">add room</a>\r\n");
      out.write("      </td>\r\n");
      out.write("\r\n");
      out.write("      <td align=\"right\">Room:\r\n");
      out.write("\t    <input type=\"text\" name=\"roomname\">\r\n");
      out.write("\t    <input type=\"button\" value=\"check\" onclick=\"check()\">\r\n");
      out.write("\t    <input type=\"hidden\" name=\"action\" value=\"queryRes\">\r\n");
      out.write("\t  </td>\r\n");
      out.write("   </tr>\r\n");
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write("   </table></td></tr>\r\n");
      out.write("<tr><td>    ");

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
    
      out.write("\r\n");
      out.write("    <table align=\"center\" width=\"80%\" cellspacing=\"1\" border=\"1\">\r\n");
      out.write("     <tr width=\"60%\" height=\"30\" >\r\n");
      out.write("\t\t<th id=\"thlabel\">Room</th>\r\n");
      out.write("\t\t<th id=\"thlabel\">Group</th>\r\n");
      out.write("\t\t<th id=\"thlabel\">style</th>\r\n");
      out.write("\t\t<th id=\"thlabel\">cost</th>\r\n");
      out.write("\t\t<th id=\"thlabel\">details</th>\r\n");
      out.write("\t\t<th id=\"thlabel\">status</th>\r\n");
      out.write("\t\t<th id=\"thlabel\">edit/del</th>\r\n");
      out.write("\t </tr>\r\n");
      out.write("\t ");

	 	for(String []s:res)
	    {
	  
      out.write("\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t   <td>");
      out.print( s[0] );
      out.write("</td>\r\n");
      out.write("\t   <td>");
      out.print( s[7] );
      out.write("</td>\r\n");
      out.write("\t   <td>");
      out.print( s[1] );
      out.write("</td>\r\n");
      out.write("\t   <td>");
      out.print( s[2] );
      out.write("$</td>\r\n");
      out.write("\t   <td>");
      out.print( s[3] );
      out.write("</td>\r\n");
      out.write("\t   <td>");
      out.print( s[4] );
      out.write("</td>\r\n");
      out.write("\t   <td><a href=listserv?action=editRes&&roomid=");
      out.print( s[6] );
      out.write(">edit/del</a></td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  ");

	     }
	  }
	   
      out.write("</table></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write(" </div></body>\r\n");
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
