package Prac_Arrays;

import java.util.Scanner;

public class Basic_Op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l1,l2;
		int[] array= {1,2,3,1,2};
		char c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice :");
		c=sc.next().charAt(0);
		if(c=='Y' || c=='y') {
		System.out.println("Enter length of both arrays :");
		l1=sc.nextInt();
		l2=sc.nextInt();
		
		int[] array1=new int[l1];
		int[] array2=new int[l2];
		System.out.println("Enter elements of the first array ");
		for(int i=0;i<l1;i++) {
			array1[i]=sc.nextInt();
		}
		System.out.println("Enter elements of the second array ");
		for(int i=0;i<l2;i++) {
			array2[i]=sc.nextInt();
		}
		}
		Basic_Op b=new Basic_Op();
		b.second_Highest(array);
		
		
		//b.sum_All(array1, array2);
		//b.reverse_Array(array);
		
//		int result=0;
//		for(int i=0;i<array.length;i++) {
//			 result ^= array[i];
//		}
//		System.out.println(result);
//		
		
		

	}
	public void sum_All(int[] a1,int[] a2) {
		int sum1=0;
		for(int i=0;i<a1.length;i++) {
			sum1=sum1+a1[i];
		}
		System.out.println("Sum of elements of first array is :"+sum1);
		System.out.println("Average is :"+(sum1/a1.length));
		sum1=0;
		for(int i=0;i<a2.length;i++) {
			sum1=sum1+a2[i];
		}
		System.out.println("Sum of elements of first array is :"+sum1);
		System.out.println("Average is :"+(sum1/a2.length));
		
	}
	
	public void reverse_Array(int[] a) {
		//int[] rev_a=new int[a.length];
		int len=a.length-1,temp;
		
		for(int i=0;i<a.length/2;i++) {
			temp=a[i];
			a[i]=a[len-i];
			a[len-i]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print("Reverse array :"+a[i]+" ");
		}
		//System.out.println(rev_a);
	}
	
	public void second_Highest(int[] a) {
		int max=Integer.MIN_VALUE,s_max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max ) {
				
				s_max=max;
				max=a[i];
				
			}
			else if(a[i]<max && a[i]>s_max) {
				s_max=a[i];
			}
		}
		String n=max.toBinaryString();
		System.out.println("Second highest element is :"+s_max);
	}
	
	
	
	

}
