
public class MainDay3 {
	public static void main(String[] args) {
		char grade = 'A';
		switch (grade) {
		case 'A': {
			System.out.println("good student");
			break;
		}
		// out ra khoai case A
		case 'B': {
			System.out.println("gFairly good student");
			break;
		}
		default:
			System.out.println("Default Student");
		}
	}
}
