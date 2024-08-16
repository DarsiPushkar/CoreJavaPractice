package com.strings;

import java.util.Scanner;

public class Removeleadingandtrailingspaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String s=sc.nextLine();
		System.out.println("output string is:"+s.trim());
sc.close();
	}

}
