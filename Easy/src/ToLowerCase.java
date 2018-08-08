
public class ToLowerCase {

	public static String toLowerCase(String str) {

		String newstr = "";

		for (char c : str.toCharArray()) {

			if (65 <= c && c <= 90) {

				c = (char) ((c + 32));
			}

			newstr += c;
		}
		return newstr;
	}

	public static void main(String[] args) {

		System.out.println(toLowerCase("MY naMe IS ajdin BAJRIc"));

	}

}
