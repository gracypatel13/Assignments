package leetcode;

public class titleToNumber {
	
public static int titleToNumber1(String columnTitle) {
	int sum=0;
	int c,sr=0;
	for(int i=0;i<columnTitle.length();i++) {
		c=columnTitle.charAt(i)-64;
		sum=sum+c+sr;
		sr=25;
		
	}
	
	
	return sum;
        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=titleToNumber.titleToNumber1("AA");
		System.out.println(sum);

	}

}
