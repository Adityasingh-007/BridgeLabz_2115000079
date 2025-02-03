import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
         Scanner Inputt = new Scanner(System.in);
        int n = Inputt.nextInt();

        if (n < 0) {
            System.out.println("The number is not a natural number");
            return;
        }

        int sum = 0, i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }

        int formulaSum = n * (n + 1) / 2;

        System.out.println("Sum using while loop: " + sum);
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Both results match: " + (sum == formulaSum));
    }
}
