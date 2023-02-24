class Swap{
	
	public static void swap(int n1,int n2){
		int temp;
		temp=n1;
		n1=n2;
		n2=temp;
		
		System.out.println("now n1="+n1+" n2="+n2);
	} 
	
	public static void sumSwap(int n1,int n2){
		int s=n1+n2;
		n1=s-n1;
		n2=s-n2;
		System.out.println("now n1="+n1+" n2="+n2);
	}
	
	public static void divSwap(int n1,int n2){
		int m=n1*n2;
		
		n1=m/n1;
		n2=m/n2;
		System.out.println("now n1="+n1+" n2="+n2);
		
	}
	public static void main(String Args[]){
		int n1=10,n2=20,temp;
		
		System.out.println("Using temp variable");
		System.out.println("At first n1="+n1+" n2="+n2);
		Swap.swap(n1,n2);
		
		System.out.println("****************************");
		System.out.println("Using sum of two number variable");
		System.out.println("At first n1="+n1+" n2="+n2);
		Swap.sumSwap(n1,n2);
		
		System.out.println("****************************");
		
		System.out.println("Using division of two number variable");
		System.out.println("At first n1="+n1+" n2="+n2);
		Swap.divSwap(n1,n2);
		
		
		
		
		
		
		
		
	}
}