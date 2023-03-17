package Personal_Details;

import java.sql.Connection;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Connection getconnection = connectionToDb.Getconnection();
		// TODO Auto-generated method stub
		userServices users=new userServicesImpl();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Choice :");
		System.out.println("1.Create User \n2.Get user by id \n3.Get all user \n4.Upadate user");
		int ch=scan.nextInt();
		switch(ch) {
		case 1:
			User u1=new User();
			int id=u1.getId();
			String name=u1.getName();
			String address=u1.getAddress();
			users.createUser(u1);
			
			break;
		}

	}

}
