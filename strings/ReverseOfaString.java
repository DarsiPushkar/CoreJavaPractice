package com.strings;

import java.util.Scanner;

public class ReverseOfaString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String s=sc.nextLine();
		String rev=new String();
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("reverse string:"+rev);
			
		
		sc.close();

	}

}
