import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;

        // While loop to calculate the sum of cubes of each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10;  // Find the last digit
            sum += Math.pow(digit, 3);        // Cube the digit and add to sum
            originalNumber /= 10;             // Remove the last digit
        }

        // Check if the original number and the sum are the same
        if (number == sum) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
