public class PowerOfTwo {

	public static boolean isPowerOfTwo(int n) {
		
		int ones = 0;
		
		if(n<0)return false;
		
		for (int i = 31; i >= 0; i--) {
			if ((n & 1) == 1) {
				ones++;
			}
			if (ones > 1)
				return false;
			n >>= 1;
		}

		return ones==1;

	}

	public static void main(String[] args) {
		
		// first test case
		System.out.println(isPowerOfTwo(16));

		// second test case
		System.out.println(isPowerOfTwo(218));

		// second test case
		System.out.println(isPowerOfTwo(0));

	}

}
