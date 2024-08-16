package com.strings;

import java.util.Scanner;

public class OccurancesOfaCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String s=sc.nextLine();
		System.out.println("enter target character:");
		char tc=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==tc) {
				count++;
			}	
		}
		System.out.println("it is occured " +count + " times");
		sc.close();

	}

}
