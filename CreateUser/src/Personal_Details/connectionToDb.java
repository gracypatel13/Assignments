package Personal_Details;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionToDb {
	static Connection con;
	public static Connection Getconnection() {
		String url="jdbc:sqlserver://;localhost=1433;DatabaseName=Users;encrypt=false;";
		String username="sa";
		String password="Gracy*13";
		
		
		try {
			con=DriverManager.getConnection(url,username,password);
			System.out.println("Successfull");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
	

}
