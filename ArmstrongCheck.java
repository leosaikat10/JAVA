import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;

        // Count digits
        int temp = num;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Calculate Armstrong sum
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }

        // Result
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        sc.close();
    }
}
