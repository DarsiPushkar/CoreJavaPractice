package com.problems;
import java.util.Scanner;
public class CountOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int n=sc.nextInt();
		int count=0;
		int digit=0;
		while(n!=0) {
			digit=n%10;
			if(digit>=0)
				count++;
			n/=10;
		}
//		n/=10;
		System.out.println("count is:"+count);
		
		
        sc.close();
	}

}
