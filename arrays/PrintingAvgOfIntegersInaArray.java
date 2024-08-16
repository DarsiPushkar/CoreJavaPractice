package com.arrays;

import java.util.Scanner;

public class PrintingAvgOfIntegersInaArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size=sc.nextInt();
	int[] arr=new int[size];
	System.out.println("Please enter the elements of the array");
	for(int i=0;i<size;i++)
		arr[i]=sc.nextInt();
	int sum=0;
	int avg=0;
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
	    avg=sum/size;
	}
	System.out.println("The average of the integers in the array is:"+avg);
	sc.close();
	}	
}
