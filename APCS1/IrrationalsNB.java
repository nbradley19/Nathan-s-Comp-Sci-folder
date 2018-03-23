import java.util.ArrayList;
import java.util.Scanner;

public class IrrationalsNB {
	/**
	 * @author nbradley19
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Rational> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a rational value (quit to quit)");
		String in = sc.nextLine();
		while(!in.equalsIgnoreCase("quit")) {
			list = finder(sc, in, .000001);
			System.out.println("Enter a rational value");
			in = sc.nextLine();	
		}
		

	}

	public void runner() {

	}

	public static ArrayList<Rational> finder(Scanner _sc, String input, double error) {
		ArrayList<Rational> list = new ArrayList<>();
		double pi = Math.PI;
		double e = Math.E;
		int numer;
		int denom;
		input.replaceAll(" " , "");
		if (input.equalsIgnoreCase("pi")) {
			numer = 3;
			denom = 1;
			while (!plusOrMinus(numer / (denom * 1.0), pi, error)) {
				if (check(numer, denom, pi)) {
					denom++;
				} else {
					numer++;
				}
				list.add(new Rational(numer, denom));
			}
			System.out.println("Your Fraction: " + list.get(list.size() - 1));
			System.out.println("Pi is: " + pi);
			System.out.println("Your Number: " + numer / (denom * 1.0));
			System.out.println("Error: " + Math.abs((numer / (denom * 1.0) - pi)));
		} else if (input.equalsIgnoreCase("e")) {
			numer = (int) e;
			denom = 1;
			while (!plusOrMinus(numer / (denom * 1.0), e, error)) {
				if (check(numer, denom, e)) {
					denom++;
				} else {
					numer++;
				}
				list.add(new Rational(numer, denom));
			}
			System.out.println("Your Fraction: " + list.get(list.size() - 1));
			System.out.println("e is: " + e);
			System.out.println("Your Number: " + numer / (denom * 1.0));
			System.out.println("Error: " + Math.abs((numer / (denom * 1.0) - e)));
		}
		else if(input.equalsIgnoreCase("sqrt") || input.equalsIgnoreCase("squareroot")) {
			System.out.println("What number would you like to take the square root of?");
			input = _sc.nextLine();
			double sqrtIn = Double.parseDouble(input);
			double finalSqrt = Math.sqrt(sqrtIn);
			numer = (int)sqrtIn;
			denom = 1;
			while(!plusOrMinus(numer / (denom * 1.0), finalSqrt, error)) {
				if (check(numer, denom, finalSqrt)) {
					denom++;
				} else {
					numer++;
				}
				list.add(new Rational(numer, denom));
			}
			System.out.println("Your Fraction: " + list.get(list.size() - 1));
			System.out.println("The Square Root of " + input + " is: " + finalSqrt);
			System.out.println("Your Number: " + numer / (denom * 1.0));
			System.out.println("Error: " + Math.abs((numer / (denom * 1.0) - finalSqrt)));
		}
		return list;
	}

	public static boolean plusOrMinus(double input, double out, double error) {
		if (input + error > out && input - error < out) {
			return true;
		}
		return false;
	}

	public static boolean check(int numer, int denom, double out) {
		if (numer / (denom * 1.0) > out) {
			return true;
		}
		return false;
	}

}
