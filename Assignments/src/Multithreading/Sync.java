package Multithreading;

class A extends Thread{
	int n1=0;
	
	synchronized int sum(int n1,int n2) {
		return n1+n2;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			n1++;
		}
		sum(n1,10);
		
		// TODO Auto-generated method stub
		
	}
	
}
public class Sync {
	

}
