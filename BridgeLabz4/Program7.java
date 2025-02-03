import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Weight in kg and height in cm
        double weight = scanner.nextDouble(); // Weight in kilograms
        double heightCm = scanner.nextDouble(); // Height in centimeters

        // Convert height from cm to meters
        double heightMeters = heightCm / 100.0;

        // Calculate BMI using the formula
        double bmi = weight / (heightMeters * heightMeters);

        // Output the BMI and weight status
        System.out.printf("The BMI is %.2f%n", bmi);

        // Determine weight status based on BMI value
        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Weight Status: Normal weight");
        } else if (bmi >= 25 && bmi <= 39.9) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obesity");
        }

        scanner.close();
    }
}
