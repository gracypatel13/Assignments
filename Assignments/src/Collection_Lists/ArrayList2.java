//Q1. Write a program to traverse (or iterate) ArrayList?
package Collection_Lists;
import java.util.*;


public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number ");
		String s=scan.next();
		
		ArrayList<Integer> A=new ArrayList<Integer>();
		
		A.add(12);
		A.add(13);
		A.add(56);
		
		
		
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
