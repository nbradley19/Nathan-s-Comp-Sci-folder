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
		System.out.println("Enter pi, e, gr for the Golden Ratio, sqrt for the square root of any positive number, or quit to quit");
		String in = sc.nextLine();
		while(!in.equalsIgnoreCase("quit")) {
			list = finder(sc, in, .000001);
			System.out.println("Enter pi, e, gr for the Golden Ratio, sqrt for the square root of any positive number, or quit to quit");
			in = sc.nextLine();	
		}
	}


	public static ArrayList<Rational> finder(Scanner _sc, String input, double error) {
		ArrayList<Rational> list = new ArrayList<>();
		double pi = Math.PI;
		double e = Math.E;
		double gr = (1 + Math.sqrt(5)) / 2;
		int numer;
		int denom;
		input.replaceAll(" " , "");
		if (input.equalsIgnoreCase("pi")) {
			numer = 3;
			denom = 1;
			see(numer, denom, list, pi, error);
			System.out.println("Pi is about " + list.get(list.size() - 1));
			System.out.println(list.get(list.size() - 1).toString() + " = " + list.get(list.size() - 1).getValue());
			System.out.println("Pi = " + pi);
			System.out.println("Error: " + error);
			System.out.println("Relative Error: " + (list.get(list.size() - 1).getValue() - pi));
		} else if (input.equalsIgnoreCase("e")) {
			numer = (int) e;
			denom = 1;
			see(numer, denom, list, e, error);
			System.out.println("e is about " + list.get(list.size() - 1));
			System.out.println(list.get(list.size() - 1).toString() + " = " + list.get(list.size() - 1).getValue());
			System.out.println("e = " + e);
			System.out.println("Error: " + error);
			System.out.println("Relative Error: " + (list.get(list.size() - 1).getValue() - e));
		}
		else if(input.equalsIgnoreCase("gr")) {
			numer = (int) gr;
			denom = 1;
			see(numer, denom, list, gr, error);
			System.out.println("The Golden Ratio is about " + list.get(list.size() - 1));
			System.out.println(list.get(list.size() - 1).toString() + " = " + list.get(list.size() - 1).getValue());
			System.out.println("Golden Ratio = " + gr);
			System.out.println("Error: " + error);
			System.out.println("Relative Error: " + (list.get(list.size() - 1).getValue() - gr));
		}
		else if(input.equalsIgnoreCase("sqrt") || input.equalsIgnoreCase("squareroot")) {
			System.out.println("What number would you like to take the square root of?");
			input = _sc.nextLine();
			double sqrtIn = Double.parseDouble(input);
			double finalSqrt = Math.sqrt(sqrtIn);
			numer = (int)sqrtIn;
			denom = 1;
			see(numer, denom, list, finalSqrt, error);
			System.out.println("The sqrt of " + input + " is about " + list.get(list.size() - 1).toString());
			System.out.println(list.get(list.size() - 1).toString() + " = " + list.get(list.size() - 1).getValue());
			System.out.println("Error: " + error);
			System.out.println("Relative Error: " + (list.get(list.size() - 1).getValue() - finalSqrt));
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
	public static void see(int numer, int denom, ArrayList<Rational> list, double out, double error) {
		while(!plusOrMinus(numer / (denom * 1.0), out, error)) {
			if (check(numer, denom, out)) {
				denom++;
			} else {
				numer++;
			}
			list.add(new Rational(numer, denom));
		}
	}
}
