import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        Scanner Inputt = new Scanner(System.in);
        double salary = Inputt.nextDouble();
        int ans = Inputt.nextInt();

        if (ans > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus for less than 5 years of service.");
        }
    }
}
