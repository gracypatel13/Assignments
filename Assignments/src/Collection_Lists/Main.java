package Collection_Lists;
import java.util.ArrayList;
import java.util.Iterator;

class Main {
  public static void main(String[] args){
    ArrayList<String> languages = new ArrayList<>();
    int n=0;
 
    
    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    languages.add("Swift");
  //  languages.add(12);
    
    String l[]=languages.toArray(new String[languages.size()]);
    for(String b:l) {
    	System.out.println(b);
    }

    
    Iterator iterate = languages.iterator();
    System.out.println(iterate);
    
    System.out.print("ArrayList: ");

   
    while(iterate.hasNext()){
      System.out.println(iterate.next());
      n=n+1;
     
    }
    System.out.println(n);
  }
}