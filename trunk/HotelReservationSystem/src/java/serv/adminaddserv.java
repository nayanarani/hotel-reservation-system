/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package serv;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
/**
 *
 * @author Administrator
 */
public class adminaddserv extends HttpServlet{
    public void init(ServletConfig servletconfig) throws ServletException {
        super.init(servletconfig);
    }

    public void doGet(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse) throws ServletException, IOException {
        doPost(httpservletrequest, httpservletresponse);
    }

    public void doPost(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse) throws ServletException, IOException {
        String action = httpservletrequest.getParameter("action");
        HttpSession httpsession = httpservletrequest.getSession(true);
        PrintWriter printwriter = httpservletresponse.getWriter();
        String msg = "";
            if(action.equals("adminadd")){
			String adminusername = httpservletrequest.getParameter("adminusername");
			String adminpassword = httpservletrequest.getParameter("adminpassword");
			String sql = "insert into admin values"+
			  			 "(NULL,'"+adminusername+"','"+adminpassword+"','Advanced')";
			String sqla = "select * from admin where adminusername='"+adminusername+"'";
			if(database.isExist(sqla)){
				msg = "Error! the admin username has been existed!";
			}
			else{
				if(database.update(sql)>0)
				msg = "Admin register success!";
			}
                        httpservletrequest.setAttribute("msg",msg);
                        httpservletrequest.getRequestDispatcher("usercheck.jsp").forward(httpservletrequest, httpservletresponse);
		}
        }
}
