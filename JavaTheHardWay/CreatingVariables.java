public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, page;
		double seconds, e, checking, moose;
		String firstName, lastName, title, horse, goose;
		
		x = 10;
		y = 400;
		age = 39;
		page = 6;
		
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		moose = 4.37;
		
		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		horse = "pony";
		goose = "goosey";
		
		System.out.println( "The variable x contains " + x);
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e);
		System.out.println( "Hopefully you have more than $" + checking + "!");
		System.out.println( "My name's " + title + " " + firstName + lastName );
		System.out.println( "My " + horse + " " + goose + " is on page " + page +  " of war and peace " + goose + " is " + moose + " years old");
	}
}