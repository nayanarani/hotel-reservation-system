/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package serv;
import javax.naming.*;
import java.sql.*;
import javax.sql.*;
import java.util.*;
/**
 *
 * @author Wang Qi Chen
 */
public class database {
	private static Connection connection=null;
	private static Statement statement=null;
	private static ResultSet resultset=null;
	public static Connection getConnection(){
		try{			
			 Context initial = new InitialContext();
			 DataSource datasource = (DataSource)initial.lookup("java:comp/env/jdbc/hrs");
			 connection = datasource.getConnection();
		}
		catch(Exception e)
		{
                    e.printStackTrace();
                }
		return connection;
	}
	public static void closeConnection(){
		try	{
			  if(resultset!=null){resultset.close();}
			  if(statement!=null){statement.close();}
			  if(connection!=null){connection.close();}
		}
		catch(Exception e)
		{
                    e.printStackTrace();
                }
	}

        public static boolean isExist(String sqla){
		boolean judgment = false;
		try{
			String sql = new String(sqla);
			connection = database.getConnection();
			statement = connection.createStatement();
			resultset = statement.executeQuery(sql);
			if(resultset.next()) {judgment = true;}
		}
		catch(Exception e) {
                    e.printStackTrace();
                }
		finally	{
                    database.closeConnection();
                }
		return judgment;
	}

       	public static int update(String sqla){
		int counter=0;
		try{
			String sql = new String(sqla);
			connection = database.getConnection();
			statement = connection.createStatement();
			counter = statement.executeUpdate(sql);
		}
		catch(Exception e)	{
                    e.printStackTrace();
                }
		finally {
                    database.closeConnection();
                }
		return counter;
	}

	public static boolean update(String sqla,String sqlb){
		boolean judgment = false;
		try{
			connection = database.getConnection();
			connection.setAutoCommit(false);
			statement = connection.createStatement();
			String sql = new String(sqla);
			statement.executeUpdate(sql);
			sql = new String(sqlb);
			statement.executeUpdate(sql);
			connection.commit();
			connection.setAutoCommit(true);
			judgment = true;
		}
		catch(Exception e){
			e.printStackTrace();
			try{
				connection.rollback();
				judgment = false;
			}
			catch(Exception ea){
                            ea.printStackTrace();
                        }
		}
		finally{
                    database.closeConnection();
                }
		return judgment;
	}

    	public static String getInfomation(String sqla){
		String Infomation=null;
		try{
			String sql = new String(sqla);
			connection = database.getConnection();//得到数据库连接
			statement = connection.createStatement();//创建语句对象
			resultset = statement.executeQuery(sql);//执行查询
			if(resultset.next())
			{Infomation=new String(resultset.getString(1).getBytes("iso8859-1"),"gbk");}
		}
		catch(Exception e)	{e.printStackTrace();}
		finally {database.closeConnection();}
		return Infomation;
	}

}
