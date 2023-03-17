package Multithreading;

class MyClass extends Thread{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println(Thread.currentThread().getId()+" Values " +i);
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class demo6 {

	public static void main(String[] args) {
		MyClass m1=new MyClass();
		m1.start();
		MyClass m2=new MyClass();
		//m2.start();
		try {
			m1.join(1000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m2.start();
 	try {
		m2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
 	Thread.yield();
		// TODO Auto-generated method stub
		System.out.println("it's end");
	}
	
	

}
