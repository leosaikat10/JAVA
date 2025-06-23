

import java.util.Scanner;

public class add {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the first number");
    Integer a = scanner.nextInt();

    System.out.println("Enter the second number");
    Integer b = scanner.nextInt();

   Integer add = a + b ;
    
    System.out.println("The sum of two numbers is :" +add);
  }
  
}
