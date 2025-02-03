import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the base number and power
        int number = scanner.nextInt();
        int power = scanner.nextInt();

        // Initialize result
        int result = 1;

        // Loop to calculate the power
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result by the number
        }

        // Output the result
        System.out.println(number + " raised to the power of " + power + " is " + result + ".");

        scanner.close();
    }
}
