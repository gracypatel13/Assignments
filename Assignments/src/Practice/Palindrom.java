package Practice;

import java.util.*;

public class Palindrom{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check whether it is palindrom or not ");
		int number=sc.nextInt();
		Palindrom.isPalindrom(number);
		
		


	}
	
	public static void isPalindrom(int number){
		int n1,rev=0,n2;
		n1=number;
		while(n1!=0){
			n2=n1%10;
			rev=rev*10+n2;
			n1=n1/10;
		}
	
	System.out.println(rev);
	System.out.println(n1);
	
	if(number==rev){
		System.out.println("Number is Palindrom");
	}
	else{
		System.out.println("Not Palindrom");
	}
	
		
	}
}
