import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number
        int number = scanner.nextInt();
        int greatestFactor = 1; // Initialize greatest factor as 1

        // Loop to find the greatest factor
        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0) { // Check if 'i' is a factor of the number
                greatestFactor = i;
                break; // Exit the loop once the greatest factor is found
            }
        }

        // Output the greatest factor
        System.out.println("The greatest factor of " + number + " besides itself is " + greatestFactor + ".");

        scanner.close();
    }
}
