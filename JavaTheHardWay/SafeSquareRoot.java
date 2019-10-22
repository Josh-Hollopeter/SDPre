import java.util.Scanner;

public class SafeSquareRoot {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double x,y;
    String yes;


    System.out.println("Are you ready?!?(Type YES! to continue)");
    yes = keyboard.nextLine();

    while(!yes.equals("YES!")){
      if (yes.equals("yes!")){
        System.out.println("LOUDER");
      }
      else{
        System.out.println("TRY AGAIN,YOU'RE NOT EXCITED ENOUGH");
      }
      yes = keyboard.nextLine();
    }



    System.out.print("Give me a number, and I'll find it's square root. ");
    System.out.print("(No negatives, please)");
    x = keyboard.nextDouble();

    while( x<0) {
      System.out.println("I won't take the square root of a negative.");
      System.out.print("\nNew number: ");
      x = keyboard.nextDouble();
    }
    y = Math.sqrt(x);
    System.out.println("The square root of "+x+" is "+y);
  }
}
