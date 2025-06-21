import java.util.Scanner;

public class first {
  public static void main(String[] args) {
     Scanner scanner= new Scanner(System.in);
    
     System.out.println("Enter your name ");
     String name = scanner.nextLine();

     System.out.println("Enter your age :");
     Integer age= scanner.nextInt();

    System.out.println("Hello "+name);
    System.out.println("Your age is :"+age);
    scanner.close(); 
 
  }
}