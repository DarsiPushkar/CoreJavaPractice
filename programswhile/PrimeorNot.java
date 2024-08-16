package com.programswhile;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		int number=sc.nextInt();
		boolean isPrime=true; 
		if(number!=1 && number!=2) {
			int i=2;
			while(i<number) {
				if(number%i==0) {
					isPrime=false;
					
				}
				i++;
			}
            if(isPrime)
            	System.out.println("Given number is a prime number");
            else
            	System.out.println("Given number is not a prime number");
		}
		else
			System.out.println("Given number is not a prime number");
		sc.close();

	}

}
