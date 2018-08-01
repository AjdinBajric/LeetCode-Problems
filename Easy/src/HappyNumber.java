
public class HappyNumber {

    public static boolean isHappy(int n) {
        if(n<10){
            return n==1 || n==7;
        }
        int sum = 0;
        while(n!= 0){
            int digit = n%10;
            sum += (digit*digit);
            n=n/10;
        }
        return isHappy(sum);
    }
	
	public static void main(String[] args) {
		
		System.out.println(isHappy(45));

	}

}
