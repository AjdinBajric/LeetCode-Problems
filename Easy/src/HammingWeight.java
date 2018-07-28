public class HammingWeight {

	public static int hammingWeight(int n) {
		int mask = 1, count = 0;
		for (int i = 0; i < 32; i++) {
			if ((n & mask) == 1)
				++count;
			n >>= 1;
		}
		return count;
	}

	public static void main(String[] args) {

		System.out.println(hammingWeight(3));

	}

}
