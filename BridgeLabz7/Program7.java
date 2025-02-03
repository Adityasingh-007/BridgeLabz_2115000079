import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: Number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

        // 2D array to store height, weight, and BMI
        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];

        // Input: Weight and height for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            personData[i][0] = input.nextDouble();
            while (personData[i][0] <= 0) {
                System.out.print("Height must be positive. Enter again: ");
                personData[i][0] = input.nextDouble();
            }

            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            personData[i][1] = input.nextDouble();
            while (personData[i][1] <= 0) {
                System.out.print("Weight must be positive. Enter again: ");
                personData[i][1] = input.nextDouble();
            }

            // Calculate BMI and store in the 2D array
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Output: Height, weight, BMI, and status for each person
        System.out.println("\nPerson Details:");
        System.out.printf("%-10s %-10s %-10s %-20s\n", "Height", "Weight", "BMI", "Weight Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-20s\n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
