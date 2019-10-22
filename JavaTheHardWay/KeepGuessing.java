import java.util.Scanner;

public class KeepGuessing {
  public static void main( String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int secret,guess;

    secret = 1 +(int)(Math.random()*10);

    System.out.println("I have chosen a random number between 1 and 10.\nTry to guess it \n");
    System.out.print("Your guess: ");
    guess = keyboard.nextInt();

    while (secret != guess) {
      if (guess > secret){
        System.out.println("You guessed too high");
      }
      if (guess < secret){
        System.out.println("You guessed too low");
      }
    System.out.print("Guess again: ");
    guess = keyboard.nextInt();
    }
    System.out.println( "That's right! You're a genius.");
  }
}
