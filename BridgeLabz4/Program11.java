import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number
        int number = scanner.nextInt();

        // Loop to find factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i); // Print factor
            }
        }

        scanner.close();
    }
}
