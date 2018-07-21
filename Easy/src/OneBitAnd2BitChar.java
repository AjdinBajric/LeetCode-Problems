
public class OneBitAnd2BitChar {

	public static boolean isOneBitCharacter(int[] bits) {
		int i = bits.length - 2;
		while (i >= 0 && bits[i] > 0)
			i--;
		return (bits.length - i) % 2 == 0;
	}

	public static void main(String[] args) {

		//test case 1
		int [] bits = {1, 1, 1, 0};
		System.out.println(isOneBitCharacter(bits));
		
		//test case 2
		int [] bits2={1, 0, 0};
		System.out.println(isOneBitCharacter(bits2));
	}

}
