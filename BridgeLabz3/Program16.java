import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Scanner Inputt = new Scanner(System.in);
        int number = Inputt.nextInt();

        if (number < 1) {
            System.out.println("The number is not a natural number");
            return;
        }

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }
}
