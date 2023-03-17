package leetcode;

public class firstOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		n=firstOccurance.strStr("helloworld","world");
		System.out.println(n);

	}
	 public static int strStr(String haystack, String needle) {
	        int len=needle.length();
	        int r=-1;
	        String sub=" ";
	        for(int i=0;i<haystack.length();i++){
	            sub=haystack.substring(i,len+i);
	            System.out.println(sub);
	            if(needle.equals(sub)) {
	            	r=i;
	            break;
	            }

	        }
	        if(r>=0){
	            return r;
	        }
	        else{
	            return -1;
	        }
	    }

}
