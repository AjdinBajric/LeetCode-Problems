
public class SumOfTwoIntegers {

	public static int getSum(int a, int b) {
		if (b == 0) {
			return a;
		}
		int sum, carry;
		sum = a ^ b;
		carry = (a & b) << 1;
		return getSum(sum, carry);//
	}

	public static void main(String[] args) {

		System.out.println(getSum(4, 3));

	}

}
