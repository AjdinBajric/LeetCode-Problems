import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {

	public static String[] findWords(String[] words) {

		ArrayList<String> a = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			boolean flag = false;
			if (words[i].toLowerCase().matches("[qwertyuiop]+")) {
				flag = true;
			}
			;
			if (words[i].toLowerCase().matches("[asdfghjkl]+")) {
				flag = true;
			}
			;
			if (words[i].toLowerCase().matches("[zxcvbnm]+")) {
				flag = true;
			}
			;
			if (flag)
				a.add(words[i]);

		}

		return a.toArray(new String[a.size()]);
	}

	public static void main(String[] args) {

		String[] array = { "Hello", "Alaska", "Dad", "Peace" };

		System.out.println(findWords(array));

	}

}
