import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Numm1 = input.nextInt();

        int Numm2 = input.nextInt();

        int Numm3 = input.nextInt();

        boolean ans = (Numm1 < Numm2) && (Numm1 < Numm3);

        System.out.println("Is the first number the smallest? " + ans);
    }
}
