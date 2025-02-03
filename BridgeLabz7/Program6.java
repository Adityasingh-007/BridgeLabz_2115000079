import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: Number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

        // Arrays to store height, weight, BMI, and weight status
        double[] height = new double[numberOfPersons];
        double[] weight = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];

        // Input: Weight and height for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            height[i] = input.nextDouble();
            while (height[i] <= 0) {
                System.out.print("Height must be positive. Enter again: ");
                height[i] = input.nextDouble();
            }

            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weight[i] = input.nextDouble();
            while (weight[i] <= 0) {
                System.out.print("Weight must be positive. Enter again: ");
                weight[i] = input.nextDouble();
            }

            // Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status
            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi[i] < 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Output: Height, weight, BMI, and status for each person
        System.out.println("\nPerson Details:");
        System.out.printf("%-10s %-10s %-10s %-20s\n", "Height", "Weight", "BMI", "Weight Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-20s\n", height[i], weight[i], bmi[i], weightStatus[i]);
        }
    }
}
