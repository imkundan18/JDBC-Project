package Assinment;

import java.sql.*;
import java.util.Scanner;

public class updateData {
	public static void playerUpd(Connection con) throws SQLException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\nEnter player jersy no to update ");
		int jr=sc.nextInt();
		
		System.out.println("Enter player updateted bid");
		int b=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter player updateted team");
		String team=sc.nextLine();
		
		String upd="update player set team=?,bid=? where jursey=?";
		PreparedStatement ps=con.prepareStatement(upd);
		ps.setString(1, team);
		ps.setInt(2, b);
		ps.setInt(3,jr);
		ps.executeUpdate();
		
		System.out.println("\nAfter updating Player Table");
		SelectT.selectTablePlayer(con);
		
	}
	public static void teamUpd(Connection con) throws SQLException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\nEnter Team to update ");
		String team=sc.nextLine();
		
		System.out.println("Enter updateted Ranks");
		int r=sc.nextInt();
		
		System.out.println("Enter team updateted points");
		int p=sc.nextInt();
		
		String upd="update teams set ranks=?,points=? where team=?";
		PreparedStatement ps=con.prepareStatement(upd);
		ps.setInt(1, r);
		ps.setInt(2, p);
		ps.setString(3,team);
		ps.executeUpdate();
		
		System.out.println("\nAfter updating Teams Table");
		SelectT.selectTableteam(con);
	}
	public static void trophyUpd(Connection con) throws SQLException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\nEnter Team to updating trophy detail ");
		String team=sc.nextLine();
		
		System.out.println("update no. of trophy");
		int t=sc.nextInt();
		
		System.out.println("update year");
		int y=sc.nextInt();
		
		String upd="update trophies set tropy=?,year=? where team=?";
		PreparedStatement ps=con.prepareStatement(upd);
		ps.setInt(1, t);
		ps.setInt(2, y);
		ps.setString(3,team);
		ps.executeUpdate();
		
		System.out.println("\nAfter updating trophy Table");
		SelectT.selectTabletropy(con);
}

}
