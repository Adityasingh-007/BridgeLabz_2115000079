import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputt = input.nextInt();

        if (inputt >= 0) {
            int sum = inputt * (inputt + 1) / 2;
            System.out.println("The sum of " + inputt + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + inputt + " is not a natural number");
        }
    }
}
