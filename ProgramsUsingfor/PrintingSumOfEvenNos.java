package com.ProgramsUsingfor;

import java.util.Scanner;

public class PrintingSumOfEvenNos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the starting no:");
		int startNo=sc.nextInt();
		System.out.println("Please enter the ending no:");
		int endNo=sc.nextInt();
		int sum=0;
		for(int i=startNo;i<=endNo;i++) {
			if(i%2==0)
				sum+=i;
		}
		System.out.println(sum);
		
		sc.close();
	}
}
