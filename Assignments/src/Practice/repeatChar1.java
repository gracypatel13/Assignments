package Practice;

import java.util.*;

public class repeatChar1{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string :");
		
	String s=sc.nextLine();
	int len=s.length(),count=0,c1=0;
	boolean flag=false;
	char a='a';
	
	LinkedHashMap<Character,Integer> cArray1= new LinkedHashMap<>();
	
	System.out.println(cArray1);
	for(int i=0;i<len;i++){
		
		a=s.charAt(i);
		if(cArray1.containsKey(a)) {
			count=cArray1.get(a);
			cArray1.put(a, count+1);
			
		}
		else {
			cArray1.put(a, 1);
		}
		
		
	}
	
	
	System.out.println(cArray1);

	
	

	
	}
}	
