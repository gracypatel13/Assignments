package Strings;

import java.io.* ;

class A implements Serializable {
	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer("Hello ");
		sb.insert(1, "Java");
		// Now original string is changed
		System.out.println(sb);
		StringBuffer sb1 = new StringBuffer("Hello ");
		 sb1.replace(1,3,"Java");
		 System.out.println(sb1.capacity());
		 
	}
}

