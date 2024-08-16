package com.problems;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number:");
		int num=sc.nextInt();
		int sum=0;int digit=0;
		while(num!=0) {
			digit=num%10;
			sum+=digit;
			num/=10;
		}
		System.out.println("the sum of digits in the given number:"+sum);
		sc.close();
	}
	}