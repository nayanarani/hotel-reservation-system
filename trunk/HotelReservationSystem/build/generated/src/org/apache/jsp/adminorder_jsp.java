package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class adminorder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("   <title>manage order</title>\r\n");
      out.write("      <link href=\"css/styleHRS.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("   <script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write("    function check()\r\n");
      out.write("    {\r\n");
      out.write("       if(document.searchOrder.orderid.value==\"\")\r\n");
      out.write("       {\r\n");
      out.write("         alert(\"please input the order ID\");\r\n");
      out.write("         searchOrder.orderid.focus();\r\n");
      out.write("         return false;\r\n");
      out.write("       }\r\n");
      out.write("       document.searchOrder.submit();\r\n");
      out.write("    }\r\n");
      out.write("   </script>\r\n");
      out.write("  </head>\r\n");
      out.write(" <body><div align=\"center\">\r\n");
      out.write("   <br>\r\n");
      out.write("   <table>\r\n");
      out.write("    <tr>\r\n");
      out.write("       <td><a href=orderserv?action=allOrders&&condition=1>All of the order</a></td>\r\n");
      out.write("\t   <td><a href=orderserv?action=allOrders&&condition=2>excuted</a></td>\r\n");
      out.write("\t   <td><a href=orderserv?action=allOrders&&condition=3>not accept yet</a></td>\r\n");
      out.write("\r\n");
      out.write("\t   <td>order ID:\r\n");
      out.write("            <form name=\"searchOrder\" action=\"orderserv\" method=\"post\">\r\n");
      out.write("\t    <input type=\"hidden\" name=\"action\" value=\"query\">\r\n");
      out.write("\t    <input type=\"text\" name=\"orderid\">\r\n");
      out.write("\t    <input type=\"button\" value=\"query\" onclick=\"check()\">\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("\t   </td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\r\n");
      out.write("   </table><br>\r\n");
      out.write("\t   ");
Vector<String[]> order =
          (Vector<String[]>)request.getAttribute("order");
       if(order==null||order.size()==0){
	     out.println("<center>");
	     out.println("<font color=red size=5>no order</font>");
	     out.println("<br><br><a href="+
	       "orderserv?action=allOrders&&condition=1>return</a></center>");
	    }
	    else{
      out.write("\r\n");
      out.write("   <table border=\"1\">\r\n");
      out.write("\t <tr bgcolor=\"#999999\">\r\n");
      out.write("\t   <th id=\"thlabel\">ID</th>\r\n");
      out.write("           <th id=\"thlabel\">user</th>\r\n");
      out.write("           <th id=\"thlabel\">submit time</th>\r\n");
      out.write("\t   <th id=\"thlabel\">status</th>\r\n");
      out.write("           <th id=\"thlabel\">excute admin</th>\r\n");
      out.write("           <th id=\"thlabel\">detail</th>\r\n");
      out.write("\t   <th id=\"thlabel\">PS</th>\r\n");
      out.write("           <th id=\"thlabel\">excute order</th>\r\n");
      out.write("\t </tr>\r\n");
      out.write("\t   ");

	  	 for(int i=0;i<order.size();i++){
		   String[] s = order.get(i);
      out.write("\r\n");
      out.write("\r\n");
      out.write("     <tr>\r\n");
      out.write("\t   <td>");
      out.print( s[0] );
      out.write("</td>\r\n");
      out.write("           <td>");
      out.print( s[1] );
      out.write("</td>\r\n");
      out.write("\t   <td>");
      out.print( s[2] );
      out.write("</td>\r\n");
      out.write("           <td>");
      out.print( s[4] );
      out.write("</td>\r\n");
      out.write("\t   <td>");
      out.print( s[3] );
      out.write("</td>\r\n");
      out.write("\t   <td>\r\n");
      out.write("\t    <a target=\"blank\" href=orderserv?action=ListDetail&&orderid=");
      out.print( s[0] );
      out.write(">order detail</a>\r\n");
      out.write("\t   </td>\r\n");
      out.write("\t   <form action=\"orderserv\" method=\"post\">\r\n");
      out.write("\t   <td>\r\n");
      out.write("\t      <input type=\"text\" name=\"reason\" size=\"10\" value=");
      out.print( s[5] );
      out.write(">\r\n");
      out.write("\t   </td><td align=\"center\">\r\n");
      out.write("\t     <select name=\"status\">\r\n");
      out.write("\t     <option selected>successd</option>\r\n");
      out.write("\t     <option>failed</option>\r\n");
      out.write("\t     <option>waiting for apply</option>\r\n");
      out.write("\t     </select>\r\n");
      out.write("\t     <input type=\"hidden\" name=\"action\" value=\"dealOrder\">\r\n");
      out.write("\t     <input type=\"hidden\" name=\"orderid\" value=");
      out.print( s[0] );
      out.write(">\r\n");
      out.write("\t     <input type=\"submit\" value=\"submit\">\r\n");
      out.write("\r\n");
      out.write("\t   </td>\r\n");
      out.write("\t   \t</form>\r\n");
      out.write("\t</tr> ");
}
      out.write("\r\n");
      out.write("   </table>");
}
      out.write("\r\n");
      out.write("   <input type=\"button\" name=\"back\" id=\"back\" value=\"back\" onclick=\"window.location.href='index.jsp'\">\r\n");
      out.write(" </div>\r\n");
      out.write(" </body>\r\n");
      out.write("</html>");
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
