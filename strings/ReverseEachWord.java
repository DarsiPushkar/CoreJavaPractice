package com.strings;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String s=sc.nextLine();
		String st[]=s.split(" ");
		String eachWordRev=new String();
		for(int i=0;i<st.length;i++) {
			for(int j=st[i].length()-1;j<=0;j++) {
				eachWordRev+=s.charAt(j);
			}
			
		}
		System.out.println(eachWordRev);
		
        sc.close();

	}

}
