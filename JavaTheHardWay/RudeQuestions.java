import java.util.Scanner;

public class RudeQuestions {
	public static void main( String [] args ){
		String name, farts;
		int age;
		double weight, income;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Hello. What is your name? ");
		name = keyboard.next();
		
		System.out.print( "Hi, " + name + "! How old are you? ");
		age = keyboard.nextInt();
		
		System.out.println( " S0 you're " + age + ", eh? That's not very old");
		System.out.println( " How much do you weigh, " + name + "? ");
		weight = keyboard.nextDouble();
		
		System.out.println( weight + "! Better keep that quiet!!" );
		System.out.print("Finally, what's yor income, " + name + "? ");
		income = keyboard.nextDouble();
		
		System.out.print( "Hopefully that is " + income + " per hour");
		System.out.println( " and not per year!");
		 
		 
		System.out.print( " Do your farts smell like chocolate cake?");
		farts = keyboard.next();
		System.out.println( farts + "? Well maybe you should have that checked out?");
		System.out.print( "Well, thanks for answering my rude questions, ");
		System.out.println( name + ".");
	
	// integer instead of double works fine. Probably because it adds a .0
	// Integer for a string is fine because sentences can have numbers in them
	//I can blow up any number question with a string
	//I was able to blow up the string question with lots of space between each letter.
	
	}
}