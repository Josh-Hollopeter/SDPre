import java.util.Scanner;

public class BMICategories {
  public static void main( String [] args) {
    Scanner keyboard = new Scanner(System.in);
    double bmi,weight,meters;
    int feet,inches;

    System.out.print( "Enter your height (feet only): ");
    feet = keyboard.nextInt();
    System.out.print( "Now enter the inches: ");
    inches = keyboard.nextInt();
    inches += feet * 12;
    meters = inches * 0.0254;
    System.out.print( "Your weight in lbs: ");
    weight = keyboard.nextDouble();
    weight = weight * 0.454;
    bmi = weight / (meters * meters);

    System.out.print( "BMI category: ");
    if ( bmi < 15.0 ) {
      System.out.println("very severely underweight" );
    }
    else if ( bmi <= 16.0 ) {
      System.out.println( "severely underweight");
    }
    else if ( bmi < 18.5 ) {
      System.out.println( "underweight" );
    }
    else if ( bmi < 25.0 ) {
      System.out.println( "normal weight" );
    }
    else if ( bmi < 30.0 ) {
      System.out.println( "overweight" );
    }
    else if ( bmi < 35.0 ) {
      System.out.println( "moderately obese");
    }
    else if ( bmi < 40.0 ) {
      System.out.println( "severely obese" );
    }
    else {
      System.out.println( "very severely/\"morbidly\" obese");
    }
  }
}
