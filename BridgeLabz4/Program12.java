import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number
        int number = scanner.nextInt();

        // Loop to find multiples
        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i); // Print multiple
            }
        }

        scanner.close();
    }
}
