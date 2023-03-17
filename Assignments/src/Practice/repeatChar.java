package Practice;

import java.util.*;

public class repeatChar{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string :");
		
	String s=sc.next();
	int len=s.length(),count=0,lenH,key=0;
	boolean flag=false;
	char a='a';
	LinkedHashMap<Integer,Character> cArray= new LinkedHashMap<>();
	ArrayList<Integer> countHash=new ArrayList<>();
	
	
	for(int i=0;i<len-1;i++){
		for(int j=i+1;j<len;j++)
		{	
		if(s.charAt(i)==s.charAt(j))
			{
				a=s.charAt(i);
				cArray.put(key,s.charAt(i));
				key++;
				break;	
			}
		}
	}
	lenH=cArray.size();
	System.out.println(lenH);
	for(int i=0;i<len;i++) {
		for(int j=0;j<lenH;j++) {
			if(s.charAt(i==lenH.get(j)))
			{}
		}
	}
	
	System.out.println(cArray);
	

	
	}
}	
