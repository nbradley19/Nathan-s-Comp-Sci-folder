/**
 * Program to test Rational class.
 * 
 * @author nbradley19
 *
 */
public class RationalTester {
	public static void main(String[] args) {
		Rational frac1 = new Rational(8, 11);
		Rational frac2 = new Rational(4, 33);
		System.out.println(frac1 + "   " + frac2);
		System.out.println(frac1 + " + " + frac2 + " = " + frac1.add(frac2));
		System.out.println(frac1 + " - " + frac2 + " = " + frac1.subtract(frac2));
		System.out.println(frac1 + " * " + frac2 + " = " + frac1.multiply(frac2));
		System.out.println(frac1 + " / " + frac2 + " = " + frac1.divide(frac2));
	}
}
