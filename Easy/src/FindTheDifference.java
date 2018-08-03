public class FindTheDifference {

	public static char findTheDifference(String s, String t) {
		int n = t.length();
		char c = t.charAt(n - 1);
		for (int i = 0; i < n - 1; ++i) {
			c ^= s.charAt(i);
			c ^= t.charAt(i);
		}
		return c;
	}

	public static void main(String[] args) {

		System.out.println(findTheDifference("abbcd", "bbacde"));

	}

}

/*
 * 
 * Explanation:
 * 
 * The logic behind doing XOR is that if you XOR two identical values then its
 * result is zero. Moreover XOR is associative: what this means is: x ^ (y ^ z)
 * = (x ^ y) ^ z. Therefore if we XOR the characters in strings s and t and
 * suppose s = 'abcd' and t = 'abcde', then: (a ^ b ^ c ^ d) ^ (a ^ b ^ c ^ d ^
 * e) = (a ^ a) ^ (b ^ b) ^ (c ^ c) ^ (d ^ d) ^ e = 0 ^ 0 ^ 0 ^ 0 ^ e = e
 * Therefore by XOR'ing all characters in strings s and t the end result you get
 * is the extra character added in t
 * 
 * 
 * 
 * My old solution:
 * 
 *     public char findTheDifference(String s, String t) {
        char res=0;
        for(char c : s.toCharArray())
            res-=c;
        for(char c : t.toCharArray())
            res+=c;
        
        return res;
    }
 */


