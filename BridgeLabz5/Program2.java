import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get integer input from the user
        int number = scanner.nextInt();
        int count = 0;

        // Loop to count the number of digits
        while (number != 0) {
            number /= 10;  // Remove the last digit
            count++;       // Increment count
        }

        // Output: Number of digits
        System.out.println("The number has " + count + " digits.");

        scanner.close();
    }
}
