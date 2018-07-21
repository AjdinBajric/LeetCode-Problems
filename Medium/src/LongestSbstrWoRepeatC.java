import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSbstrWoRepeatC {

	public static int lengthOfLongestSubstring(String s) {

		int n = s.length();
		Set<Character> set = new HashSet<>();
		int ans = 0, i = 0, j = 0;

		while (i < n && j < n) {

			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				ans = Math.max(ans, j - i);
			}

			else {
				set.remove(s.charAt(i++));
			}
		}
		return ans;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = input.nextLine();

		System.out
				.println("Length of the longest substring without repeating characters is: "
						+ lengthOfLongestSubstring(str));
	}
}
