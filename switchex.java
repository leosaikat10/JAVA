import java.util.Scanner;
public class switchex {
  public static void main (String []args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the no. to find the working day:");
    Integer day = scanner.nextInt();
    switch(day){
      case 1 :
      System.out.println("Monday");
      break;
      case 2:
      System.out.println("Tuesday");
      break;
      case 3:
      System.out.println("Wednesday");
      break;
      case 4:
      System.out.println("Thursday");
      break;
      case 5:
      System.out.println("Friday");
      break;
      default:
      System.out.println("Invalid Input");
    }
  }
}
  

