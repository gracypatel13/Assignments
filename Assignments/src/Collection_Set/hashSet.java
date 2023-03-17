package Collection_Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class hashSet {
  public static void main(String[] args){
    HashSet<String> languages = new HashSet<>();
    int n=0;
    Scanner scan=new Scanner(System.in);
 
    
    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    languages.add("Swift");
    System.out.println("Enter a string to check :");
    String s=scan.nextLine();
  //  languages.add(12);
    
//    String l[]=languages.toArray(new String[languages.size()]);
//    for(String b:l) {
//    	System.out.println(b);
//    }

    
   Iterator iterate = languages.iterator();
   // System.out.println(iterate);
    
   // System.out.print("HashSet: ");

   
    while(iterate.hasNext()){
    	//System.out.println(iterate.next());
    	if(languages.contains(s))
    	{
    		System.out.println("True");
    		break;
    	}
    	else
    	{
    		System.out.println("False");
    	}
//   
      System.out.println(iterate.next());
     // n=n+1;
     
    }
    //System.out.println(n);
  }
}