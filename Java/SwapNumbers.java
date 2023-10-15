import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

      // Different ways for swapping numbers in java uncomment each set and execute respectively.
        // Swap the numbers without using a temporary variable
        // num1 = num1 + num2;
        // num2 = num1 - num2;
        // num1 = num1 - num2;

      // Using a temporary variable:
        // int temp = num1;
        // num1 = num2;
        // num2 = temp;
      //Using bitwise XOR operator:
        // num1 = num1 ^ num2;
        // num2 = num1 ^ num2;
        // num1 = num1 ^ num2;

      //Using multiplication and division:
        // num1 = num1 * num2;
        // num2 = num1 / num2;
        // num1 = num1 / num2;


      
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

        scanner.close();
    }
}
