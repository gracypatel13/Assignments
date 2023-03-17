package com.Servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import javax.servlet.http.HttpServlet;


public class EmpDao {
	public static Connection conn;
	static Scanner sc=new Scanner(System.in);
	public static Connection Getconnection() {

		try {
	         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	         conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=servlet;encrypt=false", "sa", "Gracy*13");
	      } catch (Exception ex) {
	         ex.printStackTrace();
	      }
		
		return conn;
		
	}

	//To insert data 
	public static int saveEmp(Emp emp) {
		int status=0;
		PreparedStatement ps;
		
		try {
			conn=EmpDao.Getconnection();
			ps=conn.prepareStatement("INSERT INTO emp VALUES(?,?,?)");
			
			ps.setString(1,emp.getName());
			
			ps.setString(2,emp.getEmail() );
		
			ps.setString(3,emp.getPassword() );
			
			status=ps.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	public static List<Emp> viewAllEmp(){
		conn=EmpDao.Getconnection();
		ArrayList<Emp> list=new ArrayList<>();
		
		try {
			PreparedStatement ps=conn.prepareStatement("SELECT * FROM emp");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Emp emp=new Emp();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setEmail(rs.getString(3));
				emp.setPassword(rs.getString(4));
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		System.out.println(list);
		return list;		
	}
	//public static 

	public static Emp getEmpById(String id) {
		// TODO Auto-generated method stub
		Emp eId=new Emp();
		conn=EmpDao.Getconnection();
		PreparedStatement ps;
		try {
			ps=conn.prepareStatement("SELECT * FROM emp WHERE id="+id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				eId.setName(rs.getString(1));
				eId.setName(rs.getString(2));
				eId.setName(rs.getString(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return eId;
	}
}
