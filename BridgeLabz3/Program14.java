import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        
		Scanner Inputt = new Scanner(System.in);
        int Numm = Inputt.nextInt();

        if (Numm < 0) {
            System.out.println("Invalid input. Factorial is not defined for negative Numms.");
            return;
        }

        int factorial = 1, i = 1;
        while (i <= Numm) {
            factorial *= i;
            i++;
        }

        System.out.println("The factorial of " + Numm + " is " + factorial);
    }
}
