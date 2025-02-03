import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get integer input from the user
        int number = scanner.nextInt();
        int sum = 0;

        // Loop to calculate the sum of digits
        int temp = number;
        while (temp != 0) {
            sum += temp % 10;  // Add each digit to the sum
            temp /= 10;        // Remove the last digit
        }

        // Check if the number is divisible by the sum
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }

        scanner.close();
    }
}
