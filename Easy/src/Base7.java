
public class Base7 {

	public static String convertToBase7(int num) {
        if(num == 0) return "0";
        int n=num;
        if(num < 0)
            n *=-1;
        StringBuilder sb = new StringBuilder();
        while(n != 0){
            sb.append(n%7);
            n /= 7;
        }
        if(num < 0)
            sb.append("-");
        return sb.reverse().toString();
    }
	
	public static void main(String[] args) {
		
		System.out.println(convertToBase7(100));

	}

}
