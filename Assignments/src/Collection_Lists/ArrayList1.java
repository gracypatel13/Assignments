//Q1. Write a program to traverse (or iterate) ArrayList?
package Collection_Lists;
import java.util.*;


public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=scan.nextLine();
		
		ArrayList<String> A=new ArrayList<String>();
		A.add("Good Morning");
		A.add("Good Afternoon");
		A.add("Good Evening");
		A.add("Good Night");
		A.add(3,"hello");
		A.add("Gracy");
		A.add(3,"Ronak");
		A.add("Gracy");
		A.add(s);
		
		Iterator it=A.listIterator();
		
		

		
		while(it.hasNext()) {
			if(it.next()==s)
			{
				System.out.println("Arraylist contain the given element");
			}
			
		}
		
		
		
		System.out.println(A);
		
		

	}

}
