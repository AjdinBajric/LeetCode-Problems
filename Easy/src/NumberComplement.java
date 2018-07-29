public class NumberComplement {

	public static int findComplement(int n) {

		String binaryString = Integer.toBinaryString(n);

		String temp = "";
		for (char c : binaryString.toCharArray()) {
			if (c == '1') {
				temp += "0";
			} else {
				temp += "1";
			}
		}
		int base = 2;
		int complement = Integer.parseInt(temp, base);

		return complement;
	}

	public static void main(String[] args) {
		
		System.out.println(findComplement(5));
	}

}
