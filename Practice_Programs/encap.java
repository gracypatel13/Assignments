import java.util.*;

class acc{
	private int cr=1000;
	
	void credit(int credit)
	{
		cr += credit;
		System.out.println("Account credited with "+(credit));
		System.out.println("Account balance ="+(cr));
	}
	void debit(int d)
	{
		cr=cr-d;
		System.out.println("Account debited with "+(d));
		System.out.println("Account balance ="+(cr));
	}
	
}

public class encap{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		acc a1=new acc();
		System.out.println("Enter 1 to credit 100 or 2 to debit ");
		int c=scan.nextInt();
		
		if(c==1)
		{
			System.out.println("Enter the amount you want to credit : ");
		    int credit=scan.nextInt();
			a1.credit(credit);
		}
		else if(c==2)
		{
			System.out.println("Enter the amount you want to debit : ");
		    int debit=scan.nextInt();
			a1.debit(debit);
		}
		else
			System.out.println("Enter 1 or 2 only");
		
		
		
	}
}