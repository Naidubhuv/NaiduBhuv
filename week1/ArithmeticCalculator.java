import java.util.Scanner;
public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Arithmetic Calculator!");
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        double result = 0;
        if(choice == 1) {
            result = num1 + num2;
        } else if(choice == 2) {
            result = num1 - num2;
        } else if(choice == 3) {
            result = num1 * num2;
        } else if(choice == 4) {
            if(num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed!");
                System.exit(0);
            }
        } else {
            System.out.println("Error: Invalid choice!");
            System.exit(0);
        }
        System.out.println("Result: " + result);
        scanner.close();
    }
}
