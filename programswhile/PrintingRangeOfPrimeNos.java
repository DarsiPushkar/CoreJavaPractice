package com.programswhile;
import java.util.Scanner;
public class PrintingRangeOfPrimeNos {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the starting Number");
		int startNo=sc.nextInt();
		System.out.println("Please enter the ending Number");
		int endNo=sc.nextInt();
		//boolean isPrime=true;
		int num=startNo;
		while(num<=endNo) {
			boolean isPrime=true;
			if(num!=1 && num!=2) {
			    int i=2;
				while(i<num) {
					if(num%i==0) {
						isPrime=false;
					break;
					}
					i++;
				}
			}
			else
				isPrime=false;
			if(isPrime)
				System.out.println(num);
			num++;
		}
		sc.close();
	}
}
