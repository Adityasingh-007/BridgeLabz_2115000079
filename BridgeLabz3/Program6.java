import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner Inputtt = new Scanner(System.in);
        int Numm1 = Inputtt.nextInt();

        if (Numm1 > 0) {
            System.out.println("Positive");
        } else if (Numm1 < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
