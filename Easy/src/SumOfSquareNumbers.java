
public class SumOfSquareNumbers {

	public static boolean judgeSquareSum(int c) {
		for (long a = 0; a * a <= c; a++) {
			double b = Math.sqrt(c - a * a);
			if (b == (int) b)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

		System.out.println(judgeSquareSum(5));

	}

}
