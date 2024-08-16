package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindingAndPrintingMinLengthWordAndItsIndex {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array:");
	int size=sc.nextInt();
	String[] arr=new String[size];
	System.out.println("enter the elements of the array:");
	for(int i=0;i<size;i++)
		arr[i]=sc.next();
	System.out.println("Input:"+Arrays.toString(arr));
	String minLengthWord=arr[0];
	int minLengthWordIndex=0;
	
	for(int i=0;i<arr.length;i++) {
		if(minLengthWord.length()>arr[i].length()) {
			minLengthWord=arr[i];
			minLengthWordIndex=i;
		}
	}
	System.out.println(" min length word is:"+minLengthWord);
	System.out.println("min length word Index is:"+minLengthWordIndex);
	
	sc.close();

	}

}
