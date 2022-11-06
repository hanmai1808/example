package homework;

public class Roman {
	public static void main(String[] args) {

		String romanNumber = "MCMXC";
		int result = 0;
		System.out.println(romanToInt(romanNumber));
	}

	private static int romanToInt(String romanNumber) {
		int result = 0;
		int lastNumber =0;
		for (int i = romanNumber.length() - 1; i >= 0; i--) {
			int intValueAtIndexI = valueOfLetter(romanNumber.charAt(i));
			if (intValueAtIndexI < lastNumber) {
				result = result - intValueAtIndexI;
			} else {
				result = result + intValueAtIndexI;
				lastNumber = intValueAtIndexI;
			}
		}
		return result;

	}
	public static int valueOfLetter(char letter) {
		switch (letter) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}

}
//O(n)
