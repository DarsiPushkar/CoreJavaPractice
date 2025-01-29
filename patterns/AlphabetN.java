package patterns;

public class AlphabetN {

	public static void main(String[] args) {
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if((j==0 ) || (j==5) || ((j>0 && j<5) && (i==j))) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
