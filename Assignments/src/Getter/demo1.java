package Getter;

public class demo1 {
private int n1,n2;

public int getN1() {
	return n1;
}

public void setN1(int n1) {
	this.n1 = n1;
}

public int getN2() {
	return n2;
}

public void setN2(int n2) {
	this.n2 = n2;
}

public void number(int n) {
	setN1(n);                                             
	 System.out.println("n1 ="+n1);
	    
	
}
}
