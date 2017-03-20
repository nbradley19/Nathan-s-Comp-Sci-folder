/**
 * Your name date Estimating target and e Project
 */

public class PieFinderNB {
	public static void main(String[] args) {

		double target = Math.PI;
		int numer, denom;
		double bestNumer = 22, bestDenom = 7;
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
		System.out.println("PI is about " + bestNumer + " / " + bestDenom);
		System.out.println("bestNumer / bestDenom = " + bestNumer / bestDenom);
		System.out.println("Pi = " + Math.PI);
		System.out.println("error = " + minError);

		target = Math.E;
		bestNumer = 19;
		bestDenom = 7;
		minError = Math.abs((double) bestNumer / bestDenom - target);

		for (denom = 8; denom <= 999; denom++) {
			for (numer = 2 * denom; numer < 3 * denom; numer++) {
				if (Math.abs((double)numer / denom - target) < minError) {
					bestNumer = numer;
					bestDenom = denom;
					minError = Math.abs((double) bestNumer / bestDenom - target);
				}
			}
		}
		System.out.println("--------------------------------------------");
		System.out.println("e is about " + bestNumer + " / " + bestDenom);
		System.out.println("bestNumer / bestDenom = " + bestNumer / bestDenom);
		System.out.println("e = " + Math.E);
		System.out.println("error = " + minError);
	}
}
//PI is about 355.0 / 113.0
//bestNumer / bestDenom = 3.1415929203539825
//Pi = 3.141592653589793
//error = 2.667641894049666E-7
//--------------------------------------------
//e is about 1457.0 / 536.0
//bestNumer / bestDenom = 2.718283582089552
//e = 2.718281828459045
//error = 1.7536305070287028E-6

