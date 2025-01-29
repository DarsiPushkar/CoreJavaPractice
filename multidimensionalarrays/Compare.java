package multiDarrays;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows of first matrix");
		int m=sc.nextInt();
		System.out.println("Enter the columns of first matrix");
		int n=sc.nextInt();
		System.out.println("Enter the rows of second matrix");
		int p=sc.nextInt();
		System.out.println("Enter the columns of second matrix");
		int q=sc.nextInt();
		
		int a[][]=new int[m][n];
		System.out.println("Enter the elements of first matrix");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int b[][]=new int[p][q];
		System.out.println("enter the elements of second matrix");
		for(int i=0;i<p;i++) {
			for(int j=0;j<q;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("First Matrix:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Seocnd Matrix:");
		for(int i=0;i<p;i++) {
			for(int j=0;j<q;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		int c[][]=new int[n][p];
		for(int i=0;i<p;i++) {
			for(int j=0;j<q;j++) {
				if(a[i][j]==b[i][j]) {
					c[i][j]=1;
				}
				else {
					c[i][j]=0;
				}
			}
		}
		System.out.println("Output:");
		for(int i=0;i<p;i++) {
			for(int j=0;j<q;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
     sc.close();
	}

}
