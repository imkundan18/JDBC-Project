package Assinment;

import java.sql.*;
import java.util.Scanner;

public class OperationT {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost/ipl";
		String user="root";
		String pass="root";
		
		
		Connection con=DriverManager.getConnection(url,user,pass);
		System.out.println("Connection establish to IPL database");
		
		System.out.println("\nPlayer Table");
		SelectT.selectTablePlayer(con);
		
		System.out.println("\nTeam Table");
		SelectT.selectTableteam(con);
		
		System.out.println("\nTropy Table");
		SelectT.selectTabletropy(con);
		System.out.println("\n_____________________________________");
		
	
		while(true) {
			System.out.println("Press 1-->INSERT,2-->DELETE,3-->UDATE,Exit(-1)");
			Scanner sc=new Scanner(System.in);
			int val=sc.nextInt();
			
		if(val==1) {
			System.out.println("Insert-Press 1-->PLAYER,2-->TEAM,3-->TRopy,Invalid for exit");
			int in=sc.nextInt();
			if(in==1) {
				InsertData.insertplayer(con);
			}else if(in==2) {
				InsertData.insertteam(con);
			}else if(in==3) {
				InsertData.inserttrophy(con);
			}else{
				System.out.println("Invalid no.");
				
			}
			
		}else if(val==2) {
			System.out.println("Insert-Press 1-->PLAYER,2-->TEAM,3-->TRopy,Invalid for exit");
			int in=sc.nextInt();
			if(in==1) {
				DeleteRow.deletePlayer(con);
			}else if(in==2) {
				DeleteRow.deleteTeam(con);
				
			}else if(in==3) {
				DeleteRow.deleteTrophy(con);
			}else{
				System.out.println("Invalid no.");
				
			}
		}else if(val==3) {
			System.out.println("Insert-Press 1-->PLAYER,2-->TEAM,3-->TRopy,Invalid for exit");
			int in=sc.nextInt();
			if(in==1) {
				updateData.playerUpd(con);
				
			}else if(in==2) {
				updateData.teamUpd(con);
				
			}else if(in==3) {
				updateData.trophyUpd(con);
			}else{
				System.out.println("Invalid no.");
				
			}
		}else if(val==-1) {
			return;
		}else {
			System.out.print("Invalid entery");
		}
		}
		
		
	}

}
