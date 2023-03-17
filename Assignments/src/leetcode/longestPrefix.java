package leetcode;

import java.util.Arrays;

public class longestPrefix{
	public static void main(String[] args) {
		Solution s1=new Solution();
		String[] strs=new String[4];
		strs[0]="Gracy";
		strs[1]="Gr";
		strs[2]="Gracyyy";	
		strs[3]="Grace";
		String prefix=s1.longestCommonPrefix(strs);
		System.out.println(prefix);
	}
}
class Solution {
	public String longestCommonPrefix(String[] strs) {
	    if (strs == null || strs.length == 0) {
	        return "";
	    }
	    
	    String prefix = strs[0];
	    for (int i = 1; i < strs.length; i++) {
	    	
	        while (strs[i].indexOf(prefix) != 0) {
//	        	int n=strs[i].indexOf(prefix);
//		    	System.out.println(n);
	            prefix = prefix.substring(0, prefix.length() - 1);
	          //  System.out.println(prefix);
	            if (prefix.isEmpty()) {
	                return "";
	            }
	        }
	    }
	    return prefix;
	}

}