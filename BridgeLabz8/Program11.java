import java.util.Scanner;

class Program11 {
    // Method to calculate wind chill
    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + (0.6215 * temperature) + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature and wind speed
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter the wind speed in mph: ");
        double windSpeed = scanner.nextDouble();

        if (windSpeed <= 0) {
            System.out.println("Wind speed must be greater than zero.");
            return;
        }

        // Calculate and display wind chill
        Program11 calculator = new Program11();
        double windChill = calculator.calculateWindChill(temperature, windSpeed);
        System.out.printf("The wind chill temperature is: %.2f°F\n", windChill);
    }
}
