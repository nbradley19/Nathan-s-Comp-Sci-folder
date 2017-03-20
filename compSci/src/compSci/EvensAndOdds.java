package compSci;

import java.util.Arrays;

public class EvensAndOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[25];
		int evenCount = 0;
		int oddCount = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (100 * Math.random());
			if (nums[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		int evenIndex = 0;
		int oddIndex = 0;
		int[] evens = new int[evenCount];
		int[] odds = new int[oddCount];
		for (int n : nums) {
			if (n % 2 == 0) {
				evens[evenIndex] = n;
				evenIndex++;
			} else {
				odds[oddIndex] = n;
				oddIndex++;
			}
		}
		System.out.println("ODD:");
		for (int o : odds) {
			
			System.out.print(o + " ");
		}
		System.out.println();
		System.out.println("EVEN:");
		for (int n : evens){
			System.out.print(n + " ");
		}
		
//		System.out.println();
//		System.out.println("EVEN:");
//		System.out.println(Arrays.toString(evens));

	}

}
