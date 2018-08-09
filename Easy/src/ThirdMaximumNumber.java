
public class ThirdMaximumNumber {

	public static int thirdMax(int[] nums) {
		long first = Long.MIN_VALUE, second = Long.MIN_VALUE, third = Long.MIN_VALUE;
		for (int i : nums) {
			if (i > third) {
				first = second;
				second = third;
				third = i;
			} else if (i > second && i != third) {
				first = second;
				second = i;
			} else if (i > first && i != second && i != third) {
				first = i;
			}

		}

		return first != Long.MIN_VALUE ? (int) first : (int) third;
	}

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println(thirdMax(array));
	}

}
