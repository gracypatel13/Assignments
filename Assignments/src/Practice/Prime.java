package Practice;


import java.util.*;
class Prime{
public static void main(String Args[]){
	ArrayList<Integer> a=new ArrayList<>();
	boolean flag=false;
	Scanner sc=new Scanner(System.in);
	System.out.println("number");
	int number=sc.nextInt();
	a.add(2);
	for(int i=3;i<number;i++){
		flag=Prime.numberPrime(i);
		if(flag==false)
			a.add(i);
	}
	System.out.println("Prime number between 1 to "+number+" are below");
	System.out.println(a);
}
public static boolean numberPrime(int n)
{
	boolean flag=false;
	for(int i=2;i<n;i++)
	{
		if(n%i==0){
			flag=true;
			break;
		}
	}
return flag;	
}
}
