
public class ReverseInteger {

    public static int reverse(int x) {
        try{
            boolean isNeg = (x<0);
            if(isNeg){x=Math.abs(x);}  // Get rid of the negative sign
            String num = "";
            while(x!=0){
                num += String.valueOf(x%10);  // Add string value of the last digit to the result
                x=x/10;  // Chop the last digit off of the int
            }
            if(isNeg){num = "-"+num;}  // If the input was negative reattach the sign
            return Integer.parseInt(num);  // Parse the string for the int value
        }
        // If integer is out of range: [−231,  231 − 1] return 0
        catch(Exception e){
            return 0;
        }
    }
	
	public static void main(String[] args) {
		
		System.out.println(reverse(-120));

		System.out.println(reverse(451));
	}

}
