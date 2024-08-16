package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintingSumOfIntegersInaArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Please enter the elements in the array");
		for(int i=0;i<size;i++)
			a[i]=sc.nextInt();
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		System.out.println("Input:"+Arrays.toString(a));
		System.out.println("The sum of integers in the array is:"+sum);
		sc.close();

	}
}
