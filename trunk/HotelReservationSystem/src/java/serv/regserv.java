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
 * @author Wang Qi Chen
 */
public class regserv extends HttpServlet{
	public void init(ServletConfig servletconfig) throws ServletException
	{
		super.init(servletconfig);
	}
	public void doGet(HttpServletRequest httpservletrequest,HttpServletResponse httpservletresponse) throws ServletException, IOException
	{
		doPost(httpservletrequest,httpservletresponse);
	}

        public void doPost(HttpServletRequest httpservletrequest,HttpServletResponse httpservletresponse) throws ServletException, IOException
	{
		String action = httpservletrequest.getParameter("action");
		HttpSession httpsession=httpservletrequest.getSession(true);
		PrintWriter printwriter=httpservletresponse.getWriter();
		String msg="";
	if(action.equals("reg")){

		String username = httpservletrequest.getParameter("username").trim();
		String password = httpservletrequest.getParameter("password").trim();
		String realname = httpservletrequest.getParameter("realname").trim();
        	String gender = httpservletrequest.getParameter("gender").trim();
		String email = httpservletrequest.getParameter("email").trim();
                String telephone = httpservletrequest.getParameter("telephone").trim();

		String sqla = "select * from user where username='"+username+"'";
		if(database.isExist(sqla)){
			msg=username+": has been existed try another one!!!<br/><a href=reg.jsp>return to the register page!</a>";
		}
		else{
			String sql = "insert into user values ('','"+username+"','"+password+"'"+",'"+realname+"','"+gender+"','"+email+"','"+telephone+"')";
			database.update(sql);
			msg="Congratulations,username:"+username+"is our membership now !!!<br/><a href=login.jsp>now login???</a>";
		}
		httpservletrequest.setAttribute("msg",msg);
		httpservletrequest.getRequestDispatcher("usercheck.jsp").forward(httpservletrequest,httpservletresponse);
            }
        }
}
