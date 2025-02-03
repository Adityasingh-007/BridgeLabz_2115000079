import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get integer input from the user
        int number = scanner.nextInt();
        int sum = 0;

        // Loop to find the sum of divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {  // Check if i is a divisor
                sum += i;          // Add the divisor to sum
            }
        }

        // Check if the sum is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        scanner.close();
    }
}
