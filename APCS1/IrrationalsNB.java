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
		System.out.println(
				"Enter pi, e, gr for the Golden Ratio, sqrt for the square root of any positive number, or quit to quit");
		String in = sc.nextLine();
		while (!in.equalsIgnoreCase("quit")) {
			list = finder(sc, in, .000001);
			printArray(list);
			System.out.println();
			System.out.println(
					"Enter pi, e, gr for the Golden Ratio, sqrt for the square root of any positive number, or quit to quit");
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
		input.replaceAll(" ", "");
		if (input.equalsIgnoreCase("pi")) {
			numer = 3;
			denom = 1;
			see(numer, denom, list, pi, error);
			System.out.println("Pi is about " + list.get(list.size() - 1));
			System.out.println(list.get(list.size() - 1).toString() + " = " + list.get(list.size() - 1).getValue());
			System.out.println("Pi = " + pi);
			System.out.println("Error: " + error);
			System.out.println("Relative Error: " + Math.abs((list.get(list.size() - 1).getValue() - pi)));
		} else if (input.equalsIgnoreCase("e")) {
			numer = (int) e;
			denom = 1;
			see(numer, denom, list, e, error);
			System.out.println("e is about " + list.get(list.size() - 1));
			System.out.println(list.get(list.size() - 1).toString() + " = " + list.get(list.size() - 1).getValue());
			System.out.println("e = " + e);
			System.out.println("Error: " + error);
			System.out.println("Relative Error: " + Math.abs((list.get(list.size() - 1).getValue() - e)));
		} else if (input.equalsIgnoreCase("gr")) {
			numer = (int) gr;
			denom = 1;
			see(numer, denom, list, gr, error);
			System.out.println("The Golden Ratio is about " + list.get(list.size() - 1));
			System.out.println(list.get(list.size() - 1).toString() + " = " + list.get(list.size() - 1).getValue());
			System.out.println("Golden Ratio = " + gr);
			System.out.println("Error: " + error);
			System.out.println("Relative Error: " + Math.abs((list.get(list.size() - 1).getValue() - gr)));
		} else if (input.equalsIgnoreCase("sqrt") || input.equalsIgnoreCase("squareroot")) {
			System.out.println("What number would you like to take the square root of?");
			input = _sc.nextLine();
			double sqrtIn = Double.parseDouble(input);
			double finalSqrt = Math.sqrt(sqrtIn);
			numer = (int) sqrtIn;
			denom = 1;
			see(numer, denom, list, finalSqrt, error);
			System.out.println("The sqrt of " + input + " is about " + list.get(list.size() - 1).toString());
			System.out.println(list.get(list.size() - 1).toString() + " = " + list.get(list.size() - 1).getValue());
			System.out.println("Error: " + error);
			System.out.println("Relative Error: " + Math.abs((list.get(list.size() - 1).getValue() - finalSqrt)));
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
		while (!plusOrMinus(numer / (denom * 1.0), out, error)) {
			if (check(numer, denom, out)) {
				denom++;
			} else {
				numer++;
			}
			list.add(new Rational(numer, denom));
		}
	}

	public static void printArray(ArrayList<Rational> list) {
		for (Rational a : list) {
			System.out.print(a.toString() + ", ");
		}
	}
}

/*
 * Enter pi, e, gr for the Golden Ratio, sqrt for the square root of any
 * positive number, or quit to quit pi Pi is about 355/113 355/113 =
 * 3.1415929203539825 Pi = 3.141592653589793 Error: 1.0E-6 Relative Error:
 * 2.667641894049666E-7 Enter pi, e, gr for the Golden Ratio, sqrt for the
 * square root of any positive number, or quit to quit e e is about 2721/1001
 * 2721/1001 = 2.7182817182817183 e = 2.718281828459045 Error: 1.0E-6 Relative
 * Error: -1.1017732681750658E-7 Enter pi, e, gr for the Golden Ratio, sqrt for
 * the square root of any positive number, or quit to quit gr The Golden Ratio
 * is about 1597/987 1597/987 = 1.618034447821682 Golden Ratio =
 * 1.618033988749895 Error: 1.0E-6 Relative Error: 4.590717870289751E-7 Enter
 * pi, e, gr for the Golden Ratio, sqrt for the square root of any positive
 * number, or quit to quit sqrt What number would you like to take the square
 * root of? 5 The sqrt of 5 is about 2207/987 2207/987 = 2.236068895643364
 * Error: 1.0E-6 Relative Error: 9.181435740579502E-7 Enter pi, e, gr for the
 * Golden Ratio, sqrt for the square root of any positive number, or quit to
 * quit quit
 */
