package compSci;

import java.util.ArrayList;

public class EvensAndOddsTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[25];
		ArrayList<Integer> evens = new ArrayList<Integer>();
		ArrayList<Integer> odds = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (100 * Math.random());
			
			if (nums[i] % 2 == 0) {
				evens.add(nums[i]);
			} else {
				odds.add(nums[i]);
			}
		}
		System.out.println("ODD:");
		for (Integer o : odds) {
			System.out.print(o.intValue() + " ");
			System.out.println();
		}
		System.out.println("EVEN:");
		for (Integer e : evens) {
			System.out.print(e.intValue() + " ");
			System.out.println();
		}
	}

}
