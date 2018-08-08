import java.util.Arrays;

public class SetMismatch {

	public static int[] findErrorNums(int[] nums) {
		int[] arr = new int[nums.length + 1];
		int dup = -1, missing = 1;
		for (int i = 0; i < nums.length; i++) {
			arr[nums[i]] += 1;
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == 0)
				missing = i;
			else if (arr[i] == 2)
				dup = i;
		}
		return new int[] { dup, missing };
	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 3, 5, 6 };

		System.out.println(Arrays.toString(findErrorNums(array)));

	}

}
