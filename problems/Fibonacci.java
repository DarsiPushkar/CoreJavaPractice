package com.problems;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*
		 * System.out.println("enter starting no:"); int startNo=sc.nextInt();
		 * System.out.println("enter ending no:"); int endNo=sc.nextInt();
		 * System.out.println(startNo); System.out.println(endNo);
		 */
		
		  int a=0,b=1;
		  for(int i=0;i<20;i++) {
			  System.out.println(a);
		  System.out.println(b); 
		  int c=a+b; 
		   a=b;
		  b=c; 
		  
		  System.out.println(c); }
		  sc.close();
		 

	}

}
