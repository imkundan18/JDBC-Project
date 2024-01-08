package Assinment;
import java.util.*;
import java.sql.*;
public class InsertData {
	public static void insertplayer(Connection con) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nPlayertable\nEnter jersey no.");
		int jr=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter player name");
		String name=sc.nextLine();
		
		System.out.println("Enter team name");
		String team=sc.nextLine();
		
		System.out.println("Enter price.");
		int p=sc.nextInt();
		
		String sql="insert into player values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, jr);
		ps.setString(2, name);
		ps.setString(3, team);
		ps.setInt(4, p);
		ps.executeUpdate();
		
		System.out.println("\nAfter insertion data");
		SelectT.selectTablePlayer(con);
			
	}
	
	public static void insertteam(Connection con) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nTeam table\nEnter Rank");
		int r=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter team name");
		String team=sc.nextLine();
		
		System.out.println("Enter point");
		int p=sc.nextInt();
		
		String sql="insert into teams values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, r);
		ps.setString(2, team);
		ps.setInt(3, p);
		ps.executeUpdate();
		
		System.out.println("\nAfter insertion data in team");
		SelectT.selectTableteam(con);
		
	}
	
	public static void inserttrophy(Connection con) throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nTeam trophy\nEnter team");
		String team=sc.nextLine();
		
		System.out.println("Enter no. of trophy");
		String t=sc.nextLine();
		
		System.out.println("Enter year");
		int y=sc.nextInt();
		
		String sql="insert into trophies values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, team);
		ps.setString(2, t);
		ps.setInt(3, y);
		ps.executeUpdate();
		
		System.out.println("\nAfter insertion data in team");
		SelectT.selectTabletropy(con);
}

}
