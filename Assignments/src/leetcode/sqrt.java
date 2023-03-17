package leetcode;
import java.math.*;

public class sqrt {
	 public static int mySqrt(double x) {
	        double x1,x2=1,i=0;
	        do{
	        	i++;
	            x1=x2;
	            x2=(x1+x/x1)/2;
	            System.out.println(i);
	            System.out.println("x1= "+x1);
	            System.out.println("x2 = "+x2);
	            System.out.println("x2-x2 = "+(x2-x1));
	        }while(x2-x1>0.00001);

	        int s=(int)x1;
	        return s;
	       
	    }
	// public static int mySqrt(int x) {
//	        int sqrt=0,rgnumb=x;
//	        float numb=0;
//	        
//	        while(! (numb==x)){
//	            sqrt=x/2;
//	            x=x/2;
//	            numb=sqrt*sqrt;
//	            numb=Math.round(numb);
//	            System.out.println(numb);
//	            if(rgnumb==numb) {
//	            	break;
//	            }
//
//	        }
//		 
//		 int sr=x/2;
//		 int temp=sr;
//		 do {
//			 temp=sr;
//			 sr=(temp+(x/temp))/2;
//			 
//		 }while(!(temp-sr==0));
//		 
//	        return sr;
//	    }
	 public static double sqrt(double x) {
	        if (x == 0) {
	            return 0;
	        }
	        double prev, curr = 1;
	        do {
	            prev = curr;
	            curr = (prev + x / prev) / 2;
	        } while (Math.abs(curr - prev) > 0.00001);
	        //curr=Math.round(curr);
	          	
	        return curr;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=sqrt.mySqrt(8);
System.out.println("sqrt="+n);
int num=(int) sqrt.sqrt(8);
System.out.println("sqrt="+num);
	}

}
