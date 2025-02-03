import java.util.Scanner;

class Program7 {
    public int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        Program7 sumCalculator = new Program7();
        int sum = sumCalculator.calculateSum(n);

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
