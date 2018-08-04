public class PeakIndexInAMountainArray {

	public static int peakIndexInMountainArray(int[] A) {

		int lo = 0, hi = A.length - 1;

		while (lo < hi) {

			int mi = lo + (hi - lo) / 2;
			if (A[mi] < A[mi + 1])
				lo = mi + 1;
			else
				hi = mi;
		}
		return lo;
	}

	public static void main(String[] args) {

		int[] array = { 0, 2, 1, 0 };

		System.out.println(peakIndexInMountainArray(array));
	}

}
