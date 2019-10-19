import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi, i, f, lbs;
		
		System.out.print( "Your height (feet only): " );
		f = keyboard.nextDouble();
		System.out.print( "Your height (inches only)");
		i = keyboard.nextDouble();
		i += f * 12; 
		m = i * 0.0254;
		
		System.out.print( "Your weight in lbs: " );
		lbs = keyboard.nextDouble();
		kg = lbs * 0.454;
		
		bmi = kg / (m*m);
		
		System.out.println( "Your BMI is " + bmi);
	
	}
}