package Collection_Queue;
//Java program to demonstrate the
//creation of queue object using the
//PriorityQueue class

import java.util.*;

public class PSQueue implements Comparator {

	public static void main(String args[])
	{
		// Creating empty priority queue
		Queue<String> pQueue = new PriorityQueue<String>();

		// Adding items to the pQueue
		// using add()
		pQueue.add("Gracy");
		pQueue.add("Khyati");
		pQueue.add("Vanshika");
		pQueue.add("Sonali");
		pQueue.add("Ronak");
		pQueue.add("Jacky");
		pQueue.add("A");
		pQueue.add("aaaaa");
		pQueue.add("AAAAA");

		Iterator iterator = pQueue.iterator();
		  
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
		// Printing the top element of
		// the PriorityQueue
        System.out.println();
		System.out.println("Peek "+pQueue.peek());

		// Printing the top element and removing it
		// from the PriorityQueue container
		System.out.println("This element will be removed :"+pQueue.poll());

		// Printing the top element again
		System.out.println("After removing :"+pQueue.peek());
		
		System.out.println("This element will be removed :"+pQueue.poll());
		System.out.println("After removing :"+pQueue.peek());
		System.out.println("This element will be removed :"+pQueue.poll());
		System.out.println("After removing :"+pQueue.peek());
		
		
		Queue<Integer> pQueue1 = new PriorityQueue<Integer>(10,Comparator<Integer>  );
		
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if(o1>o2)
			return 1;
	}
}


