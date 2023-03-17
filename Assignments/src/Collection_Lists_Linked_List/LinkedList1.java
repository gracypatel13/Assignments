package Collection_Lists_Linked_List;
import java.util.*;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l1=new LinkedList();
		l1.add("Gracy");
		System.out.println(l1);
		
		l1.add(0,"Hey");
		System.out.println(l1);
		
ArrayList<Integer> A=new ArrayList<Integer>();
		
		A.add(12);
		A.add(13);
		A.add(56);
		
		l1.addAll(1, A);
		
		System.out.println(l1);
		

	}

}
