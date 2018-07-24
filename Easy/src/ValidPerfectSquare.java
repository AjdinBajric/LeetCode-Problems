
public class ValidPerfectSquare {

    public static boolean isPerfectSquare(int num) {
        
    	int sqrtI = (int) Math.sqrt(num);
    	double sqrt=Math.sqrt(num);
    	double real_sqrt=(double) sqrtI;
    	
    	if(sqrt==real_sqrt)return true;
    	else return false;
    	
    }
	
	public static void main(String[] args) {
		
		// first test case
		System.out.println(isPerfectSquare(16));
		
		// second test case
		System.out.println(isPerfectSquare(14));

	}

}
