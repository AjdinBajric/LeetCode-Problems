import java.util.ArrayList;
import java.util.List;


public class PascalsTriangleII {
	
	public static List<Integer> getRow(int numRows) {

		List<List<Integer>> triangle = new ArrayList<List<Integer>>();


		triangle.add(new ArrayList<>());
		triangle.get(0).add(1);

		for (int i = 1; i <= numRows; i++) {

			List<Integer> row = new ArrayList<>();
			List<Integer> previous_row = triangle.get(i - 1);

			row.add(1);

			for (int j = 1; j < i; j++) {
				row.add(previous_row.get(j - 1) + previous_row.get(j));
			}

			row.add(1);

			triangle.add(row);
		}
		return triangle.get(numRows);
	}
	public static void main(String[] args) {
		
		System.out.println(getRow(33));

	}

}
