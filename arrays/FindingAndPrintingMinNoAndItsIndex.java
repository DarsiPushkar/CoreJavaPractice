package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindingAndPrintingMinNoAndItsIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int s=sc.nextInt();
		int[] arr=new int[s];
		System.out.println("enter the elements of the array:");
		for(int i=0;i<s;i++)
			arr[i]=sc.nextInt();
		System.out.println("Input:"+Arrays.toString(arr));
		
		int smallestNumber=arr[0];//int largestNumber=arr[0];
		int smallestNumberIndex=0;
		//then we can start i with 1
		for(int i=0;i<arr.length;i++) {
			if(smallestNumber>arr[i]) {
				smallestNumber=arr[i];
				smallestNumberIndex=i;
			}	
		}
		System.out.println(" smallest Number is:"+smallestNumber);
		System.out.println("smallest Number Index is:"+smallestNumberIndex);
		sc.close();

	}

}
