public class RomanToInteger {

	public static int romanToInt(String s) {

		int res = 0;

		for (int i = s.length() - 1; i >= 0; i--) {

			char c = s.charAt(i);

			if (c == 'I')
				res += (res >= 5 ? -1 : 1);
			else if (c == 'V')
				res += 5;
			else if (c == 'X')
				res += 10 * (res >= 50 ? -1 : 1);
			else if (c == 'L')
				res += 50;
			else if (c == 'C')
				res += 100 * (res >= 500 ? -1 : 1);
			else if (c == 'D')
				res += 500;
			else if (c == 'M')
				res += 1000;
		}
		return res;
	}

	public static void main(String[] args) {
		
		System.out.println(romanToInt("MMDCCCXCIX"));

	}

}
