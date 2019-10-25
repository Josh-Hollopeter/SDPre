import java.io.PrintWriter;
import java.util.Scanner;

public class ReceiptRevisited {
  public static void main ( String[] args ) throws Exception {
    PrintWriter fileout = new PrintWriter("receipt.txt");
    double gal = 0 , ppg = 3.459, tot =0;
    Scanner input = new Scanner(System.in);
    System.out.println("Gas costs $ 3.459 per gallon.");
    System.out.print("How many gallons do you want? ");
    gal = input.nextDouble();
    tot = ppg * gal;
    System.out.println("Total cost:  $ " +tot + "\n\n" );
    System.out.print("Writing customized receipt to 'receipt.txt' ... ");



    fileout.println("+-------------------------------------+");
    fileout.println("|                                     |");
    fileout.println("|            CORNER STORE             |");
    fileout.println("|                                     |");
    fileout.println("|  2014-06-05        04:38PM          |");
    fileout.println("|                                     |");
    fileout.println("|  Gallons:         "+gal+"            ");
    fileout.println("|  Price/gallon:      $ 3.459         |");
    fileout.println("|                                     |");
    fileout.println("|  Fuel total:        $"+tot+"         ");
    fileout.println("|                                     |");
    fileout.println("+-------------------------------------+");
    fileout.close();
    System.out.print("done.\n");
  }
}
