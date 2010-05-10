package serv;

import java.sql.*;
import javax.sql.*;
import java.util.*;

public class orderdatabase {

    private static Connection connection = null;
    private static Statement statement = null;
    private static ResultSet resultset = null;
//check the order is dealed or not.
    public static boolean isOrdered(String rname) {
        boolean b = false;
        try {
            String apply = new String("waiting for apply");
            String used = new String("used");
            String roomname = new String(rname);
            connection = database.getConnection();
            statement = connection.createStatement();
            resultset = statement.executeQuery("select roomname from orderdetail where status='"
                    + apply + "' and roomname='" + roomname + "'");
//if the room is waiting for apply then user cannot reservate it.
            if (resultset.next()) {
                b = true;
            }
            resultset = statement.executeQuery("select roomname from room where status='"
                    + used + "' and roomname='" + roomname + "'");
//if the room is used then user cannot reservate it.
            if (resultset.next()) {
                b = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            database.closeConnection();
        }
        return b;
    }
//get the order list
    public static Vector<String[]> getOrderList(String sqla) {
        Vector<String[]> v = new Vector<String[]>();
        try {
            connection = database.getConnection();
            statement = connection.createStatement();
            String sql = new String(sqla);
            resultset = statement.executeQuery(sql);
            while (resultset.next()) {
                String s[] = new String[6];
//set the value into the String v.
                for (int i = 0; i < s.length; i++) {
                    s[i] = new String(resultset.getString(i + 1));
                }
                v.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            database.closeConnection();
        }
        return v;
    }
//get the orderd day.
    	public static Vector<String []> getOrderedDay(String getroomname){
		Vector<String []> v = new Vector<String []>();
		try{
			String status = new String("success");
			String roomname = new String(getroomname);
			connection = database.getConnection();
			statement = connection.createStatement();
			resultset = statement.executeQuery("select starttime,endtime from orderdetail where status='"+
								status+"' and roomname='"+roomname+"'");
//set the value into the string v.
			while(resultset.next()){
				String []s =new String[2];
				s[0] = new String(resultset.getString(1));
                                System.out.println(s[0]);
				s[1] = new String(resultset.getString(2));
                                System.out.println(s[1]);
				java.util.Date etime = orderdatabase.chageStringToDate(s[1]);
				java.util.Date now = new java.util.Date();
				if(etime.after(now)) {v.add(s);}
			}
		}
		catch(Exception e)	{e.printStackTrace();}
		finally {database.closeConnection();}
		return v;
	}

        	public static java.util.Date chageStringToDate(String s){
		java.util.Date da = null;
		if(s!=null){
//string p is the symbol of separate.
			String p = "-|:| ";
			String[] d = s.split(p);
			int[] date = new int[d.length];
			for(int i=0;i<d.length;i++)
			{date[i]=Integer.parseInt(d[i]);}
			da = new java.util.Date(date[0]-1900,date[1]-1,date[2],date[3],date[4]);
		}
		return da;
	}

//add the order
       	public static int addOrder(String orderuser,Vector<String[]> OrderList)
	{
		int i = 0;
//recall getId in database servlet and get the result into orderid.
		int orderid = database.getId("orders","orderid");
		try{
			connection = database.getConnection();
			statement = connection.createStatement();
			java.util.Date d = new java.util.Date();
			String ordertime = d.toLocaleString();
//stop the program auto submit the sql syntax into database.
			connection.setAutoCommit(false);
                        String sqla = "INSERT INTO orders (orderid,orderuser,ordertime) VALUES (NULL,'"+orderuser+"','"+ordertime+"')";
			statement.executeUpdate(sqla);
			Vector<String> sqlb = new Vector<String>();
			for(String []s:OrderList){
				String roomname = s[0];
				String starttime = s[2];
                                String endtime = s[3];
				String sqlc = "insert into orderdetail (detailid,orderid,roomname,starttime,endtime) values (NULL,"+orderid+",'"+roomname+"','"+starttime+"','"+endtime+"')";
				statement.executeUpdate(sqlc);
			}
			connection.commit();
//revovery the auto submit.
			connection.setAutoCommit(true);
		}
		catch(Exception e){
//if the value is wrong or other reasons, it will be rollback in order to avoid database mixed.
			e.printStackTrace();
			i = -1;
			try{connection.rollback();}
			catch(Exception ea)	{e.printStackTrace();}
		}
		finally	{database.closeConnection();}
		return i;
	}
//get the order detail
        public static Vector<String []> getOrderDetail(String orderid){
		Vector<String []> v = new Vector<String[]>();
		try{
			connection = database.getConnection();
			statement = connection.createStatement();
			resultset = statement.executeQuery("select roomname,starttime,endtime,status from orderdetail where orderid='"+orderid+"'");
//get the orderdetail information into vector v.
                        while(resultset.next()){
				String s[] = new String[5];
				for(int i=0;i<s.length-1;i++){
					s[i] = new String(resultset.getString(i+1));
				}
				v.add(s);
			}
//set values into v from string s
			for(String[] s:v){
				String roomname = new String(s[0]);
				resultset = statement.executeQuery("select groupname from roomgroup where groupid=("+
							"select roomgroup from room where roomname='"+roomname+"')");
				resultset.next();
				s[4] = new String(resultset.getString(1));
			}
		}
		catch(Exception e) {e.printStackTrace();}
		finally	{database.closeConnection();}
		return v;
	}
}
