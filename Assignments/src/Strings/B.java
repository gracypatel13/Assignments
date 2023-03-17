package Strings;

//Java code to illustrate
//methods of StringBuilder

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class B {
	public static void main(String[] argv)
		
	{

		// create a StringBuilder object
		// with a String pass as parameter
		StringBuilder str
			= new StringBuilder("AAAABBBCCCC");

		// print string
		System.out.println("String = "
						+ str);
		
		str.append("gracy");
		System.out.println("String = "
				+ str);
//
//		// reverse the string
//		StringBuilder reverseStr = str.reverse();
//
//		// print string
//		System.out.println("Reverse String = "
//						+ reverseStr.toString());
//
//		// Append ', '(44) to the String
//		str.appendCodePoint(44);
//
//		// Print the modified String
//		System.out.println("Modified StringBuilder = "
//						+ str);
//
//		// get capacity
//		int capacity = str.capacity();
//
//		// print the result
//		System.out.println("StringBuilder = " + str);
//		System.out.println("Capacity of StringBuilder = "
//						+ capacity);
	}
}
