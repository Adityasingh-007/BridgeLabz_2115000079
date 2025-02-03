import java.util.Scanner;

class Program12 {
    // Method to calculate sine, cosine, and tangent
    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        // Calculate and display trigonometric values
        Program12 calculator = new Program12();
        double[] results = calculator.calculateTrigonometricFunctions(angle);

        System.out.printf("Sine of %.2f°: %.4f\n", angle, results[0]);
        System.out.printf("Cosine of %.2f°: %.4f\n", angle, results[1]);
        System.out.printf("Tangent of %.2f°: %.4f\n", angle, results[2]);
    }
}
