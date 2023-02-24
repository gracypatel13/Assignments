//package Practice;

import java.util.*;
import java.lang.*;

public class Armstrong{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check whether it is Armstrong or not ");
		int number=sc.nextInt();
		Armstrong.isArmstrong(number);
		
		


	}
	
	public static void isArmstrong(int number){
		int n1,n2,arm=0;
		n1=number;
		String num=Integer.toString(number);
		int len=num.length();
		while(n1!=0){
			n2=n1%10;
			arm=arm+((int)Math.pow(n2,len));
			n1=n1/10;
		}
	
	
	System.out.println(arm);
	
	if(number==arm)
		System.out.println("Armstrong number");
	else{
		System.out.println("not Armstrong");
	}
	
		
	}
}
