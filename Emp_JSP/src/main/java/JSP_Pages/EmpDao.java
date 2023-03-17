package JSP_Pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpDao {
	public static Connection conn;
	static Scanner sc=new Scanner(System.in);
	public static Connection Getconnection() {

		try {
	         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	         conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=servletJSP;encrypt=false", "sa", "Gracyyy*13");
	      } catch (Exception ex) {
	         ex.printStackTrace();
	      }
		
		return conn;
		
	}
	public static void pr() {
		System.out.println("Gracy");
	}

	//To insert data 
	public static int saveEmp(Emp emp) {
		int status=0;
		PreparedStatement ps;
		
		try {
			conn=EmpDao.Getconnection();
			ps=conn.prepareStatement("INSERT INTO emp VALUES(?,?,?,?)");
			
			ps.setString(1,emp.getName());
			
			ps.setString(2,emp.getEmail() );
		
			ps.setString(3,emp.getPassword() );
			
			ps.setString(4,emp.getCity());
			
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
				emp.setCity(rs.getString(5));
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		//System.out.println(list);
		return list;		
	}
	//public static 

	public static Emp getEmpById(int id) {
		// TODO Auto-generated method stub
		Emp eId=new Emp();
		conn=EmpDao.Getconnection();
		PreparedStatement ps;
		try {
			ps=conn.prepareStatement("SELECT * FROM emp WHERE id="+id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				eId.setName(rs.getString(2));
				eId.setEmail(rs.getString(3));
				eId.setPassword(rs.getString(4));
				eId.setCity(rs.getString(5));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return eId;
	}
	
	public static int deleteEmpById(int id) {
		int status=0;
		PreparedStatement ps;
		try {
			ps=EmpDao.Getconnection().prepareStatement("DELETE  FROM emp WHERE id="+id);
			status=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	public static int updateEmpById(Emp e) throws SQLException {
		PreparedStatement ps = null;
		if(e.getName() != null  && e.getName() !="") {
			
				ps=EmpDao.Getconnection().prepareStatement("UPDATE emp SET emp_name='"+e.getName()+"' WHERE id="+e.getId());
			
		}
		else if(e.getEmail() != null) {
			
			ps=EmpDao.Getconnection().prepareStatement("UPDATE emp SET emp_email='"+e.getEmail()+"' WHERE id="+e.getId());
		
	}else if(e.getPassword() != null) {
		
		ps=EmpDao.Getconnection().prepareStatement("UPDATE emp SET emp_password='"+e.getPassword()+"' WHERE id="+e.getId());
	
}else if(e.getCity() != null) {
	
	ps=EmpDao.Getconnection().prepareStatement("UPDATE emp SET emp_city='"+e.getCity()+"' WHERE id="+e.getId());

}
		return ps.executeUpdate();
	}
	
	public static int getEmpId() {
		int id=0;
		PreparedStatement ps;
		try {
			ps=EmpDao.Getconnection().prepareStatement("SELECT MAX(id) FROM emp");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				id=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;
	}
}
