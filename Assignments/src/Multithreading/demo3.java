package Multithreading;

class MyClass1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getId()+" Values " +i);
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new MyClass());
		Thread t2=new Thread(new MyClass());
		t1.start();
		t2.start();
	}

}
