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

    private static Connection connection = null;
    private static Statement statement = null;
    private static ResultSet resultset = null;

    public static Connection getConnection() {
        try {
            Context initial = new InitialContext();
            DataSource datasource = (DataSource) initial.lookup("java:comp/env/jdbc/hrs");
            connection = datasource.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            if (resultset != null) {
                resultset.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isExist(String sqla) {
        boolean judgment = false;
        try {
            String sql = new String(sqla);
            connection = database.getConnection();
            statement = connection.createStatement();
            resultset = statement.executeQuery(sql);
            if (resultset.next()) {
                judgment = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            database.closeConnection();
        }
        return judgment;
    }

    public static int update(String sqla) {
        int counter = 0;
        try {
            String sql = new String(sqla);
            connection = database.getConnection();
            statement = connection.createStatement();
            counter = statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            database.closeConnection();
        }
        return counter;
    }

    public static boolean update(String sqla, String sqlb) {
        boolean judgment = false;
        try {
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
        } catch (Exception e) {
            e.printStackTrace();
            try {
                connection.rollback();
                judgment = false;
            } catch (Exception ea) {
                ea.printStackTrace();
            }
        } finally {
            database.closeConnection();
        }
        return judgment;
    }

    public static String getInfomation(String sqla) {
        String Infomation = null;
        try {
            String sql = new String(sqla);
            connection = database.getConnection();
            statement = connection.createStatement();
            resultset = statement.executeQuery(sql);
            if (resultset.next()) {
                Infomation = new String(resultset.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            database.closeConnection();
        }
        return Infomation;
    }

    public static Vector<String[]> getGroup() {
        Vector<String[]> vector = new Vector<String[]>();
        try {
            connection = database.getConnection();
            statement = connection.createStatement();
            String sql = "select * from roomgroup";
            resultset = statement.executeQuery(sql);
            while (resultset.next()) {
                String group[] = new String[4];
                for (int i = 0; i < group.length; i++) {
                    group[i] = new String(resultset.getString(i + 1));
                }
                vector.add(group);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            database.closeConnection();
        }
        return vector;
    }

    public static Vector<String> getGroupInfomation(int groupid) {
        Vector<String> vector = new Vector<String>();
        try {
            connection = database.getConnection();
            statement = connection.createStatement();
            String sql = "select groupid,groupname,groupdetails,grouprules from roomgroup where groupid=" + groupid;
            resultset = statement.executeQuery(sql);
            if (resultset.next()) {
                for (int i = 1; i < 6; i++) {
                    vector.add(new String(resultset.getString(i)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            database.closeConnection();
        }
        return vector;
    }
    	public static String getInfo(String sqla){
		String Info=null;
		try{
			String sql = new String(sqla.getBytes());
			connection = database.getConnection();
			statement = connection.createStatement();
			resultset = statement.executeQuery(sql);
			if(resultset.next())
			{Info=new String(resultset.getString(1));}
		}
		catch(Exception e)	{e.printStackTrace();}
		finally {database.closeConnection();}
		return Info;
	}

     public static int getTotal(int span,int group){
	int result=0;
	String sql = "";
	try{
		connection = database.getConnection();
		statement = connection.createStatement();
		if(group==0)
		{sql = "select count(*) from room";}
		else{
			sql = "select count(*) from room "+"where roomgroup='"+group+"'";
		}
		resultset = statement.executeQuery(sql);
	    resultset.next();
	    int rows=resultset.getInt(1);
	    result=rows/span+((rows%span==0)?0:1);
	}
	catch(Exception e){e.printStackTrace();}
	finally{database.closeConnection();}
	return result;
}
public static Vector<String[]> getPageContent(int page,int span,int group){
	Vector<String[]> v = new Vector<String[]>();
	String sql = "";
	int startRow = 	(page-1)*span;
	try{
		connection = database.getConnection();
		statement = connection.createStatement();
		if(group==0){
			sql = "select roomname,style,cost,details,status,roomid,groupname from "+
			       "room,roomgroup where room.roomgroup=roomgroup.groupid order "+
			        "by roomgroup, roomname, roomid";
		}
		else{
			sql = "select roomname,style,cost,details,status,roomid,groupname "+
			 	   "from room,roomgroup where room.roomgroup=roomgroup.groupid "+
			 	   "and roomgroup='"+group+"' order by roomname";
		}
		resultset = statement.executeQuery(sql);
		if(startRow!=0)
		{resultset.absolute(startRow);}
		int c=0;
		while(c<span&&resultset.next()){
			String s[] = new String[7];
			for(int i=0;i<s.length;i++){
		      s[i] =
		    	new String(resultset.getString(i+1));
		    }
			v.add(s);
			c++;
		}
	}
	catch(Exception e){e.printStackTrace();}
	finally{database.closeConnection();}
	return v;
}
	public static int getId(String table,String row){
		int id = 0;
		try	{
			connection = database.getConnection();
			statement = connection.createStatement();
			resultset = statement.executeQuery("select count(*) from "+table);
			resultset.next();
			if(resultset.getInt(1)==0)	{ id = 1; }
			else{
				resultset = statement.executeQuery("select max("+row+") from "+table);
				resultset.next();
				id = Integer.parseInt(resultset.getString(1));
			}
		}
		catch(Exception e){e.printStackTrace();}
		finally	{database.closeConnection();}
		return id;
	}
}
