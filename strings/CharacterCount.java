package com.strings;

import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the string");
		String s=sc.nextLine();
	
		System.out.println("the no.of characters in the given string:"+s.length());
		sc.close();

	}

}
