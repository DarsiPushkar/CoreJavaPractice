package com.programswhile;

import java.util.Scanner;

public class PrintingOddNosInReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the Starting number:");
		int startNo=sc.nextInt();
		System.out.println("Please enter the ending number:");
		int endNo=sc.nextInt();
		while(startNo>endNo) {
			if(startNo%2!=0)
				System.out.println(startNo);
		startNo--;		
		}
		sc.close();	
	}
}
