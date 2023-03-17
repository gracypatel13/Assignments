package Getter;

import java.util.Scanner;

public class demo2 extends demo1 {
	Scanner sc=new Scanner(System.in);
	int num1,num2;
	public void gettingNumber() {
    System.out.println("Enter number one :");
    num1=sc.nextInt();
    System.out.println("Enter number two :");
    num2=sc.nextInt();
    
    setN1(num1);
    setN2(num2);
    
	}
	

}
