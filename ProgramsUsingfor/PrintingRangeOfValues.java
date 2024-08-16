package com.ProgramsUsingfor;

import java.util.Scanner;

public class PrintingRangeOfValues {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the starting number:");
	int startNo=sc.nextInt();
	System.out.println("Please enter the ending number:");
	int endNo=sc.nextInt();
	for(int i=startNo;i<=endNo;i++)
		System.out.println(i);
	sc.close();

	}

}
