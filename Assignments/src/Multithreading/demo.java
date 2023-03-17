package Multithreading;

class MyClass extends Thread{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getId()+" Values " +i);
		}
		try {
			Thread.sleep(1000000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class demo {

	public static void main(String[] args) {
		MyClass m1=new MyClass();
		m1.start();
		MyClass m2=new MyClass();
		m2.start();
		// TODO Auto-generated method stub

	}

}
