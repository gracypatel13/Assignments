package leetcode;

import java.util.ArrayList;

public class OnePlus {
	public static void plusOne(Integer[] digits) {
        int len=digits.length ,i=0;
     //   Integer[] digit=new Integer[a.size()];
        
        
        ArrayList<Integer> a=new ArrayList<>();
    //
        for( i=0;i<len;i++){
            a.add(digits[i]);
        }
        //a.trimToSize();
        for( i=0;i<len;i++){
            if(i==(len-1) && digits[i]!=9){
                //digits[i]=digits[i]+1;
            	System.out.println("hehe");
                a.add(len-1,digits[i]+1);
                a.remove(len);
            }
            else if(i==(len-1) && digits[i]==9){
                //digits[i]=digits[i]+1;
            	a.add(len-1,1);
                a.add(len,0);
                a.remove(len+1);
            }
        }
       // a.remove(len);
       
        Integer[] digit=new Integer[a.size()];
        digit= a.toArray(digit);
        for(int j=0;j<digit.length;j++) {
        	System.out.print(digit[j]+",");
        }
        
      //  return digit;
        
    }
	
	public static void main(String[] args) {
		Integer[] array1= {1,2,3,7,4,5,7};
		//int[] array2= {1,2,3,7};
		OnePlus.plusOne(array1);
	}

}
