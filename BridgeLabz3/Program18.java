import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Scanner Inputt = new Scanner(System.in);
        int number = Inputt.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
