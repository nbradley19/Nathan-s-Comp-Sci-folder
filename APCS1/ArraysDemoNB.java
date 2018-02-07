
/**
 * @author Nathan Bradley
 * @version 1/10/18
 * Assignment: Arrays demo
 */

import java.util.Scanner;

public class ArraysDemoNB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// create and print an array of 10 random integers between 65 and 100 inclusive
		int[] tests = new int[10];
		for (int i = 0; i < tests.length; i++) {
			tests[i] = (int) (36 * Math.random() + 65);
		}
		for (int i = 0; i < tests.length; i++) {
			System.out.print(tests[i] + " ");;
		}
		
		// create and print an array containing the first names of the female students
		String[] names = {"Ellie", "Colleen", "Grace", "Rachel"};
		// in this class

	}
}