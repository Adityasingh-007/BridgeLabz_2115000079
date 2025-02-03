import java.util.Scanner;

class Program4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initial array to store digits and initial size
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits
        while (number != 0) {
            // If index equals maxDigit, increase array size
            if (index == maxDigit) {
                maxDigit += 10; // Increase the size by 10
                int[] temp = new int[maxDigit]; // Create a larger array
                System.arraycopy(digits, 0, temp, 0, digits.length); // Copy old data
                digits = temp; // Assign the new array to digits
            }

            digits[index++] = number % 10; // Store the last digit
            number /= 10; // Remove the last digit from the number
        }

        // Find largest and second largest digit
        int largest = 0, secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    }
}
