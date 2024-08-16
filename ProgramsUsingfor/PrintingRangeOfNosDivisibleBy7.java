package com.ProgramsUsingfor;

import java.util.Scanner;

public class PrintingRangeOfNosDivisibleBy7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the starting Number:");
		int startNo=sc.nextInt();
		System.out.println("Please enter the ending Number:");
		int endNo=sc.nextInt();
		for(int i=startNo;i<=endNo;i++) {
			if(i%7==0)
				System.out.println(i);
			  
		}
		sc.close();
	}
}
