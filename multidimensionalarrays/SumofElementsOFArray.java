package com.multidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumofElementsOFArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rowSize=sc.nextInt();
		int[][] arr=new int[rowSize][];
		for(int i=0;i<rowSize;i++) {
			System.out.println("enter the cloumn size for row:"+i);
			int columnSize=sc.nextInt();
			arr[i]=new int[columnSize];
			System.out.println("Enter the column values");
			for (int j = 0; j <columnSize; j++)
				arr[i][j]=sc.nextInt();		
		}
		System.out.println("Input:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
			
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum+=arr[i][j];	
			}
		}
		System.out.println("The sum of the elements is:"+sum);
		sc.close();

	}

}
