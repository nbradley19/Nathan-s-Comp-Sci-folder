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
		System.out.println("Enter a rational value");
		String in = sc.nextLine();
		list = finder(in, .0001);
		System.out.println(list.get(list.size() - 1));

	}
	public void runner() {
		
	}

	public static ArrayList<Rational> finder(String input, double error) {
		ArrayList<Rational> list = new ArrayList<>();
		double pi = Math.PI;
		if (input.equalsIgnoreCase("pi")) {
			int numer = 3;
			int denom = 1;
			double target = numer / (double)denom;
			while (!plusOrMinus(target, pi, error)) {
				if(target > pi) {
					denom++;
				}
				else {
					numer++;
				}
				list.add(new Rational(numer, denom));
			}
		}
		return list;
	}

	public static boolean plusOrMinus(double input, double out, double error) {
		if (input + error > out && input - error < out) {
			return true;
		}
		return false;
	}

}
