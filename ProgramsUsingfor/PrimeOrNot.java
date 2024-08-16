package com.ProgramsUsingfor;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter a numebr:");
		int num=sc.nextInt();
		int NoOfDividents=0;
		if(num!=1 && num!=2) {
			for(int i=1;i<=num;i++) {
				if(num%i==0)
					NoOfDividents++;
			}
		}
		if(NoOfDividents>2)
			System.out.println("Given no is not a prime no");
		else
			System.out.println("given no is a prime no");
		sc.close();
	}
}
