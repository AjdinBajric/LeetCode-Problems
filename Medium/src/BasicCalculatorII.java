
public class BasicCalculatorII {

    public static int calculate(String s) {
        int prev = 0, ans = 0;
        char op = '+';
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == ' ') continue;
            if (Character.isDigit(c)) {
                int num = c - '0';
                
                while (i+1 < s.length() && Character.isDigit(s.charAt(i+1))) {
                    num = num * 10 + (s.charAt(i+1) - '0');
                    i++;
                }
                
                if (op == '+') {
                    ans += num;
                    prev = num;
                } else if (op == '-') {
                    ans -= num;
                    prev = -num;
                } else if (op == '*') {
                    ans = ans - prev + prev * num;
                    prev = prev * num;
                } else {
                    ans = ans - prev + prev / num;
                    prev = prev / num;
                }
            } else {
                op = c;
            }
        }
        
        return ans;
    }
	
	
	public static void main(String[] args) {
		
		//first test case
		System.out.println(calculate(" 3*5 + 2 "));

		//second test case
		System.out.println(calculate("3+2*2"));
	}

}
