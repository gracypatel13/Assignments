package leetcode;

import java.math.BigInteger;

public class Binary_Sum {
	 public String addBinary(String a, String b) {
	        BigInteger n1=new BigInteger(a,2);
	        BigInteger n2=new BigInteger(b,2);
	        BigInteger sum=n1.add(n2);
	       // String s=Integer.toBinaryString(sum);
	        return sum.toString(2);
	    }
    
	public static void main(String[] args) {
		Binary_Sum s=new Binary_Sum();
		String sum=s.addBinary("11", "1");
		System.out.println(sum);
		int num = 2;
		BigInteger b= new BigInteger(sum,2);
		//String binary = Integer.toBinaryString(num);
		//System.out.println(binary); // prints "101010"

	}
}
