package Practice;

public class Parenthses {
	public static void main(String[] args) {
		Solution s1=new Solution();
		String s="())(}}{{ ";
		boolean flag=s1.isValid(s);
		System.out.println(flag);
	}

}
class Solution {
    public boolean isValid(String s) {
        int len=s.length();
        int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0;
        for(int i=0;i<len;i++){
          if(s.charAt(i)=='('){
              c1++;
          }
          else if(s.charAt(i)==')'){
              c2++;
          }
          else if(s.charAt(i)=='{'){
              c3++;
          }
          else if(s.charAt(i)=='}'){
              c4++;
          }
          else if(s.charAt(i)=='['){
              c5++;
          }
          else if(s.charAt(i)==']'){
              c6++;
          }
          else {
        	  continue;
          }

        }
        if(c1==c2 && c3==c4 && c5==c6) {
        	return true;
        }
        
        else{
		return false;
        }
        
    }
}