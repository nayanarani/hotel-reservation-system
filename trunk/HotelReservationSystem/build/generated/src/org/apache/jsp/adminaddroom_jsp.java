package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class adminaddroom_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write(" <html>\r\n");
      out.write("  <head>\r\n");
      out.write("   <title>Add room</title>\r\n");
      out.write("   <link href=\"css/styleHRS.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("   <script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write("    function checkadminaddroom()\r\n");
      out.write("    {\r\n");
      out.write("       if(document.addRes.roomname.value==\"\")\r\n");
      out.write("       {\r\n");
      out.write("         alert(\"ID is NULL\");\r\n");
      out.write("         addRes.roomname.focus();\r\n");
      out.write("         return false;\r\n");
      out.write("       }\r\n");
      out.write("       if(document.addRes.style.value==\"\")\r\n");
      out.write("       {\r\n");
      out.write("         alert(\"style is NULL\");\r\n");
      out.write("         addRes.style.focus();\r\n");
      out.write("         return false;\r\n");
      out.write("       }\r\n");
      out.write("       if(document.addRes.cost.value==\"\")\r\n");
      out.write("       {\r\n");
      out.write("         alert(\"PRICE IS NULL\");\r\n");
      out.write("         addRes.cost.focus();\r\n");
      out.write("         return false;\r\n");
      out.write("       }\r\n");
      out.write("       if(document.addRes.details.value==\"\")\r\n");
      out.write("       {\r\n");
      out.write("         alert(\"PS is NULL\");\r\n");
      out.write("         addRes.details.focus();\r\n");
      out.write("         return false;\r\n");
      out.write("       }\r\n");
      out.write("       document.addRes.submit();\r\n");
      out.write("    }\r\n");
      out.write("        function check()\r\n");
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
      out.write(" <body>\r\n");
      out.write(" <div align=\"center\">\r\n");
      out.write(" <table border=\"1\">\r\n");
      out.write(" <tr>\r\n");
      out.write(" <td rowspan=\"2\"><table>\r\n");
      out.write("  <th id=\"navigator\">Group</th>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><a href=listserv?action=adminList&&groupid=0>All group</a></td>\r\n");
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
      out.write(" </table></td>\r\n");
      out.write(" <td><table align=\"right\">\r\n");
      out.write("   <form name=\"searchRes\" action=\"listserv\" method=\"post\">\r\n");
      out.write("     <tr>\r\n");
      out.write("       <td><a target=\"balnk\" href=\"adminaddroom.jsp\">create room</a></td>\r\n");
      out.write("       <td>Room:\r\n");
      out.write("         <input type=\"text\" name=\"roomname2\">\r\n");
      out.write("         <input type=\"button\" value=\"check\" onclick=\"check()\">\r\n");
      out.write("         <input type=\"hidden\" name=\"action2\" value=\"queryRes\"></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("   </form>\r\n");
      out.write(" </table></td></tr>\r\n");
      out.write(" <tr><td><fieldset>\r\n");
      out.write("   <legend>please input the correct information:</legend>\r\n");
      out.write("  \r\n");
      out.write("   <table>\r\n");
      out.write("    <form name=\"addRes\" action=\"listserv\" method=\"post\">\r\n");
      out.write("     <tr>\r\n");
      out.write("      <td id=\"label\">room:</td>\r\n");
      out.write("      <td><input type=\"text\" name=\"roomname\"></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("      <td id=\"label\"> group:</td>\r\n");
      out.write("      <td>\r\n");
      out.write("       <select name=\"roomgroup\">\r\n");
      out.write("\t\t");

		   for(String s[]:vgroup)
		   {
		 
      out.write("\r\n");
      out.write("             <option value=");
      out.print( s[0] );
      out.write('>');
      out.print( s[1] );
      out.write("</option>\r\n");
      out.write("   \t\t");

   		   }
   		 
      out.write("\r\n");
      out.write("       </select>\r\n");
      out.write("      </td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("      <td id=\"label\">style:</td>\r\n");
      out.write("      <td><input type=\"text\" name=\"style\"></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("      <td id=\"label\">cost:</td>\r\n");
      out.write("      <td><input type=\"text\" name=\"cost\"></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("       <td id=\"label\">details:</td>\r\n");
      out.write("       <td>\r\n");
      out.write("         <textarea rows=4 cols=40 name=\"details\"></textarea>\r\n");
      out.write("       </td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("      <td id=\"label\">status:</td>\r\n");
      out.write("      <td>\r\n");
      out.write("       <select name=\"status\">\r\n");
      out.write("        <option>empty</option>\r\n");
      out.write("        <option>used</option>\r\n");
      out.write("       </select>\r\n");
      out.write("      </td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr><td></td>\r\n");
      out.write("      <td align=\"left\">\r\n");
      out.write("        <input type=\"hidden\" name=\"action\" value=\"addRes\">\r\n");
      out.write("        <input type=\"submit\" value=\"save\" onclick=\"checkadminaddroom()\">\r\n");
      out.write("        <input type=\"reset\" value=\"reset\">\r\n");
      out.write("        <label>\r\n");
      out.write("          <input type=\"button\" name=\"back\" id=\"back\" value=\"back\" onclick=\"window.location.href='index.jsp'\">\r\n");
      out.write("        </label></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("    </form>\r\n");
      out.write("   </table></fieldset></td></tr>\r\n");
      out.write(" </table><br><br><br>\r\n");
      out.write(" \r\n");
      out.write(" </div>\r\n");
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
