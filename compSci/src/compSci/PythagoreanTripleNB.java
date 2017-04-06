package compSci;

import java.util.ArrayList;
import java.util.Arrays;


public class PythagoreanTripleNB {

	public static void main(String[] args) {
		int a, b, c;
		
		ArrayList<int[]> triples = new ArrayList<int[]>();
		for (a = 1; a <= 100; a++) {
			for (b = a + 1; b <= 100; b++) {
				for (c = b + 1; c <= 100; c++) {
					if ((a * a) + (b * b) == (c * c)) {
						// System.out.println(a + ", " + b + ", " + c);
						int triple[] = {a, b, c};
						triples.add(triple);
					}

				}
			}
		}
		for(int[] i: triples){
			System.out.println(Arrays.toString(i));
		}
	}

}
