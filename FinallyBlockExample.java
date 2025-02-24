import java.util.*;

public class FinallyBlockExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers for division:");
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Performing division...");
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("Operation completed");
        }
    }
}
