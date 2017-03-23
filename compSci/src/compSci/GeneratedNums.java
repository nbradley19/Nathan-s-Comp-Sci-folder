package compSci;

public class GeneratedNums {

	public static void main(String[] args) {
		int nums[] = new int[101];
		System.out.println("Index\tGenerated Number");
		int sumDigits[] = new int[101];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
			int sumDigits2 = i + (i / 10) + (i % 10);
			sumDigits[i] = sumDigits2;
			System.out.println(nums[i] + "\t " + sumDigits[i]);
		}

	}

}
