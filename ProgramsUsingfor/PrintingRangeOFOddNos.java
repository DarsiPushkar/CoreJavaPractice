package com.ProgramsUsingfor;

import java.util.Scanner;

public class PrintingRangeOFOddNos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the starting no:");
		int startNo=sc.nextInt();
		System.out.println("Please enter the ending no:");
		int endNo=sc.nextInt();
		for(int i=startNo;i>endNo;i--) {
			if(i%2!=0)
			   System.out.println(i);
		}
		sc.close();
	}
}
