package com.problems;

import java.util.Scanner;

public class Fac {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int fac=1;
		for(int i=1;i<=num;i++) {
			fac*=i;
		}
		System.out.println("factorial of no is:"+fac);
		
		sc.close();

	}

}
