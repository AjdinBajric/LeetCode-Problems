public class JewelsAndStones {

	public static int numJewelsInStones(String J, String S) {
		int res = 0;
		for (char c : S.toCharArray()) {
			if (J.indexOf(c) != -1) {
				res++;
			}
		}
		return res;
	}

	public static void main(String[] args) {

		System.out.println(numJewelsInStones("aA", "aAAbbbb"));

	}

}
