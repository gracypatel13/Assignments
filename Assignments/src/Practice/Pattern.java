package Practice;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		//Pattern.sqaureEvenNumber();
		Pattern.hollowSqaureEvenNumber();
		
	}

	public static void hollowSqaureEvenNumber() {
		Scanner sc=new Scanner(System.in);
		int n;
		//equal rows and columns
		
		System.out.println("Enter number to make a sqaure");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			if(i==1 || i==n) {
				//System.out.println();
			
				System.out.print("*");
				
				
			}
			
			
				
			}
			System.out.println();
			if(i>1 && i<n) {
				System.out.println("*");
				
			}
			
//			System.out.println();
//			 if(i>1  && i<n) {
//				 
//					System.out.println("i");
//					System.out.println();
//			
//			}
			
			
//			if(i==n)
//				System.out.println("i");
			
			
		}
	}
	public static void sqaureEvenNumber() {
		Scanner sc=new Scanner(System.in);
		int n;
		//equal rows and columns
		
		System.out.println("Enter number to make a sqaure");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
