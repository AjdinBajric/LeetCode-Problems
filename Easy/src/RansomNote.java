public class RansomNote {

	public static boolean canConstruct(String ransomNote, String magazine) {
		
		int[] c = new int[26];
		
		for (char i : magazine.toCharArray())
			c[i - 'a']++;
		for (char i : ransomNote.toCharArray()) {
			c[i - 'a']--;
			if (c[i - 'a'] < 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(canConstruct("fihjjjjei",
				"hjibagacbhadfaefdjaeaebgi"));

	}

}
