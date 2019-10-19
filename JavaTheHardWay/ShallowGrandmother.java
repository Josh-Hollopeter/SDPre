import java.util.Scanner;

public class ShallowGrandmother {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int age, happy;
    double income, cute;
    boolean allowed, allowed2;

    System.out.print( "Enter your age: " );
    age = keyboard.nextInt();

    System.out.print( "Enter your yearly income: " );
    income = keyboard.nextDouble();

    System.out.print( "How cute are you, on a scale from 0 to 10? ");
    cute = keyboard.nextDouble();

    System.out.print( "How happy do you make them? On a scale from 0 to 10");
    happy = keyboard.nextInt();

    allowed = ( age > 25 && age < 40 && (income > 50000 || cute >= 8 ));
    allowed2 = ( (happy > 7) && age > 25 && age < 40);

    System.out.println( "Allowed to date my grandchild? " + allowed );
    System.out.println( "Allowed to date my grandchild? Grandma 2 says " + allowed2 );
    



  }
}
