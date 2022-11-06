import java.util.Scanner;
public class Main3HWPrime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input number to check if it is Prime");
		int num = scanner.nextInt();
		boolean result = isPrime(num);
		System.out.println(result);
		
	}

	public static boolean isPrime(int num) {
		boolean result = false;
		int k = 0;
		for (int i = 1; i <= num; i++) {
			
			if (num % i == 0) {
				k++;
			}
		}
		if (k <= 2) {

			result = true;
		} else {
			result = false;
		}

		return result;
	}
}
