import java.util.ArrayList;
import java.util.Scanner;

public class IrrationalsNB {
	/**
	 * @author nbradley19
	 * @param args
	 */
	private int denom;
	private int numer;
	private double target;
	private double pi = Math.PI;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	}

	public ArrayList<Rational> finder(String input, double error) {
		ArrayList<Rational> list = new ArrayList<>();
		if (input.equalsIgnoreCase("pi")) {
			numer = 3;
			denom = 1;
			target = numer / denom;
			while (!plusOrMinus(target, pi, error)) {
				list.add(new Rational(numer, denom));

			}
		}
		return list;
	}

	public boolean plusOrMinus(double input, double out, double error) {
		if (input + error == out || input - error == out) {
			return true;
		}
		return false;
	}
	public Rational testFinder(int numer, int denom) {
		if(numer / denom == pi - .001) {
			return new Rational(numer, denom);	
		}
		return new Rational(numer, denom);
		
	}

}
