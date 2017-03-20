package compSci;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		String[] roster = { "Ellie", "Nathan", "Phil", "Devin", "Tyler", "Gretchen", "Nick" };
		System.out.println(Arrays.toString(roster));
		// roster[2] = "Ravioli";
		// System.out.println(Arrays.toString(roster));
		// for(int i = 0; i < roster.length; i++){
		// System.out.println(roster[i]);
		// }
		// same thing with a for each loop
		for (String r : roster) {
			System.out.println(r);
		}

		int[] nums = new int[2147483647];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (31 * Math.random() + 1);
		}
		System.out.println(Arrays.toString(nums));
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0) {
				count++;
			}
		}
		System.out.println("There are " + count + " odd numbers in the array");
		double sum = 0;
		for (int n: nums) {
			sum += n;
		}
		System.out.println("The average of the array is " + sum / nums.length);
	}
}
