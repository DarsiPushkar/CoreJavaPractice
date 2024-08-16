package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the first array");
		int size1=sc.nextInt();
		String[] arr1=new String[size1];
		System.out.println("Please enter the elements of the first array");
		for(int i=0;i<size1;i++)
			arr1[i]=sc.next();
		System.out.println("Enter the size of the second array");
		int size2=sc.nextInt();
		String[] arr2=new String[size2];
		System.out.println("Please enter the elements of the second array");
		for(int i=0;i<size2;i++)
			arr2[i]=sc.next();
		System.out.println("Input:"+Arrays.toString(arr1));
		System.out.println("Input:"+Arrays.toString(arr2));
		String[] arr3=new String[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++)
			arr3[i]=arr1[i];
		for(int i=0;i<arr2.length;i++)
			arr3[i+arr1.length]=arr2[i];
		System.out.println("Input:"+Arrays.toString(arr3));
		sc.close();

	}

}
