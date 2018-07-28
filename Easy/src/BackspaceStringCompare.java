public class BackspaceStringCompare {

	public static boolean backspaceCompare(String S, String T) {
        String s = getString(S);
        String t = getString(T);
        return s.equals(t);
    }
    
    private static String getString(String s) {
        StringBuilder str = new StringBuilder();
        char[] c = s.toCharArray();
        for (char ch : c) {
            if (ch == '#') {
                if ( str.length() != 0) {
                    str.deleteCharAt(str.length() - 1);
                }
            } else {
                str.append(ch);
            }
        }
        return str.toString();
    }

	public static void main(String[] args) {

		String S = "xywrrmp", T = "xywrrmu#p";

		System.out.println(backspaceCompare(S, T));

	}

}
