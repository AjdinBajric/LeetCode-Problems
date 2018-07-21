import java.util.Scanner;

public class AddDigits {

	 public static int suma(int a){
	 int broj=a;
	 while(broj/10!=0){
		 broj=sumOfDigits(broj);
	 }
	 return broj;
	 }

	public static int sumOfDigits(int a) {
		int sum = 0;
		
		while (a > 0) {
			sum += (a % 10);
			a /= 10;
		}

		return sum;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		System.out.println(suma(a));
	}

}
