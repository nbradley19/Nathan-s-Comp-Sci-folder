
/**
 * @author Nathan Bradley
 * Date: 12/01/17
 * Assignment: Quadratic Project
 */
import java.util.Scanner;

public class QuadraticNB {
	public static String input;
	static double a = 0;
	static double b = 0;
	static double c = 0;

	public static void main(String[] args) {

		int polarity = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a quadratic equation in standard form (quit to quit)");
		input = sc.nextLine();
		while (!input.equals("quit")) {
			input = input.replace(" ", "");
			if (goodEq()) {
				input = input.replace("=0", "");
				if (input.charAt(0) == '-') {
					polarity = -1;
					input.substring(1);
				}
				else if(input.charAt(0) == '+') {
					input.substring(1);
				}
				if(input.charAt(0) == '(') {
					int z = input.indexOf("/");
					int x = input.indexOf(")");
					double v = Double.parseDouble(input.substring(1, z - 1));
					double p = Double.parseDouble(input.substring(z + 1, x-1));
					
				}

				if (input.substring(0, input.indexOf("x^2")) == "" || input.substring(0, input.indexOf("x^2")) == " ") {
					a = 1;
				} else {
					a = Double.parseDouble(input.substring(0, input.indexOf("x")));
					input = input.substring((input.indexOf("x^2") + 3));

				}
				System.out.println(a);

				b = Double.parseDouble(input.substring(0, input.indexOf("x")));
				// input = input.substring((input.indexOf("x") + 1));
				System.out.println(b);
				c = Double.parseDouble(input.substring(input.indexOf("x") + 1, input.length()));
				System.out.println(c);
				// 4x^2 + 3x + 2 = 0
				printOut();
				System.out.println("Enter a quadratic equation in standard form (quit to quit)");
				input = sc.nextLine();
			}
			else {
				System.out.println("Try again");
				System.out.println("Enter a quadratic equation in standard form (quit to quit)");
				input = sc.nextLine();
			}
		}

	}

	public double discriminant(int a, int b, int c) {
		return Math.pow(b, 2) - 4 * a * c;
	}

	public static boolean goodEq() {
		if (input.indexOf("x^2") >= 0 && input.indexOf("=0") >= 0)
			return true;
		else {
			System.out.println("That is not in standard form.");
			return false;
		}

	}

	public static double round(double i) {
		return Math.round(i * 1000.0) / 1000.0;
	}

	public static void printOut() {
		double disc = round(Math.pow(b, 2) - (4 * a * c));
		double num1 = round(-b / (2 * a));
		double num2 = round(Math.sqrt(disc));
		System.out.println("Your discriminant: " + disc);
		if (disc >= 0) {
			System.out.println("First Root: " + round(num1 + num2 / (2 * a)));

			System.out.println("Second Root: " + round(num1 - num2 / (2 * a)));
		} else {
			num2 = round(Math.sqrt(-disc));
			System.out.println("First Root: " + num1 + " + " + round(num2 / (2 * a)) + "i");
			System.out.println("First Root: " + num1 + " - " + round(num2 / (2 * a)) + "i");
		}
		System.out.println();
	}
}
