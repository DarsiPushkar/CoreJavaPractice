package com.multidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintingTheSumOfRespectiveElementsofTwoArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows in 1st array:");
		int rowSize1=sc.nextInt();
		int[][] arr1=new int[rowSize1][];
		for(int i=0;i<rowSize1;i++) {
		System.out.println("Enter the no of columns in row"+i);
		int columnSize=sc.nextInt();
		arr1[i]=new int[columnSize];
		System.out.println("Enter the column values");
		for (int j = 0; j < columnSize; j++)
			arr1[i][j]=sc.nextInt();
		}
			
		System.out.println("Enter the number of rows in 2nd array:");
		int rowSize2=sc.nextInt();
		int[][] arr2=new int[rowSize2][];
		for(int i=0;i<rowSize2;i++) {
		System.out.println("Enter the no of columns in row"+i);
		int columnSize=sc.nextInt();
		arr2[i]=new int[columnSize];
		System.out.println("Enter the column values");
		for (int j = 0; j < columnSize; j++)
			arr2[i][j]=sc.nextInt();
		}
		System.out.println("Input1:");
		for (int i = 0; i < arr1.length; i++) {
				System.out.println(Arrays.toString(arr1[i]));	
			}	
		
		System.out.println("Input2:");
		for (int i = 0; i < arr2.length; i++) {
				System.out.println(Arrays.toString(arr2[i]));	
			}	
		
		int[][] arr3=new int[rowSize1][];
		
		for (int i = 0; i < arr1.length; i++) {
			arr3[i]=new int[arr1.length];
			for (int j = 0; j < arr1[i].length; j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}	
		}
		System.out.println("Result:");
		for(int i=0;i<arr1.length;i++) {
		System.out.println(Arrays.toString(arr3[i]));
		}
		
		
		
		sc.close();

	}

}
