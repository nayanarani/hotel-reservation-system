package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class userorder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>user order</title>\r\n");
      out.write("         <link href=\"css/styleHRS.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body><div align=\"center\">\r\n");
      out.write("  ");
Vector<String[]> OrderList=(Vector<String[]>)session.getAttribute("OrderList");
     if(OrderList==null||OrderList.size()==0){
      out.println("<center>");
      out.println("<font color=red size=5>You have not reserve yet!</font>");
      out.println("<br><br><a href=index.jsp>return");
     }else{
      out.write("\r\n");
      out.write("   <table border=\"1\">\r\n");
      out.write("\t <tr bgcolor=\"#999999\">\r\n");
      out.write("\t   <th id=\"thlabel\">Room</th>\r\n");
      out.write("           <th id=\"thlabel\">type</th>\r\n");
      out.write("           <th id=\"thlabel\">start time</th>\r\n");
      out.write("\t   <th id=\"thlabel\">end time</th>\r\n");
      out.write("           <th id=\"thlabel\">delete</th>\r\n");
      out.write("\t </tr>\r\n");
      out.write("\t   ");

	  	 for(int i=0;i<OrderList.size();i++){
		     String[] s = OrderList.get(i);
      out.write("\r\n");
      out.write("     <tr>\r\n");
      out.write("\t   <td>");
      out.print(s[0]);
      out.write("</td>\r\n");
      out.write("           <td>");
      out.print(s[1]);
      out.write("</td>\r\n");
      out.write("\t   <td>");
      out.print(s[2]);
      out.write("</td>\r\n");
      out.write("           <td>");
      out.print(s[3]);
      out.write("</td>\r\n");
      out.write("\t   <td>\r\n");
      out.write("\t     <form action=\"orderserv\" name=\"delete\" method=\"post\">\r\n");
      out.write("\t      <input type=\"hidden\" name=\"index\" value=");
      out.print( i );
      out.write(">\r\n");
      out.write("\t      <input type=\"hidden\" name=\"action\" value=\"delete\">\r\n");
      out.write("\t      <input type=\"submit\" value=\"delete\">\r\n");
      out.write("\t     </form>\r\n");
      out.write("\t    </td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t\t ");
}
      out.write("\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td align=\"center\" colspan=\"2\">\r\n");
      out.write("\t     <form action=\"orderserv\" name=\"empty\" method=\"post\">\r\n");
      out.write("\t      <input type=\"hidden\" name=\"action\" value=\"empty\">\r\n");
      out.write("\t      <input type=\"submit\" value=\"empty\">\r\n");
      out.write("\t     </form>\r\n");
      out.write("\t    </td>\r\n");
      out.write("\t    <td>\r\n");
      out.write("\t      <form action=\"orderserv\" name=\"submit\" method=\"post\">\r\n");
      out.write("\t       <input type=\"hidden\" name=\"action\" value=\"submit\">\r\n");
      out.write("\t       <input type=\"submit\" value=\"submit\">\r\n");
      out.write("\t      </form>\r\n");
      out.write("\t    </td>\r\n");
      out.write("\t    <td><label>\r\n");
      out.write("          <input type=\"submit\" name=\"back\" id=\"back\" value=\"continue\" onclick=\"window.location.href='roomgrouplist.jsp'\">\r\n");
      out.write("        </label></td>\r\n");
      out.write("        <td><label>\r\n");
      out.write("          <input type=\"button\" name=\"back\" id=\"back\" value=\"back\" onclick=\"window.location.href='index.jsp'\">\r\n");
      out.write("        </label></td>\r\n");
      out.write("      </tr>\r\n");
      out.write(" </table>");
}
      out.write("\r\n");
      out.write("   </div> </body>\r\n");
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
