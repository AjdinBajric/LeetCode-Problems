public class AddBinary {

	public static String addBinary(String a, String b) {

		StringBuilder solution = new StringBuilder();

		int reminder = 0;

		for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0
				|| reminder == 1; i--, j--) {

			int x = i < 0 ? 0 : a.charAt(i) - '0';
			int y = j < 0 ? 0 : b.charAt(j) - '0';

			solution.append((x + y + reminder) % 2);
			reminder = (x + y + reminder) / 2;
		}

		return solution.reverse().toString();
	}

	public static void main(String[] args) {

		// first test case
		System.out.println(addBinary("11", "1"));

		// second test case
		System.out.println(addBinary("1010", "1011"));

	}

}
