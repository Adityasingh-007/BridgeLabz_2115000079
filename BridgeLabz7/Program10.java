import java.util.Scanner;

public class Program10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Find digits and store them in an array
        String numberString = Integer.toString(Math.abs(number)); // Convert the number to a string for easier digit access
        int[] digits = new int[numberString.length()];

        for (int i = 0; i < numberString.length(); i++) {
            digits[i] = numberString.charAt(i) - '0'; // Convert each character to an integer
        }

        // Step 3: Initialize a frequency array of size 10
        int[] frequency = new int[10];

        // Step 4: Count the frequency of each digit
        for (int digit : digits) {
            frequency[digit]++;
        }

        // Step 5: Display the frequency of each digit
        System.out.println("Digit frequencies in the number:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        sc.close();
    }
}
