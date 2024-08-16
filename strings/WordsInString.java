package com.strings;

import java.util.Scanner;

public class WordsInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String s=sc.nextLine();
		String st[]=s.split(" ");
		System.out.println("no.of words in given string are:"+st.length);
		sc.close();
	}

}
