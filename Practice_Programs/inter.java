


interface calc{
	void sum(int a,int b);
	void sub(int a, int b);
}

 class A implements calc{
	public void sum(int a,int b)
	{
		System.out.println("sum is "+(a+b));
	}
	public void sub(int a,int b)
	{
		System.out.println("sum is "+(a+b));
	}
	
}

public class inter{
	public static void main(String[] args){
		A a=new A();
		a.sum(10,10);
		a.sub(10,5);
	}
}