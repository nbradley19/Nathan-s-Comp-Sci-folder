/**
 * Your name date Estimating target and e Project
 */

public class PieFinderNB {
	public static void main(String[] args) {

		double target = Math.PI;
		int numer, denom, bestNumer = 22, bestDenom = 7;
		double minError = Math.abs((double) bestNumer / bestDenom - target);
		denom = 8;
		for (numer = 24; numer / denom > 3 && numer / denom < 4; numer++) {
			for (denom = 8; denom <= 999; denom++) {
				while (numer / denom == target && bestDenom < 999) {
					
				}
			}
		}
		

		target = Math.E;
		bestNumer = 19;
		bestDenom = 7;
		minError = Math.abs((double) bestNumer / bestDenom - target);

		// rest of e program goes here

	}
}
