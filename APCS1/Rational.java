
//  Rational.java: rational numbers

public class Rational {

	private int numerator;

	private int denominator;

	public Rational() {

		numerator = 0;

		denominator = 1;

	}

	// Rational: ensure nonzero denominator,

	// make only numerator signed.

	// Always reduce.

	public Rational(int numer, int denom) {

		if (denom == 0)

			denom = 1;

		// Make the numerator "store" the sign

		if (denom < 0) {

			numer = -numer;

			denom = -denom;

		}

		numerator = numer;

		denominator = denom;

		reduce();

	}

	// add: add two rational numbers

	public Rational add(Rational f2) {

		int commonDenominator = denominator * f2.getDenominator();

		int numerator1 = numerator * f2.getDenominator();

		int numerator2 = f2.getNumerator() * denominator;

		int sum = numerator1 + numerator2;

		return new Rational(sum, commonDenominator);

	}

	// subtract: subtract two rational numbers

	public Rational subtract(Rational f2) {

		int commonDenominator = denominator * f2.getDenominator();

		int numerator1 = numerator * f2.getDenominator();

		int numerator2 = f2.getNumerator() * denominator;

		int difference = numerator1 - numerator2;

		return new Rational(difference, commonDenominator);

	}

	// multiply: multiply two rational numbers

	public Rational multiply(Rational f2) {

		int numer = numerator * f2.getNumerator();

		int denom = denominator * f2.getDenominator();

		return new Rational(numer, denom);

	}

	// divide: divide two rational numbers

	public Rational divide(Rational f2) {

		return multiply(f2.reciprocal());

	}

	// reciprocal: take reciprocal

	public Rational reciprocal() {

		return new Rational(denominator, numerator);

	}

	// getNumerator: return the numerator

	public int getNumerator() {

		return numerator;

	}

	// getDenominator: return the denominator

	public int getDenominator() {

		return denominator;

	}

	// equals: check for equality

	public boolean equals(Rational f2) {

		return (numerator == f2.getNumerator() &&

				denominator == f2.getDenominator());

	}

	// toString: convert to String

	public String toString() {

		String result;

		if (numerator == 0)

			result = "0";

		else if (denominator == 1)

			result = numerator + "";

		else

			result = numerator + "/" + denominator;

		return result;

	}

	// reduce: reduce to lowest terms

	private void reduce() {

		if (numerator != 0) {

			int common = gcd(Math.abs(numerator), denominator);

			numerator = numerator / common;

			denominator = denominator / common;

		}

	}

	// gcd: greatest commmon divisor

	private int gcd(int num1, int num2) {

		num1 = Math.abs(num1);

		num2 = Math.abs(num2);

		while (num1 != num2) {

			if (num1 > num2)

				num1 = num1 - num2;

			else

				num2 = num2 - num1;

		}

		return num1;

	}
	public double getValue() {
		return 1.0 * numerator / denominator;
	}

}
