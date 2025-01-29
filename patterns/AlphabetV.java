package patterns;

public class AlphabetV {

	public static void main(String[] args) {
		int row=0,col=6;
		for(int i=0;i<4;i++) {
			for(int j=0;j<7;j++) {
				if(i==j) {
					System.out.print("*");
				}
				else if((i==row && j==col) && j>3) {
					System.out.print("*");
					row++;
					col--;
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
