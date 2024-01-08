package Assinment;

import java.sql.*;


public class SelectT {

	public static void selectTablePlayer(Connection con) throws SQLException  {
		
		
		String sql="Select *from player";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getInt(4));
		}

	}
	
public static void selectTableteam(Connection con) throws SQLException  {
		
		
		String sql="Select *from teams";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getInt(3));
		}

	}
public static void selectTabletropy(Connection con) throws SQLException  {
	
	
	String sql="Select *from trophies";
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(sql);
	
	while(rs.next()) {
		System.out.println(rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getInt(3));
	}

}


}
