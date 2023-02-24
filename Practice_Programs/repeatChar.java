import java.util.*;

public class repeatChar{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string :");
		
	String s=sc.nextLine();
	int len=s.length(),count=1;
	boolean flag=false;
	char a='a';
	ArrayList<Integer> n1=new ArrayList<>();
	HashSet<Character> cArray= new HashSet<>();
	LinkedHashMap<Character,Integer> cArray1= new LinkedHashMap<>();
	
	
	for(int i=0;i<len-1;i++){
		count=0;
		for(int j=i+1;j<len;j++)
		{	
		if(s.charAt(i)==s.charAt(j) && s.charAt(i) != ' ')
			{
				//a=s.charAt(i);
				cArray.add(s.charAt(i));
				count=count + 1;
				System.out.println(count);
				cArray1.put(s.charAt(i),count);
				//System.out.println("hello world");
				
				//break;	
			}
		}
		
		
	}
	
	System.out.println(cArray);
	System.out.println(cArray1);
	System.out.println(n1);
	
	

	
	}
}	