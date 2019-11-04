import java.util.Scanner;

public class Triangles {
  public static void main(String[] args) {
    double [] sides = new double [3];
    boolean isosceles, equilateral,scalene;
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the three sides of your triangle, one at a time");
    sides[0] = input.nextDouble();
    System.out.println("next");
    sides[1] = input.nextDouble();
    System.out.println("Now the final side");
    sides[2] = input.nextDouble();

    if (sides[0] == sides[1] && sides[2] == sides[0]) {
      System.out.println("Your triangle is Equilateral");
    }
    else if (sides[0] != sides[1] && sides[1] != sides[2] && sides[2] != sides[0]){
      System.out.println("Your triangle is Scalene");
    }
    else {
    System.out.println("Your triangle is Isosceles");
    }

  }
}
