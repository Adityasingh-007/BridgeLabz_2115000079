import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Numm1 = input.nextInt();
        int Numm2 = input.nextInt();
        int Numm3 = input.nextInt();

        boolean ans1 = (Numm1 > Numm2) && (Numm1 > Numm3);
        boolean ans2 = (Numm2 > Numm1) && (Numm2 > Numm3);
        boolean ans3 = (Numm3 > Numm1) && (Numm3 > Numm2);

        System.out.println("Is the first number the largest? " + ans1);
        System.out.println("Is the second number the largest? " + ans2);
        System.out.println("Is the third number the largest? " + ans3);
    }
}
