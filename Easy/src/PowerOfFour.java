public class PowerOfFour {

	public static boolean isPowerOfFour(int num) {
		return ((num > 0) && (((num) & (num - 1)) == 0) && (715827882 & num) == 0);
	}

	public static void main(String[] args) {

		System.out.println(isPowerOfFour(5));

	}

}

/*
 * 
 * 
 * Explanation of each conditions:
 * 
 * n > 0 - self explanatory ( ( num ) & ( num-1 ) ) == 0 - This is to check if
 * the number num is a power of 2. ( 715827882 & num ) == 0 Consider the
 * following powers of 4 and their binary representations: 1 - 0000001 4 -
 * 0000100 16 - 0010000 64 - 1000000 We can see that the numbers with any one
 * odd position set in binary representation are powers of 4. So, using this
 * principal, we create a number (MASK) where all even bits are set and check if
 * the AND of given number and MASK is 0. The MASK comes out to be: 715827882 (
 * ....010101010101010 ).
 */
