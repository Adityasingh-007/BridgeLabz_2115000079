import java.util.Scanner;

class Program4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Input numbers until 0 or negative
        while (index < numbers.length) {
            System.out.print("Enter a number: ");
            double num = input.nextDouble();

            if (num <= 0) {
                break;
            }

            numbers[index++] = num;
        }

        // Calculate and display total
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        System.out.println("The sum of all numbers is: " + total);
        input.close();
    }
}
