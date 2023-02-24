package User_Details;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
	public static void  implementation(long ac_n) {
		Scanner scan=new Scanner(System.in);
		userServices users=new userServicesImpl();
		//long ac_n;

		System.out.println("\nEnter Your Choice :");
		System.out.println("----------------------------------------------");
		System.out.println("1.Check Balance \n2.Credit \n3.Debit \n4.Update Account Details \n5.Delete Account using account number \n6.Exit");
		System.out.println("----------------------------------------------");
		int ch=scan.nextInt();
		while(ch!=6) {
		
		if(ch==1) {
		
			users.getAccountById();
		}
			
			
		else if(ch==2) {
			users.creditAccountById(ac_n);
		}
		
		else if(ch==3) {
		
			users.debitAccountById(ac_n);
			
		}
		else if(ch==4) {
			
			users.updateAccountById(ac_n);
		
		}
		else if(ch==5) {
			
			users.deleteAccountById(ac_n);
			System.out.println("Thank you for banking with us");
			System.exit(0);
			
			
		}
		
		
			
		else
		{
			System.out.println("Enter Valid choice");
			//break;
		}
			
		System.out.println("\n----------------------------------------------");
		System.out.println("1.Check Balance \n2.Credit \n3.Debit \n4.Update Account Details \n5.Delete Account using account number \n6.Exit");
		System.out.println("----------------------------------------------");
		 ch=scan.nextInt();
		 if(ch==6) {
			 System.out.println("Thank you for banking with us \n Visit Again!!!");
			 System.exit(0);
		 }
		}
		}

		
		
	

	public static void main(String[] args) {
		Connection getconnection = connectionToDb.Getconnection();
		// TODO Auto-generated method stub
		userServices users=new userServicesImpl();
		Scanner scan=new Scanner(System.in);
		long ac_n,ac_p;
		System.out.println("Welcome to 1Rivet Bank");
		
		System.out.println("\n---------------------------");
		System.out.println("1.Create new Account \n2.Login to Existing account");
		System.out.println("---------------------------");
		int c=scan.nextInt();
		if(c==1) {
            UserDetails u1=new UserDetails();
			
			String name=u1.getAcc_name();
			String address=u1.getAcc_address();
			long mobile=u1.getAcc_mobile();
			long balance=u1.getAcc_balance();
			//object of userServicesImpl class
			users.createAccount(u1);
			System.out.println("To go back on original choice press y \n Press anything else to exit ");
			char choice=scan.next().charAt(0);
			if(choice=='y') {
				long ac=userServicesImpl.getAccountNumber();
				Main.implementation(ac);
				
			}
			else {
				System.out.println("Thank you for creating account with us");
				System.exit(0);
			}
			
			
		}
		if(c==2) {
			System.out.println("Please Enter your account number :");
			ac_n=scan.nextLong();
			System.out.println("Please Enter your account password :");
			ac_p=scan.nextLong();
			boolean a=users.loginAccountById(ac_n, ac_p);
			int count=1;
			if(a) {
				System.out.println("Login successfull");
				long ac=userServicesImpl.getAccountNumber();
				Main.implementation(ac);
			}
			else {
				
				while(count<3) {
					System.out.println("Incorrect password!!!");
					System.out.println("Please Enter your account password :");
					ac_p=scan.nextLong();
					a=users.loginAccountById(ac_n, ac_p);
			
				count++;
				
				if(a) {
					System.out.println("Login successfull");
					long ac=userServicesImpl.getAccountNumber();
					Main.implementation(ac);
					break;
					
				}
				
				}
				if(count>2) {
					System.out.println("Three incorrect attempts \nPlease try again later!!!");
				}
			}
			
		}
		else {
			System.out.println("Enter a valid choice!!!");
		}
		
	}
	

}
