package Multithreading;

public class demo5 extends Thread{    
	 public void run(){    
	  for(int i=1;i<5;i++){   
		   System.out.println(Thread.currentThread().getName()); 
		   if(Thread.currentThread().getName()== "Thread-0") {
			   System.out.println("hii");
		   }
		   
		   
		   
	  }
		   
		   
//			 boolean a=  Thread.currentThread().getName()=="Thread-1";
//			 System.out.println(a);
	  // the thread will sleep for the 500 milli seconds   
//	    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}    
//	    System.out.println(i);    
	//  }    
	 }    
	 public static void main(String args[]){    
	  demo4 t1=new demo4();    
	  demo4 t2=new demo4();    
	     
	  t1.start();    
	  t2.start();    
	 }    
	}    

