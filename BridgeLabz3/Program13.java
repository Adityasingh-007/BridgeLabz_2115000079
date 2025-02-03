import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner Inputt = new Scanner(System.in);
        int n = Inputt.nextInt();

        if (n < 0) {
            System.out.println("The number is not a natural number");
            return;
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        int formulaSum = n * (n + 1) / 2;

        System.out.println("Sum using for loop: " + sum);
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Both results match: " + (sum == formulaSum));
    }
}
