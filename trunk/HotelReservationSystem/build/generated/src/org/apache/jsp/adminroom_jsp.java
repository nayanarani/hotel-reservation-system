package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class adminroom_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   <title>adminroom</title>\r\n");
      out.write("   <link href=\"css/styleHRS.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("  </head>\r\n");
      out.write(" <body><div align=\"center\"> \r\n");
      out.write("  <script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write("    function check()\r\n");
      out.write("    {\r\n");
      out.write("       if(document.searchRes.roomname.value==\"\")\r\n");
      out.write("       {\r\n");
      out.write("         alert(\"please input ID!\");\r\n");
      out.write("         searchRes.roomname.focus();\r\n");
      out.write("         return false;\r\n");
      out.write("       }\r\n");
      out.write("       document.searchRes.submit();\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("  <br>\r\n");
      out.write("  <table>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td rowspan=\"3\"><table>\r\n");
      out.write("  <th id=\"navigator\">group</th>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><a href=listserv?action=adminList&&groupid=0>allgroup</a></td>\r\n");
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
      out.write("    </table></td><td><table>\r\n");
      out.write("     <tr>\r\n");
      out.write("      <td>\r\n");
      out.write("        <a target=\"balnk\" href=\"adminaddroom.jsp\">create new room</a>\r\n");
      out.write("      </td>\r\n");
      out.write("\r\n");
      out.write("      <td>Room:\r\n");
      out.write("              <form name=\"searchRes\" action=\"listserv\" method=\"post\">\r\n");
      out.write("\t    <input type=\"text\" name=\"roomname\">\r\n");
      out.write("\t    <input type=\"button\" value=\"check\" onclick=\"check()\">\r\n");
      out.write("\t    <input type=\"hidden\" name=\"action\" value=\"queryRes\">\r\n");
      out.write("                </form>\r\n");
      out.write("\t  </td>\r\n");
      out.write("\r\n");
      out.write("    </tr>\r\n");
      out.write("   </table></td></tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><table border=\"1\">\r\n");
      out.write("               ");
 Vector<String> list = (Vector<String>)session.getAttribute("list");
	   int group = Integer.parseInt(list.get(0));
	   String groupname = list.get(1);
	   String cpStr=request.getParameter("cp");
	   int currPage=1;
	   if(cpStr!=null){
	 	currPage=Integer.parseInt(cpStr.trim());
	    }
	   int span=5;
	   int totalPage=serv.database.getTotal(span,group);
     
      out.write('\r');
      out.write('\n');

 Vector<String[]> v=serv.database.getPageContent(currPage,span,group);

      out.write("\r\n");
      out.write("      <tr>\r\n");
      out.write("        <th>ID</th>\r\n");
      out.write("        <th>Group</th>\r\n");
      out.write("        <th>style</th>\r\n");
      out.write("        <th>cost</th>\r\n");
      out.write("        <th>detial</th>\r\n");
      out.write("        <th>status</th>\r\n");
      out.write("        <th>Edit/del</th>\r\n");
      out.write("      </tr>\r\n");
      out.write("      ");

  	for(String[] s:v)
	{
   
      out.write("\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>");
      out.print(s[0]);
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print( s[6] );
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(s[1]);
      out.write("</td>\r\n");
      out.write("        <td><font> ");
      out.print(s[2]);
      out.write("</font></td>\r\n");
      out.write("        <td>");
      out.print(s[3]);
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print( s[4] );
      out.write("</td>\r\n");
      out.write("        <td><a href=listserv?action=editRes&&roomid=");
      out.print( s[5] );
      out.write(">Edit/del</a></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      ");

	   }
	  
      out.write("\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr><td>\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.print( groupname );
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("<table border=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("  <td width=\"33%\">\r\n");
      out.write("   ");

    if(currPage>1)
    {
   
      out.write("\r\n");
      out.write("   <a href=adminroom.jsp?cp=");
      out.print( currPage-1 );
      out.write(">last page</a>\r\n");
      out.write("   ");

    }
   
      out.write("&nbsp;\r\n");
      out.write("  </td>\r\n");
      out.write("\r\n");
      out.write("  <td align=\"center\"><br>\r\n");
      out.write("       <form action=adminroom.jsp method=\"post\">\r\n");
      out.write("   <select name=\"cp\" onchange=\"this.form.submit();\">\r\n");
      out.write("    ");

     for(int i=1;i<=totalPage;i++)
     {
       String s="";
       if(i==currPage)
     {
       s="selected";
     }
    
      out.write("\r\n");
      out.write("     <option value=\"");
      out.print( i );
      out.write('"');
      out.write(' ');
      out.print( s );
      out.write(">page:");
      out.print( i );
      out.write("</option>\r\n");
      out.write("\t ");

	  }
	 
      out.write("\r\n");
      out.write("   </select>\r\n");
      out.write(" </form>\r\n");
      out.write("   </td>\r\n");
      out.write("\r\n");
      out.write("   <td align=\"right\" width=\"33%\">\r\n");
      out.write("     ");

     if(currPage<totalPage)
     {
     
      out.write("\r\n");
      out.write("    <a href=adminroom.jsp?cp=");
      out.print( currPage+1 );
      out.write(">next page</a>\r\n");
      out.write("     ");

      }
     
      out.write("\r\n");
      out.write("  </td>\r\n");
      out.write(" </tr>\r\n");
      out.write("</table></td></tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  <a href=\"index.jsp\">\r\n");
      out.write("  <input type=\"button\" name=\"back\" id=\"back\" value=\"back\" onclick=\"window.location.href='index.jsp'\">\r\n");
      out.write("  </a>\r\n");
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
