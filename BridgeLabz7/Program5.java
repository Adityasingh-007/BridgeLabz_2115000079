import java.util.Scanner;

class Program5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] digits = new int[10];
        int index = 0;

        // Extract digits
        while (number != 0) {
            if (index == digits.length) {
                // Increase array size
                int[] temp = new int[digits.length * 2];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index++] = number % 10;
            number /= 10;
        }

        // Display reversed number
        System.out.print("Reversed Number: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}
