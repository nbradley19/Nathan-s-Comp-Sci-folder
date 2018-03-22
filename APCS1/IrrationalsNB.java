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
			list = finder(in, .000001);
			System.out.println(list.get(list.size() - 1));
			System.out.println("Enter a rational value");
			in = sc.nextLine();	
		}
		

	}

	public void runner() {

	}

	public static ArrayList<Rational> finder(String input, double error) {
		ArrayList<Rational> list = new ArrayList<>();
		double pi = Math.PI;
		double e = Math.E;
		int numer;
		int denom;
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
		}
		else {
			int indexSlash;
			input.replaceAll(" ", "");
			indexSlash = input.indexOf("/");
			int firstNum = Integer.parseInt(input.substring(0, indexSlash));
			int secondNum = Integer.parseInt(input.substring(indexSlash, input.length()));
			
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
