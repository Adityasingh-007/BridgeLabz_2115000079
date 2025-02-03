import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Sca5nner(System.in);

        // Input: Command-line arguments for month, day, and year
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();

        // Gregorian Calendar Formula
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + 31 * m0 / 12) % 7;

        // Output: Day of the week
        System.out.println("Day of the week is: " + d0);

        scanner.close();
    }
}
