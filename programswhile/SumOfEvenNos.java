package com.programswhile;
import java.util.Scanner;
public class SumOfEvenNos {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the starting Number:");
		int startNo=sc.nextInt();
		System.out.println("Please enter the ending Number:");
		int endNo=sc.nextInt();
		int sum=0;
		while(startNo<=endNo) {
			if(startNo%2==0) {
			sum+=startNo;
			}
			//System.out.println(sum);
			startNo++;	
		}
		System.out.println(sum);
		sc.close();
	}
}
