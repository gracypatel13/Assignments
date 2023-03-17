package leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class alternateDigitSum {
	
	public static void sum(int n) {
		//String s=(String)num;
		//Integer[] array=num.toArray();
		ArrayList<Integer> array=new ArrayList<>();
        int count=0,r,num,sum=0;
        while(n>0){
            r=n%10;
            n=n/10;
            array.add(r);

        }
       // array.toString();
        Collections.reverse(array);
        array.trimToSize();
        int size=array.size();
       for(int i=0;i<size;i++) {
    	   if(i==0 || i%2==0) {
    		   sum=sum+array.get(i);
    		   
    	   }
    	   else {
    		   sum=sum-array.get(i);
    	   }
       }
        System.out.println(array);
        System.out.println("size"+size);
        System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alternateDigitSum.sum(10);

	}

}
