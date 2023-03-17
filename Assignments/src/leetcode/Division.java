package leetcode;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Division.divide(7, -3);
		System.out.println(n);

	}
	public static int divide(int dividend, int divisor) {
        int sub=0;
        System.out.println(2*divisor);
        if(divisor<0) {
	        	divisor=divisor-(2*divisor);
	        }
        System.out.println(divisor);
        while(dividend>=divisor){
            //sub=dividend-divisor;
            
            dividend=dividend - divisor;
           
            //dividend=dividend + divisor;
        
            sub++;
        }
        System.out.println(sub);
        if(divisor<0){
            sub=sub-(2*sub);
        }
        return sub;
    }
}
