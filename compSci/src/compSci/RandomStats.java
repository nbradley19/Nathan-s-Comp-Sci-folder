package compSci;

public class RandomStats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[500];
		int counts[] = new int[10];
		System.out.println("Number\t\tOccurences");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (10 * Math.random());
			counts[nums[i]]++;
			
		}

		for(int j = 0; j < nums.length; j++){
			System.out.println(nums.toString() + "\t" + counts.toString());
		}

	}

}
