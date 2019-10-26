import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class CaesarCipher {
  /**
   * Returns the character shifted by the given number of letters.
   */
   public static char shiftLetter( char c, int n) {
     int u = c;

     if (! Character.isLetter(c) )
      return c;

      u = u + n;
      if (Character.isUpperCase(c) && u > 'Z'
      || Character.isLowerCase(c) && u > 'z') {
        u -= 26;
      }
      if (Character.isUpperCase(c) && u < 'A'
      || Character.isLowerCase(c) && u < 'a') {
        u +=26;
      }

      return (char)u;
   }
   public static void main(String [] args ) throws Exception {
     Scanner keyboard = new Scanner(System.in);
     String plaintext = "w", cipher = "",file = "CaesarText.txt";
     String Coded_f = "Coded.txt";
     int shift;

     System.out.print("Welcome to file encryption software ver 0.2: ");
     System.out.print("Enter a number to Shift letters by (0-26): ");
     shift = keyboard.nextInt();


     File f = new File(file);
     Scanner file_read = new Scanner(f);
     while (file_read.hasNext()) {
      plaintext += file_read.nextLine();
    }
     file_read.close();


     for (int i = 0; i<plaintext.length(); i++) {
       cipher +=shiftLetter ( plaintext.charAt(i), shift );
     }
     PrintWriter out = new PrintWriter(Coded_f);
      out.println(cipher);
     out.close();
     System.out.println("Completed succesfully: Saved to Coded.txt");
   }
}
