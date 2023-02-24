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
		int n1,n2=0,rev=0;
		while(number!=0){
			number=number%10;
			rev=rev*10+number;
		}
		n1=number%10;
		n2=number/10;
		//ArrayList<Integer> a=new ArrayList<>();
		
	//	String s=n1.toString()+n2.toString();
//	int number2=n2*10+n1;
	System.out.println(rev);
	
	if(number==rev){
		System.out.println("Number is Palindrom");
	}
	else{
		System.out.println("Not Palindrom");
	}
	//System.out.println(n2);
	//System.out.println(a);
		
	}
}