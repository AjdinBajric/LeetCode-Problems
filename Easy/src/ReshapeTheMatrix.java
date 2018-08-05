import java.util.Arrays;

public class ReshapeTheMatrix {

	public static int[][] matrixReshape(int[][] nums, int r, int c) {
		int[][] res = new int[r][c];
		if (nums.length == 0 || r * c != nums.length * nums[0].length)
			return nums;
		int rows = 0, cols = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				res[rows][cols] = nums[i][j];
				cols++;
				if (cols == c) {
					rows++;
					cols = 0;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {

		int[][] array = { { 1, 2 }, { 3, 4 } };

		System.out.println(Arrays.deepToString(matrixReshape(array, 1, 4)));

	}

}
