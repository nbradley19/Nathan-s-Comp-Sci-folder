
/**
 * @author Nathan Bradley
 * Date: 11/01/17	
 * Assignment: Prime Number Project
 */
import java.util.Scanner;

public class PrimeNumberNB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// code goes here
		int num, num2;
		int factor;
		// Enters num
		System.out.println("Enter number (1 for random, 0 to quit)");
		// Idiot checking
		while (!sc.hasNextInt()) {
			System.out.println("Not a number!");
			sc.next();
			System.out.println("Enter number (1 for random, 0 to quit)");
		}
		num = sc.nextInt();

		while (num != 0) {
			//Tests random number from 1 to Integer.MAX_VALUE
			if (num == 1) {
				num2 = (int) (Integer.MAX_VALUE * Math.random() + 1);

				if (isPrime(num2) == true) {
					System.out.println(num2 + " is prime.");
				} else {
					System.out.println(num2 + " is not prime.");
				}
				System.out.println("Enter number (1 for random, 0 to quit)");
				while (!sc.hasNextInt()) {
					System.out.println("Not a number!");
					sc.next();
					System.out.println("Enter number (1 for random, 0 to quit)");
				}
				num = sc.nextInt();
				//eliminates 2 from testing through isPrime()
			} else if (num == 2) {
				System.out.println(num + " is prime.");
				System.out.println("Enter number (1 for random, 0 to quit)");
				while (!sc.hasNextInt()) {
					System.out.println("Not a number!");
					sc.next();
					System.out.println("Enter number (1 for random, 0 to quit)");
				}
				num = sc.nextInt();
				//runs any other numbers through isPrime()
			} else {
				if (isPrime(num) == true) {
					System.out.println(num + " is prime.");
				} else {
					System.out.println(num + " is not prime.");
				}
				System.out.println("Enter number (1 for random, 0 to quit)");
				while (!sc.hasNextInt()) {
					System.out.println("Not a number!");
					sc.next();
					System.out.println("Enter number (1 for random, 0 to quit)");
				}
				num = sc.nextInt();
			}
		}
	}

	/**
	 * Tests to see whether an int is prime or not
	 * 
	 * @param n
	 * @return false if not prime, true if prime
	 */
	static boolean isPrime(int n) {
		//eliminates even numbers
		if (n % 2 == 0) {
			return false;
		}
		//eliminates numbers that are divisible by 3
		if (n != 3 && n % 3 == 0) {
			return false;
		//checks if the number is divisible by i
		}
		for (int i = 2; i < (n / 3); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
/*
 * Enter number (1 for random, 0 to quit) 1 
 * 1295081863 is not prime. 
 * Enter number (1 for random, 0 to quit) 9 
 * 9 is not prime. 
 * Enter number (1 for random, 0 to quit) 18 
 * 18 is not prime. 
 * Enter number (1 for random, 0 to quit)19 
 * 19 is prime. Enter number (1 for random, 0 to quit) e 
 * Not a number! 
 * Enter number (1 for random, 0 to quit) WHY
 * Not a number! 
 * Enter number (1 for random, 0 to quit) 0
 */
