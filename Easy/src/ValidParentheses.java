import java.util.Stack;

public class ValidParentheses {

	public static boolean isValid(String s) {

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			if (st.empty()) {
				st.push(s.charAt(i));

			} else if (s.charAt(i) == ')' && st.peek() == '(') {
				st.pop();

			} else if (s.charAt(i) == ']' && st.peek() == '[') {
				st.pop();

			} else if (s.charAt(i) == '}' && st.peek() == '{') {
				st.pop();

			} else {
				st.push(s.charAt(i));
			}
		}

		return st.empty();

	}

	public static void main(String[] args) {
		// first test case
		System.out.println(isValid("()[]{}"));

		// second test case
		System.out.println(isValid("([)]"));

		// third test case
		System.out.println(isValid("(]"));

	}

}
