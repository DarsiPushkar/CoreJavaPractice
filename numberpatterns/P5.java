package numberpatterns;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows:");
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				c+=1;
				System.out.print(c+" ");
			}System.out.println();
		}
		
		
		
		sc.close();

	}

}
