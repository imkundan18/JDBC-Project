package Assinment;

import java.sql.*;
import java.util.*;

public class DeleteRow {
	public static void deletePlayer(Connection con) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter jersy no. to delete ");
		int jr=sc.nextInt();
		
		String sql="delete from player where jursey=? ";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, jr);
		ps.executeUpdate();
		
		System.out.println("After remove Player Table");
		SelectT.selectTablePlayer(con);
	}
	public static void deleteTeam(Connection con) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Team name to delete ");
		String team=sc.nextLine();
		
		String sql="delete from teams where team=? ";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, team);
		ps.executeUpdate();
		
		System.out.println("\nAfter remove Teams from Table");
		SelectT.selectTableteam(con);
		
	}
	
	public static void deleteTrophy(Connection con) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter team name to delete trophy table data ");
		String t=sc.nextLine();
		
		String sql="delete from trophies where team=? ";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, t);
		ps.executeUpdate();
		
		System.out.println("\nAfter remove Teams from Trophies Table");
		SelectT.selectTabletropy(con);
}

}
