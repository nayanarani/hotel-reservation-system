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
 * @author Wang Qichen
 */
public class changepasswordserv extends HttpServlet{
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
        if (action.equals("changepassword")) {
			String username=(String)httpsession.getAttribute("username");
			String currentPwd = httpservletrequest.getParameter("currentPwd").trim();
			String newPwd = httpservletrequest.getParameter("newPwd").trim();
			String sqla = "select pwd from user where username='"+username+"'";
			String DBpwd =  database.getInfo(sqla);
			if(currentPwd.equals(DBpwd)){
				String sqlb = "update user set pwd='"+newPwd+"'where username='"+
								username+"'";
				database.update(sqlb);
				msg = "Success! please login your account with new password next time.<br>";
			}
			else{
				msg = "Wrong value!<br>"+
				       "<a href=useredit.jsp> please retry.";
			}
			httpservletrequest.setAttribute("msg",msg);
			httpservletrequest.getRequestDispatcher("usercheck.jsp").forward(httpservletrequest, httpservletresponse);
        }
    }
}
