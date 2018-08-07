import java.util.Arrays;

public class FlippingAnImage {

	public static int[][] flipAndInvertImage(int[][] A) {
		int C = A[0].length;
		for (int[] row : A)
			for (int i = 0; i < (C + 1) / 2; ++i) {
				int tmp = row[i] ^ 1;
				row[i] = row[C - 1 - i] ^ 1;
				row[C - 1 - i] = tmp;
			}

		return A;
	}

	public static void main(String[] args) {

		int[][] array = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
		System.out.println(Arrays.deepToString(flipAndInvertImage(array)));

	}

}
