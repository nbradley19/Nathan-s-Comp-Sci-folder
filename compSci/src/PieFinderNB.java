/**
 * Your name date Estimating target and e Project
 */

public class PieFinderNB {
	public static void main(String[] args) {

		double target = Math.PI;
		int numer, denom, bestNumer = 22, bestDenom = 7;
		double minError = Math.abs((double) bestNumer / bestDenom - target);
		denom = 8;
		for (denom = 8; denom <= 999; denom++) {
			for (numer = 3 * denom; numer < 4 * denom; numer++) {
				if (Math.abs((double)numer / denom - target) < minError) {
					bestNumer = numer;
					bestDenom = denom;
					minError = Math.abs((double) bestNumer / bestDenom - target);
				}
			}
		}
		System.out.println(bestNumer + " / " + bestDenom);

		target = Math.E;
		bestNumer = 19;
		bestDenom = 7;
		minError = Math.abs((double) bestNumer / bestDenom - target);

		// rest of e program goes here

	}
}
