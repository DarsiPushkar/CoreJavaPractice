package com.multidimensionalarrays;

import java.util.Scanner;
import java.util.Arrays;
public class MD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of rows:");
		int rowSize=sc.nextInt();
		int[][]arr=new int[rowSize][];
		for(int i=0;i<rowSize;i++) {
			System.out.println("enter the no.of columns in row"+i);
			int colSize=sc.nextInt();
			arr[i]=new int[colSize];
			System.out.println("enter the column values");
			for(int j=0;j<colSize;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
		
				System.out.println(Arrays.toString(arr[i]));
			
		}
		sc.close();

	}

}
