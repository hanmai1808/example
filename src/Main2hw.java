import java.util.Scanner;
public class Main2hw {
	public static void main(String []args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please input weight by kg");
	double numweight = scanner.nextDouble();
	double weight2;
	scanner.nextLine();
	if ((Math.round(numweight)!=numweight)||numweight<10||numweight>500)	
	{do {
		System.out.println("Please reinput the weight. Stupid");
    weight2=scanner.nextDouble();
	}
	while ((Math.round(weight2)!=weight2)||weight2<10||weight2>500);
	
	}
	else {weight2 = numweight;}
	
	System.out.println("Please input height by cm");
	double numheight = (scanner.nextDouble());
	double height2;
	if ((Math.round(numheight)!=numheight)||numheight<50||numheight>300)	
	{do {
		System.out.println("Please reinput the height. Stupid");
    height2=scanner.nextDouble();
	}
	while ((Math.round(height2)!=height2)||height2<10||height2>500);
	
	}
	
	else {height2 = numheight;}
	
	double result = CalBMI (weight2,height2/100);
	if (result <18.5)
	{System.out.println("You are Underweight");}
	else if (result<25)
	{System.out.println("You are Normal");}
	else if (result<30)
	{System.out.println("You are Overweight");}
	else {System.out.println("You are Obesity");}

	System.out.println("Your BMI is "+ result);
	
	}
	public static double CalBMI (double num1, double num2)
	{ double resultBMI= (Math.round(100*num1/(num2*num2)));
		return resultBMI/100;
	}
}
