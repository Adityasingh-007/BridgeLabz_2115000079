import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner Inputtt = new Scanner(System.in);
        int Monthh = Inputtt.nextInt();
        int day = Inputtt.nextInt();

        boolean Temp = (Monthh == 3 && day >= 20) || (Monthh == 6 && day <= 20) || (Monthh > 3 && Monthh < 6);

        if (Temp) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
