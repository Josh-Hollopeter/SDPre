import java.util.Scanner;

public class EnterPIN {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String pass,input;

    pin = 12345;
    pass = "moo";

    System.out.println("HELLO VALUED CUSTOMER.");
    System.out.println("ENTER YOUR PASSWORD: ");
    input = keyboard.nextLine();



    while ( ! pass.equals(input)) {
      System.out.println("\nBAD PASSWORD. TRY AGAIN. ");
      System.out.print("ENTER YOUR PASSWORD(CORRECTLY THIS TIME,OR...): ");
      input = keyboard.nextLine();
    }





    System.out.println("WELCOME TO THE BANK OF JAVA, USER 67429.");
    System.out.println("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while ( entry != pin ) {
      System.out.println("\nINCORRECT PIN. TRY AGAIN. ");
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }

    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
  }
}
