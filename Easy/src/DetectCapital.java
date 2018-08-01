public class DetectCapital {

	public static boolean detectCapitalUse(String word) {
		
		int capCount = 0;
		boolean firstCap = false;
		
		for (int i = 0; i < word.length(); i++) {
			if ((int) word.charAt(i) >= 65 && (int) word.charAt(i) <= 90) {
				if (i == 0) {
					firstCap = true;
				}
				capCount++;
			}
		}

		if (capCount == word.length()) {
			return true;
		} else if (firstCap && capCount == 1) {
			return true;
		} else if (capCount == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		System.out.println(detectCapitalUse("AjDin"));

	}

}
