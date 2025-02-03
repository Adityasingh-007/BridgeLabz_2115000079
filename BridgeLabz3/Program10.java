import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double number;

        while ((number = input.nextDouble()) != 0) {
            total += number;
        }

        System.out.println("The total sum is " + total);
    }
}
