public class ReverseString {

	public static String reverseString(String s) {
		char[] c = s.toCharArray();
		int i = 0;
		int j = c.length - 1;
		while (j > i) {
			char tmp = c[i];
			c[i++] = c[j];
			c[j--] = tmp;
		}
		return new String(c);
	}

	public static void main(String[] args) {

		System.out.println(reverseString("hello"));

	}

}
