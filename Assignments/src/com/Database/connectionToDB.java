package com.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionToDB {
	public static Connection conn;
	public static Connection getConnection() throws SQLException {
		String username="sa";
		String password="Gracy*13";
		String url="jdbc:sqlserver://;localhost=1433;Databasename=ASSIGNMENT;encrypt=false;";
		
		conn=DriverManager.getConnection(url,username,password);
	    System.out.println("Connection successfull");
		return conn;
	}

}
