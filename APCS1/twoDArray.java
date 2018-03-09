import java.util.Arrays;

public class twoDArray {

	public static void main(String[] args) {
		char[][] werd = new char[50][20];
		for(int i = 0; i < werd.length; i++) {
			for(int y = 0; y < werd[i].length; y++) {
				werd[i][y] = (char)(26 * Math.random() + 65);
			}
		}
		for(int i = 0; i < werd[0].length; i++) {
			for(int q = 0; q < werd.length; q++) {
				System.out.print(werd[q][i] + " ");
				
			}
			System.out.println();
		}

	}

}
