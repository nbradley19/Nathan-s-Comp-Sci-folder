
public class RecursionDemo {

	public static void main(String[] args) {
//		System.out.println(factRec(10));
	}
	/**
	 * uses recursion
	 * @param n >= 0
	 * @return
	 */
	public static int factRec(int n) {
		if(n == 0) {
			return 1;
		}
		else {
			return n * factRec(n - 1);
		}

	}
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static int factLoop(int n) {
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result *= 1;
		}
		return result;
	}

}
