public class FindPivotIndex {

	// public static int pivotIndex(int[] nums) {
	//
	// int sum = 0, left_sum = 0;
	//
	// for (int x : nums)
	// sum += x;
	//
	// for (int i = 0; i < nums.length; i++) {
	// if (left_sum == sum - left_sum - nums[i])
	// return i;
	// left_sum += nums[i];
	// }
	// return -1;
	// }

	// same code as one above, but faster

	public static int pivotIndex(int[] nums) {

		int total = 0;
		int leftsum = 0;

		for (int num : nums)
			total += num;

		for (int i = 0; i < nums.length; leftsum += nums[i++]) {
			if (leftsum * 2 + nums[i] == total)
				return i;
		}
		return -1;

	}

	public static void main(String[] args) {

		int[] array = { 1, 7, 3, 6, 5, 6 };

		System.out.println(pivotIndex(array));

	}

}
