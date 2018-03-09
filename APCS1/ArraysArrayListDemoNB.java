import java.util.ArrayList;
import java.util.Arrays;
public class ArraysArrayListDemoNB {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[20];
		for(int i = 0; i <nums.length; i++) {
			nums[i] = (int)(99 * Math.random() + 1);
		}
		System.out.println("Array: " + Arrays.toString(nums));
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		while(numList.size() < 20) {
			numList.add((int)(99 * Math.random() + 1));
		}
		System.out.println("ArrayList: " + numList);
		int oddCounter = 0;
		for(int n: nums) {
			
		}
	}

}
