
public class SingleNumber {

	public static int singleNumber(int[] nums) {
		int a = 0;
		for (int i : nums)
			a ^= i;
		return a;
	}

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 1, 2, 3 };
		System.out.println(singleNumber(array));
	}

}
