package homework;

public class square {
	public static void main(String[] args) {
		int number = 50;

		System.out.println("can bac hai cua " + number + " la " + getSquare(number));

	}

	private static double getSquare(int number) {
		double midValue;
		double result = number / 2;
		do {
			midValue = result;
			result = Math.round(100.00*(midValue + number / midValue) / 2)/100.00;
		} while (midValue != result);
		return result;
	}

}
//O(n)
