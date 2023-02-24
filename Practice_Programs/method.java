import java.util.*;

class methodover
{
	void area(float r)
	{
		System.out.println("Area of circle is "+" "+ (3.14*r*r));
	}
	void area(int l,int b)
	{
		System.out.println("Area of Rectangle is"+" "+ (2*l*b));
	}
	void area(int l1)
	{
		System.out.println("Area of square is"+" "+ ( l1*l1));
	}
}

public class method{
	
	public static void main(String[] args){ 
	
	Scanner scan=new Scanner(System.in);
	methodover m1=new methodover();
	System.out.println("Enter the radious of the circle");
	float r=scan.nextFloat();
	m1.area(r);
	System.out.println("Enter the length and width of the recangle");
	int l=scan.nextInt();
	int b=scan.nextInt();
	m1.area(l,b);
	System.out.println("Enter the length of the square");
	float l1=scan.nextInt();
	m1.area(l1);
	}
	
	
}