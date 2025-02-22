import java.util.Scanner;

public class NestedTryCatchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50}; // Sample array
        
        try {
            // Taking index input
            System.out.print("Enter array index: ");
            int index = scanner.nextInt();
            
            try {
                // Accessing the array element
                int element = numbers[index];

                // Taking divisor input
                System.out.print("Enter divisor: ");
                int divisor = scanner.nextInt();

                // Performing division
                int result = element / divisor;
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        } finally {
            scanner.close(); // Closing the scanner to prevent resource leaks
        }
    }
}