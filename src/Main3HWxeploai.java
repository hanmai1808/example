import java.util.Scanner;

public class Main3HWxeploai {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input Math");
		double math = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Please input English");
		double eng = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Please input Literature");
		double lite = scanner.nextDouble();
		scanner.nextLine();
		double calGPA = calAverage(math, eng, lite);

		System.out.println(calGPA);

		double min = Math.min(math, Math.min(eng,lite));
		

		if (((int) calGPA - (int) min) >= 1) {
			min = min + 1;
		}
		if (min < 5) {
			System.out.println("fail student");
		} else if (min < 6) {
			System.out.println("not bad student");
		} else if (min < 7) {
			System.out.println("average Student");
		} else if (min < 8) {
			System.out.println("normal Student");
		} else if (min< 9) {
			System.out.println("good Student");
		} else {
			System.out.println("excellent student");
		}
	}

	public static double calAverage(double num1, double num2, double num3) {
		double result = (Math.round((num1 + num2 + num3) / 3 * 100.00)) / 100.00;
		return result;
	}

}
