package com.ProgramsUsingfor;

import java.util.Scanner;

public class PrintingRangeOfPrimeNOs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the starting no:");
		int startNo=sc.nextInt();
		System.out.println("Please enter the starting no:");
		int endNo=sc.nextInt();
		// NoOfdividents=0;
		for(int num=startNo;num<=endNo;num++) {
			int NoOfdividents=0;
			if(num!=1 && num!=2) {
				for(int i=1;i<=num;i++) {
					if(num%i==0)
						NoOfdividents++;		
				}
			}
		if(NoOfdividents==2)
			System.out.println(num);
		}
		sc.close();
	}
}
