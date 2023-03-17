package Personal_Details;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class userServicesImpl implements userServices {

	Scanner sc=new Scanner(System.in);
	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		PreparedStatement st1;
		
		try {
			st1=connectionToDb.con.prepareStatement("INSERT INTO UsersTable VALUES(?,?,?)");
			System.out.println("Enter User ID:");
			st1.setInt(1,sc.nextInt());
			System.out.println("Enter User Name:");
			st1.setString(2, sc.next());
			System.out.println("Enter User Address:");
			st1.setString(3, sc.next());
			
			st1.executeUpdate();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void getUserById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUserById(int id) {
		// TODO Auto-generated method stub
		
	}
	

}
