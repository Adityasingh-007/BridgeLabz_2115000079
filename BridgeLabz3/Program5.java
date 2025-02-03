import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner Inputtt = new Scanner(System.in);
        int AgE = Inputtt.nextInt();

        if (AgE >= 18) {
            System.out.println("The person's age is " + AgE + " and can vote.");
        } else {
            System.out.println("The person's age is " + AgE + " and cannot vote.");
        }
    }
}
