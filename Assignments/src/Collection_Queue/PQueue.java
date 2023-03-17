package Collection_Queue;
//Java program to demonstrate the
//creation of queue object using the
//PriorityQueue class

import java.util.*;

public class PQueue {

	public static void main(String args[])
	{
		// Creating empty priority queue
		Queue<Integer> pQueue = new PriorityQueue<Integer>();

		// Adding items to the pQueue
		// using add()
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);
		pQueue.add(5);
		pQueue.add(25);
		pQueue.add(12);

		Iterator iterator = pQueue.iterator();
		  
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
		// Printing the top element of
		// the PriorityQueue
		System.out.println("Peek "+pQueue.peek());

		// Printing the top element and removing it
		// from the PriorityQueue container
		System.out.println(pQueue.poll());

		// Printing the top element again
		System.out.println("After removing :"+pQueue.peek());
		
		System.out.println(pQueue.poll());
		System.out.println("After removing :"+pQueue.peek());
		System.out.println(pQueue.poll());
		System.out.println("After removing :"+pQueue.peek());
		
		
	}
}


