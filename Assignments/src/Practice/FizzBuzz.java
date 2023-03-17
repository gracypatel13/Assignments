package Practice;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		int num=100;
		System.out.println(154%11);
		//FizzBuzz.fizzBuzz(num);
		for(int i=0;i<14;i++) {
			for(int j=i+1;j<13;j++) {
				if(i+j==14) {
					System.out.println(i);
					System.out.println(j);
					System.out.println("********");
				}
			}
		}

	}
	public static void fizzBuzz(int n) {
		for(int i=1;i<=n;i++) {
			if(i%3==0) {
				System.out.println("fizz");
			}
			else if(i%5==0) {
				System.out.println("buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}

}
