package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseOfaString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=sc.nextInt();
		String[] arr=new String[size];
		System.out.println("Please enter the elements in the array");
		for(int i=0;i<size;i++)
			arr[i]=sc.next();
		System.out.println("Input array:"+Arrays.toString(arr));
		String revarr[]	=new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			revarr[arr.length-i -1]=arr[i];
		}
		System.out.println("Reverse of the array:"+Arrays.toString(revarr));


		sc.close();

	}

}
