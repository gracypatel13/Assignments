package com.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) throws SQLException {
		Connection getConnection=connectionToDB.getConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name :");
		String name=sc.next();
		System.out.println("Enter eid :");
		long eid=sc.nextLong();
		System.out.println("Enter salary :");
		Long salary=sc.nextLong();
		Demo.insertDetails(name, eid, salary);
		
	}
	public static void insertDetails(String name,long eid,long salary) {
		PreparedStatement ps;
		Scanner sc=new Scanner(System.in);
		//String sql="INSERT INTO employee VALUES('"+name+"',"+eid+","+salary+");";
//		ps=executeQuery(sql);
		try {
			connectionToDB.con.setAutoCommit(false);
			ps=connectionToDB.con.prepareStatement("INSERT INTO employee VALUES (?,?,?)");
			ps.setString(1,name);
			ps.setLong(2, eid);
			ps.setLong(3, salary);
			
			System.out.println("Are sure you want to enter data ? \nPress Y for yes  & Press anything else for no");
			char c=sc.next().charAt(0);
			
			if(c=='Y' || c=='y') {
				ps.execute();
				connectionToDB.con.commit();
				System.out.println("Successfully inserted data");
			}
			else
			{
				connectionToDB.con.rollback();
				System.out.println("Your data isn't stored into the server");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
