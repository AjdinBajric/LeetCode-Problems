
public class RotateString {

    public static boolean rotateString(String A, String B) {
    	
        return A.length() == B.length() && (A + A).contains(B);
        
        /*
         * All rotations of A are contained in A+A. Thus, we can simply check whether B is a substring of A+A. 
         * We also need to check A.length == B.length, otherwise we will fail cases like A = "a", B = "aa".
         */
    }
	
	public static void main(String[] args) {
		
		System.out.println(rotateString("abcde", "cdeab"));

	}

}
