import java.util.Scanner;

public class Mainday2a {
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int height = 0;
		boolean isValid =false;
		double doubleHeight;
		while (!isValid) {
			System.out.print("What is your height in centimeter?");
			if(!input.hasNextDouble()) {
				System.out.print(" not a number");
				input.next();
				continue;
			} 
			if (!input.hasNextDouble()) {
				doubleHeight= input.nextDouble();
				height = (int) doubleHeight;
			} else {
			height=input.nextInt();
			}
			if(height<50||height>300) {
				input.nextLine();
				System.out.print(" out of range 50-300");
			} else {
				System.out.print("data is valid");
				input.nextLine();
				isValid=true;
				
			}
		}
	}
	}
			
					
			
			