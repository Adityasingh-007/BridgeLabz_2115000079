import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        Scanner Inputt = new Scanner(System.in);
        int number = Inputt.nextInt();

        if (number < 0) {
            System.out.println("Invalid input. Factorial is not defined for negative numbers.");
            return;
        }

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
