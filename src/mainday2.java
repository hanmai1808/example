import java.util.Scanner;

public class mainday2 {
	public static void main(String []args){
	Scanner keyboard = new Scanner(System.in);
	
//	System.out.println("what is your name");
//	String name = keyboard.nextLine();
//	
//	System.out.println("what is your age");
////	int age = Integer.parseInt(keyboard.nextLine());
//	int age =keyboard.nextInt();
////18 Enter "" gan vo food
//	keyboard.nextLine();
//	
//	System.out.println("what is your favorite fruit");
////	nextInt?? nextLong? nextDouble
//	String fruit =keyboard.nextLine();
//	System.out.println("name:"+ name);
//	System.out.println("age: "+ age);
//	System.out.println("fruit: " +fruit);
//	function name cmsqrt . parameter double num1  double num 2. Return double	

	System.out.println("Nhap so dau tien");
	double number1= keyboard.nextDouble();
	System.out.println("Nhap so thu hai di");
	double number2= keyboard.nextDouble();
	System.out.println("Nhap so thu ba di");
	double number3= keyboard.nextDouble();

	double result = cmaverage (number1,number2, number3);
	System.out.println("trung binh cua tong la " + result);
	

	}
	public static double cmaverage(double num1, double num2, double num3)
	{
    double result = (num1+ num2 + num3)/3;
	return result;
	
	
	}
}
