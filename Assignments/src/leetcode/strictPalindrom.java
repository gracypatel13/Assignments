package leetcode;

import java.util.ArrayList;

public class strictPalindrom {

	    public static boolean isPalindrome(String s) {
	        boolean flag=false;
	        String str="";
	       ArrayList <Character> array=new ArrayList<>();
	        for(int i=0;i<s.length();i++){
	            if( ! Character.isAlphabetic(s.charAt(i)) || s.equals(" ")){
	            	if(Character.isDigit(s.charAt(i))) {
	            		str=str+s.charAt(i);
	            		array.add(s.charAt(i));
	            	}
	                
	                

	            } 
	            else{
	            	str=str+s.charAt(i);
	                array.add(s.charAt(i));
	            }
	        }
	       
	        String rstr="";
	        for(int i=array.size()-1;i>=0;i--){
	            rstr=rstr+array.get(i);

	        }
	      //  str=String.valueOf(array);
	        str=str.toLowerCase();
	        rstr=rstr.toLowerCase();
	       System.out.println("str :"+str);
	        System.out.println("rstr :"+rstr);
	        if(s.equals(" ")){
	            return true;
	        }
	        else if(str.equals(rstr)){
	            return true;
	        }
	        else{
	            return false;
	        }
	        
	        
	        
	    }
	
	    public static void main(String[] args) {
		// TODO Auto-generated method stub

	    	boolean f=strictPalindrom.isPalindrome("1b1");
	System.out.println(f);
	    }

}
