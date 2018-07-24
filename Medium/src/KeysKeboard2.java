public class KeysKeboard2 {

	public static int minSteps(int n) {

		int ans = 0, d = 2;
        while (n > 1) {
            while (n % d == 0) {
                ans += d;
                n /= d;
            }
            d++;
        }
        return ans;
    }

	public static void main(String[] args) {
		// first test case
		System.out.println(minSteps(12));
	}

}
