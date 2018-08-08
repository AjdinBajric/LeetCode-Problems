import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

	public static List<Integer> selfDividingNumbers(int left, int right) {

		List<Integer> list = new ArrayList<>();

		for (int i = left; i <= right; i++) {

			if (isGood(i)) {
				list.add(i);
			}

		}
		return list;
	}

	public static boolean isGood(int n) {

		int x = n;

		while (x > 0) {

			int d = x % 10;
			x /= 10;

			if (d == 0 || (n % d) > 0)
				return false;
		}

		return true;

	}

	public static void main(String[] args) {

		System.out.println(selfDividingNumbers(1, 22));

	}

}
